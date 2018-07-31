package arrayprogram;

import java.util.Scanner;

public class VowelFilter {

	public static void main(String[] args) {
		
		char vowel[]={'a','e','i','o','u'};
		Scanner scan=new Scanner(System.in);
		String ch=scan.nextLine();
		
		for(int i=0;i<5;i++){
			
			char ch1=ch.charAt(i);
			
			if(ch1==vowel[i]){
				System.out.println(ch1);
			
			}
		}

		
	}

}
