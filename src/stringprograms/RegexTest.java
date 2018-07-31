package stringprograms;

public class RegexTest {
	public static void main(String args[])
    {
        String str = "gee.kss@for@geek^ss";
        String [] arrOfStr = str.split("[^a-zA-Z0-9]", 5);
 
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
