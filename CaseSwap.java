
import java.util.*;

public class CaseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a JAVA program that swaps the case of the alphabets of the string, 

         //For eg, => “heLLo WOrLd” => “HEllO woRlD”. 
		
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter the string");
			String str = scan.nextLine();
			
			StringBuffer strbuff=new StringBuffer(str);
			
			//remove special characters and numerics
			str=str.replaceAll("[^a-zA-Z ]", "");
			
			System.out.println(strbuff);
			
			
			for(int i=0;i<strbuff.length();i++)
			{
				char c= strbuff.charAt(i);
				if(Character.isLowerCase(c))
				{
					strbuff.replace(i, i+1, Character.toUpperCase(c)+"");
								
				}
				else
				{
					strbuff.replace(i,i+1,Character.toLowerCase(c)+"");
				
				}
			}
			System.out.println("the final string is " + strbuff);
            
	}

}
