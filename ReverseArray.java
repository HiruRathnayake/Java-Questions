public class ReverseArray {
 
    static void rvereseArray(String arr[], int start, int end) { 
        String temp;    
        while (start < end) { 
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }  
    }      
       
    static void printArray(String arr[], int length) { 
        for (int i = 0; i < length; i++) 
             System.out.print(arr[i] + " "); 
        System.out.println(); 
    }  
  
    public static void main(String args[]) {   
        String arr[] = {"a", "b", "c", "d", "e", "f"}; 
        printArray(arr, arr.length); 
        rvereseArray(arr, 0, arr.length-1); 
        System.out.println("Reversed array "); 
        printArray(arr, arr.length);  
    } 
}

