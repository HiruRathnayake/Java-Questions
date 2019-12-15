public class DuplicatesRemove {
    
    public static void main(String[] args){ 
        int array[] = {1, 2, 3, 2, 3, 4, 5, 1};

        for(int i=0; i<array.length-1; i++){
          boolean isNonDupe = true;
          for(int j=0; j<array.length; j++){
             if((array[i] == array[j]) && (i!=j))
                isNonDupe = false;
           }
           if(isNonDupe)
            System.out.println(array[i]); 
     }
    } 
}
