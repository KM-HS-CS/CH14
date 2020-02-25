
public class nonRecurseMergeSort {
	
	
	
	public static void sort(int[] arr) { 
              
        for (int curr_size = 1; curr_size < arr.length; curr_size *= 2) { 

            for (int LStart = 0; LStart <= arr.length; LStart += 2*curr_size) { 
                
            	int mid = Math.min(LStart + curr_size - 1, arr.length-1);  
          
                int REnd = Math.min(LStart + 2*curr_size - 1, arr.length-1); 
          
                
                merge(LStart, mid, REnd, arr); 
            } 
        } 
    } 
	
	
	private static void merge(int left, int mid, int right, int[] a) {
		  int length = right - left + 1; //length of final list
		  int[] result = new int[length];
	      int i1 = left; //next element in first sublist
	      int i2 = mid + 1; //next element in second sublist
	      int j = 0; // Next open position in b

	      
	      while (i1 <= mid && i2 <= right) {
	         if (a[i1] < a[i2]) {
	            result[j] = a[i1];
	            i1++;
	         }
	         else {
	            result[j] = a[i2];
	            i2++;
	         }
	         j++;
	      }


	      while (i1 <= mid) {
	         result[j] = a[i1];
	         i1++;
	         j++;
	      }
	      
	      while (i2 <= right) {
	         result[j] = a[i2];
	         i2++;
	         j++;
	      }

	     
	      for (j = 0; j < length; j++) {
	         a[left + j] = result[j];
	      }
	   }
	
	
	
	public static void main(String[] args) {
		int[] poop = new int[] {0, 3, 5, 1, 3, 56, 54, 2, 7, -1000, 81};
		System.out.printf("| ");
		for (int item: poop) {
			System.out.print(item + " | ");
		}
		System.out.printf("\n \n \n| ");
		sort(poop);
		for (int item: poop) {
			System.out.print(item + " | ");
		}
	}
}
