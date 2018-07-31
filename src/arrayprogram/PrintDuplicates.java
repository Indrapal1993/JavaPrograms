package arrayprogram;

public class PrintDuplicates {

	public static void main(String[] args) {
	
		int count=0;
		String arr1[]={};
		String arr[]={"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

		for(int i=0;i<arr.length-1;i++){
			if(arr[i].equals(arr[i++])){
				count++;
				System.out.println(arr[i]);
			}
		}
	
	}

}
