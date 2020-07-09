package Stack;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode Practice: #155. Min Stack
 * 
 * Design a stack that supports push, pop, top, and retrieving the
 * minimum element in constant time.
 *
 * 1. push(x) -- Push element x onto stack.
 * 2. pop() -- Removes the element on top of the stack.
 * 3. top() -- Get the top element.
 * 4. getMin() -- Retrieve the minimum element in the stack.
 *
 * Example 1:
 * Input:
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * Output:
 * [null,null,null,null,-3,null,0,-2]
 * 
 * Explanation:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 * 
 * Constraints:
 * - Methods pop, top and getMin operations will always be called on non-empty stacks.
 */
public class MinStack {

    List<Integer> stk;
    
    /** initialize your data structure here. */
    public MinStack() {
        stk = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stk.add(x);
    }
    
    public void pop() {
        stk.remove(stk.size() - 1);
    }
    
    public int top() {
        return stk.get(stk.size() -1);
    }
    
    public int getMin() {
        int min = stk.get(0);
        for(int i = 1; i < stk.size(); i++) {
            if(min > stk.get(i)) {
                min = stk.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */