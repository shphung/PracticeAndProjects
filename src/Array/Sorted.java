package Array;

public class Sorted {

	public static void main(String[] args) {
		int[] a = new int[]{424238335, 596516649, 719885386, 846930886, 1189641421, 1649760492, 1681692777, 1714636915, 1804289383, 1957747793};
        
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i + 1]) {
				System.out.println("Not sorted");
			}
		}
	}

}
