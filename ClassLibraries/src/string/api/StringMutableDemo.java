package string.api;

public class StringMutableDemo {

	public static void main(String[] args) {


		StringBuffer sb = new StringBuffer("hello");
		
	 	sb.append("world");
		
	 	sb.reverse();
	  	
	  	System.out.println(sb);
	  	
		StringBuilder sb1 = new StringBuilder("java");
		
			sb1.insert(2,"X");
			
			System.out.println(sb1);
			
			sb1.replace(0, 2, "hello");
			
			System.out.println(sb1);
	}

}
