


import java.util.*;



public class ShortestWordInAString {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str = scan.nextLine();
		str=str.replaceAll(" +"," ").trim();
		
		
		System.out.println("String after using trim method  " + str);
		
		String[] a= str.split(" ");
		
	
		
		String min=a[0],max=a[a.length-1];
		
		
		
		
		for(int i=1;i<a.length;i++)
		{
			
			if(a[i].length()<min.length())
				min=a[i];			
		}
		
		System.out.println("The length of Smallest word in the given string is :" +min.length());
			
		
		
	}

}
