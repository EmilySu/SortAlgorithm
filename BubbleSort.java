import java.util.HashMap;

public class Test {
	
	public static void main(String[] args){
		int[] arr = {5,4,2,1,3}; 
		bubbleSort(arr); 
	}
	
	public static void bubbleSort(int[] arr){
		int len = arr.length; 
		for(int i = len-1; i>0; i--){
			for(int j = 0; j < i; j++){
				if(arr[j]>arr[j+1]) swap(arr, j, j+1); 
				printArr(arr); 
				
			}
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






