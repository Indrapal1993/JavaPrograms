package hackersrank;

public class MarsExploration {

	public static void main(String[] args) {
		System.out.println(MarsExploration.marsExploration("SOSSPSSQSSOR"));

	}
	
	 static int marsExploration(String s) {
	       int count = 0;
	        String sos = "SOS";
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != sos.charAt(i % 3)) count++;
	        }
	        return count;
	    }
}
