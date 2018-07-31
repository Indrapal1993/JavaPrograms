package stringprograms;

public class AsciiStringFilter {

	public static void main(String[] args) {
		String str = "JAVA123coding456";
		String s1="";
		String s2="";
		String s3="";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>=48&&ch<57){
				 s1=s1+ch;
			}
			if (ch>=65&&ch<=90) {
				s2=s2+ch;
			}
			if (ch>=90&&ch<=122) {
				s3=s3+ch;
			}
		}
		System.out.println("Numbers are : " +s1 );
		System.out.println("Upper letters are : " +s2 );
		System.out.println("Lower letters are : " +s3 );
		
	}

}
