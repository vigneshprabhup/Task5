

import java.util.*;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a JAVA method to remove all the spaces from the String and return the resultant. 
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str = scan.nextLine();
		
		str=str.replaceAll(" +", " ").trim();
		
		System.out.println("String after removing extra spaces is :" +str);
		str=str.replaceAll(" ", "").trim();
		
		System.out.println("String all spaces is :" +str);

	}

}
