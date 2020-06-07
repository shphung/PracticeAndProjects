package String;
/*
 * Leetcode Practice: #551. Student Attenance Record I
 * 
 * You are given a string representing an attendance record for a student.
 * The record only contains the following three characters:
 * 
 * 1. 'A' : Absent.
 * 2. 'L' : Late.
 * 3. 'P' : Present.
 * 
 * A student could be rewarded if his attendance record doesn't contain
 * more than one 'A' (absent) or more than two continuous 'L' (late).
 * 
 * You need to return whether the student could be rewarded according to his attendance record.
 * 
 * Example 1:
 * 	Input: "PPALLP"
 * 	Output: true
 * 
 * Example 2:
 * 	Input: "PPALLL"
 * 	Output: False
 */
public class StudentAttendanceRecordI {

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));
		System.out.println(checkRecord("PPALLL"));
	}

	public static boolean checkRecord(String s) {
		char[] letters = s.toCharArray();
        int absent = 0;
        for(int i = 0; i < letters.length; i++) {
            if(String.valueOf(letters[i]).equals("A")) {
                absent++;
                if(absent > 1) {
                return false;
                }
            } else if(String.valueOf(letters[i]).equals("L")) {
                if((i + 3) <= letters.length) {
                    String subStr = s.substring(i, (i+3));
                    if(subStr.equals("LLL")) {
                        return false;
                    }
                }
            }
        }
        return true;
	}
}
