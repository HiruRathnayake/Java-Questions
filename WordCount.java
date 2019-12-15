public class WordCount {
    public static void main(String args[]){
	int i,count=1;
	String sentence;
	Scanner sc=new Scanner(System.in);
	sentence=sc.nextLine();

	System.out.println("input sentence :" +sentence);
			
        for(i=0;i<sentence.length();i++){
            if((sentence.charAt(i)==' '|| sentence.charAt(i)==','|| sentence.charAt(i)=='?'))
		count++;
	}
        System.out.println(count);
    }

}
