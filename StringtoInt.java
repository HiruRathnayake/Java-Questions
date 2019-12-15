public class StringtoInt {
    
    static int stringToint(String input){
        int i = 0, number = 0, length = input.length();
        boolean isNegative = false;
        if(input.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while(i < length){
            number *= 10;
            number += (input.charAt(i++) - '0' );
        }
        if(isNegative)
            number = -number;
        return number;
    }   
    
    public static void main (String args[]){
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        System.out.println("String Before Conversion :  "+ input);
        System.out.println("int value "+ stringToint(input));
    }

}
