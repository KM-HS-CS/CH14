
public class LengthSort {

	public static String[] lSort(String[] a) {
		if (a.length <= 1) {
			return a;
		}
		
		
		int min = 0;
		int newCount = 0;
		String[] newS = new String[a.length - 1];
		
		
		for (int i = 0; i < a.length ; i++) {
			if (a[i].length() < a[min].length()) {
				min = i;
			}
		}
		
		
		int count = 0;
		for (int i = 0; i < a.length ; i++) {
			if (i != min) {
				newS[count] = a[i];
				count++;
			}
		}
		
		
		String[] ans = new String[a.length];
		String[] Sorted = lSort(newS);
		
		
		ans[0] = a[min];
		for (int i = 1; i < ans.length; i++) {
			ans[i] = Sorted[i - 1];
			//System.out.print(ans[i] + " ");
		} 
		//System.out.println("");
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		for (String item: lSort(new String[] {"hi", "h", "he", "hel", "hell", "hello"})) {
			System.out.print(item);
			System.out.print(" ");

		}
	}
	
}
