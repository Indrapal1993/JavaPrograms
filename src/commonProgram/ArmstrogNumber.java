package commonProgram;

public class ArmstrogNumber {

	public static void main(String[] args) {
		
		int num=153,a,sum=0,temp;
	
		temp=num;
		while(num>0){
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum){
			System.out.println("Armsrong");
		}
		else
			System.out.println("Not armstrong");
	} 

}
