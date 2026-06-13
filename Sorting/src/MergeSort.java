
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7};
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After sorting array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	}

	static void mergeSort(int arr[], int l, int r) {
	        // code here
	        if(l>=r){
	            return;
	        }
	        int mid = (l+r)/2;
	        
	        mergeSort(arr, l, mid);
	        mergeSort(arr, mid+1, r);
	        
	        merge(arr, 0, mid, r);
	    }
	    
	    static void merge(int[] arr, int l, int mid, int r){
	        int[] temp = new int[arr.length];
	        
	        int i=l, j=mid+1;
	        int k=0;
	        
	        while(i<=mid && j<=r){
	            if(arr[i] <= arr[j]){
	                temp[k++] = arr[i++];
	            }else{
	                temp[k++] = arr[j++];
	            }
	        }
	        while(i<=mid){
	            temp[k++] = arr[i++];
	        }
	        while(j<=r){
	            temp[k++] = arr[j++];
	        }
	        
	        for(int t=l; t<=r; t++){
	            arr[t] = temp[t];
	        }
	    }

}
