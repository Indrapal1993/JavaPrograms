package hackersrank;

public class CamelCase {

	 public static void main(String[] args) {
	       String s="saveChangesInTheEditor";
	        int words=1;
	        for(char c: s.toCharArray()){
				if(Character.isUpperCase(c)){
					words++;
				}
			}
	        System.out.println(words);
	    }
	}