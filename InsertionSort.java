import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		int[] arr = {5,4,2,1,3}; 
		insertionSort(arr); 
		printArr(arr); 
	}
	
	public static void insertionSort(int[] arr){
		int len = arr.length; 
		for(int i = 1; i < len; i++){
			int temp = arr[i];
			int j ; 
			for( j = i; j>0 && temp<arr[j-1]; j--){
				arr[j] = arr[j-1]; 
				printArr(arr); 
			}
			arr[j] = temp; 
		}
	}

	public static void swap(int[] arr, int i , int j ){
		int temp = arr[i]; 
		arr[i] = arr[j];
		arr[j] = temp; 
	}
	

	public static void printArr(int[] arr){
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]+" "); 
		}	
		System.out.println(); 
	}
}






