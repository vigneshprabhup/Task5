import java.util.*;
public class BalancedBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str = scan.nextLine();
		//str.replaceAll("[^()]","");
		
		//str=str.replaceAll("[^a-zA-Z ]", "");
		
		char[] ch= str.toCharArray();
		int temp1=0,temp2=0,temp3=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
				temp1++;
		   if(ch[i]==')')
		    	temp1--;

			if(ch[i]=='{')
				temp2++;
		   if(ch[i]=='}')
		    	temp2--;

			if(ch[i]==']')
				temp3++;
		   if(ch[i]=='[')
		    	temp3--;
				
		}
		
		if(temp1 ==0 && temp2==0 && temp3==0)			
	        	System.out.println("BALANCE BRACES");
		else
			System.out.println("UNBALANCED BRACES");
	}

}
