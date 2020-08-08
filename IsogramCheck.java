import java.util.*;
public class IsogramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str = scan.nextLine();
		str=str.replaceAll(" +", "");
		
		
		char[] ch=str.toCharArray();
		System.out.println(ch);
	    int temp=0;
		
		for(int i=0;i<ch.length;i++)
			for(int j=i+1;j<ch.length;j++)
		{
				System.out.println(ch[i] +  "\t"   +      ch[j]);
			if(ch[i]==ch[j])
			{
				System.out.println("Check here" + ch[i] +  "\t"   +      ch[j]);
				temp=1;
				
			}
				
		}
		if(temp==0)
			System.out.println("The given string is Isogram");
		else
			System.out.println("The given string is NOT Isogram");
		
		// method 2:
		
		int count1= ch.length;
	
		HashSet<Character> hm = new HashSet();
        for(int i=0;i<ch.length;i++)
        	hm.add(ch[i]);
        int count2=hm.size();
        
        if(count1==count2)
			System.out.println("The given string is Isogram");
		else
			System.out.println("The given string is NOT Isogram");
	}
	
	

}
