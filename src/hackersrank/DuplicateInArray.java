package hackersrank;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String s="Java JSP Servlets Java Struts JSP JDBC";
		 
		 String[] strArray=s.split(" ");
		// System.out.println(strArray.toString());
		 //String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
	        for (int i = 0; i < strArray.length-1; i++)
	        {
	            for (int j = i+1; j < strArray.length; j++)
	            {
	                if( (strArray[i].equals(strArray[j])) )
	                {
	                    System.out.println(strArray[j]);
	                }
	            }
	        }

	}

}
