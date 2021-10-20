package courseAssignments;


import java.io.FileWriter;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String f = sc.next();
		
		StringBuilder s = new StringBuilder(f);
		
		s.reverse();
		
		f = new String(s);
		
		try {
            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(
                "src\\main\\java\\courseAssignments\\sample.txt");
 
            // Write into the file
            // The content taken above inside the string
            fWriter.write(f);
 
          // Printing the contents of a file
            System.out.println(f); 
            // Close the file writer object
            fWriter.close();
 
            // Display message to be printed on the console
            // window after successful execution of the
            // program
            System.out.println(
                "File is created successfully with the content.");
        }
        catch(Exception e)
		{
		   System.out.print(e.getMessage());
		}
}
	}
