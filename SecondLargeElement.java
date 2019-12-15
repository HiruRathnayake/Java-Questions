public class SecondLargeElement {
    public static void main(String[] args) {
 
	int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largestElement = arr[0];
	int secondLargestElement= arr[0];
		
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) 
	    System.out.print(arr[i] + " ");
        System.out.println("");
	
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
		secondLargestElement = largestElement;
		largestElement = arr[i];
            }else if (arr[i] > secondLargestElement) 
		secondLargestElement = arr[i];
	}
 
	System.out.println("Second largest number is:" + secondLargestElement);
    }
}
