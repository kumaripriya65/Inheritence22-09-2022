package inheritenceExercise;
import java.lang.*;
public class TestBookAuthor {
				
			   public static void main(String[] args) {
			      // Test Author class
			      Author a1 = new Author("Priya", "priya30gmail.com");
			      System.out.println(a1);

			      a1.setEmail("priya30gmail.com");
			      System.out.println(a1);
			      System.out.println("name is: " + a1.getName());
			      System.out.println("email is: " + a1.getEmail());

			      // Test Book class
			      Book b1 = new Book ("1234567", "java" ,"a1",8.8, 88);
			      System.out.println(b1);
			      
			      b1.setPrice(8.8);
			      System.out.println(b1);
			      System.out.println("isbn is: " + b1.getName());
			      System.out.println("name is: " + b1.getName());
			      System.out.println("author is: " + b1.getAuthor());
			      System.out.println("qty is: " + b1.getQty());
			      
			      


			   }
			
	}


