import java.util.Scanner;

public class StringPalindrome {
    
    static boolean isPalindrome(String input){ 
        int i = 0, length;
        length = input.length() - 1; 
        while (i < length) { 
            if (input.charAt(i) != input.charAt(length)) 
                    return false; 
            i++; 
            length--; 
        } 
        return true; 
    } 
  
    public static void main(String[] args){ 
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        System.out.print((isPalindrome(input))? "Yes" : "No"); 
    } 
}
