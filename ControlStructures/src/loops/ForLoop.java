package loops;

public class ForLoop {

	public static void main(String[] args) {


		String  empList[] = {"tom","jerry","smith","king","javeed","ford"}; 
		
		
		System.out.println("Length of array "+empList.length);
		
		for(int i =0; i < empList.length ; i++) {
			
			System.out.println(empList[i]);
			
		}
		
		
		// Enhance for loop or For-Each Loop
		System.out.println("For Each Loop");
		
		 for(String s : empList) {  // read only
			 
			 System.out.println(s);
			 
		 }
		
		

	}

}
