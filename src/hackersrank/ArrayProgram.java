package hackersrank;

public class ArrayProgram {

	public static void main(String[] args) {
		
		String[] arr1=new String[2];
		arr1[0]="A";
		arr1[1]="B";
		for(String i:arr1){
			System.out.println(i);
		}
      
		String[] arr2=new String[arr1.length];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
	}

}
