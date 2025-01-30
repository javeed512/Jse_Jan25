package string.api;

public class Demo {

	public static void main(String[] args) {


		String  s1 = new String("hello");
		
		
		String  s2 = new String("hello");
		
		
	       System.out.println("Values are same ? "+s1.equals(s2));
	       
	       System.out.println("Hashcode are same ?"+ (s1 == s2) );
	       
	       String s3 = "java";
	       String  s4  = "java";
	       String s5 ="hello";
	       
	       System.out.println("Values are same ? "+s3.equals(s4));
	       System.out.println("Hashcode are same ?"+ (s3 == s4) );

	}

}
