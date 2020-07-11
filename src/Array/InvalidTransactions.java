package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Leetcode Practice: #1169. Invalid Transactions
 * 
 * A transaction is possibly invalid if:
 * 		the amount exceeds $1000, or;
 * 		if it occurs within (and including) 60 minutes of another transaction with the same name in
 * 		a different city.
 * 
 * Each transaction string transactions[i] consists of comma separated values representing the
 * name, time (in minutes), amount, and city of the transaction.
 * 
 * Given a list of transactions, return a list of transactions that are possibly invalid.  You may
 * return the answer in any order.
 * 
 * Example 1:
 * 	Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
 *  Output: ["alice,20,800,mtv","alice,50,100,beijing"]
 *  Explanation: 
 *  The first transaction is invalid because the second transaction
 *  occurs within a difference of 60 minutes, have the same name and is in a
 *  different city. Similarly the second one is invalid too.
 * 
 * Example 2:
 * 	Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
 *  Output: ["alice,50,1200,mtv"]
 *  
 * Example 3:
 * 	Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
 *  Output: ["bob,50,1200,mtv"]
 */
public class InvalidTransactions {

	public static void main(String[] args) {
		System.out.println(invalidTransactions(new String[] {"alice,20,800,mtv","alice,50,100,beijing"}));
		System.out.println(invalidTransactions(new String[] {"alice,20,800,mtv","alice,50,1200,mtv"}));
		System.out.println(invalidTransactions(new String[] {"alice,20,800,mtv","bob,50,1200,mtv"}));
	}

	public static List<String> invalidTransactions(String[] transactions) {
        Set<String> set = new HashSet<String>();
        
        List<String> invalid = new ArrayList<String>();
        
        for(int i = 0; i < transactions.length - 1; i++) {
            for(int j = i + 1; j < transactions.length; j++) {
            String[] curr = transactions[i].split(",");
            String[] next = transactions[j].split(",");
                if(Integer.parseInt(curr[2]) > 1000) {
                    set.add(transactions[i]);
                }
                if(curr[0].equals(next[0]) && !curr[3].equals(next[3]) && (Math.abs(Integer.parseInt(curr[1]) - Integer.parseInt(next[1])) <= 60)) {
                    set.add(transactions[i]);
                    set.add(transactions[j]);
                }
                if(i == transactions.length - 2 && Integer.parseInt(next[2]) > 1000) {
                    set.add(transactions[j]);
                }
            }
        }
        
        for(String s : set) {
            invalid.add(s);
        }
        
        return invalid;
    }
}
