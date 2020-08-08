import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a JAVA program that reverse the words of a sentence. 
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str = scan.nextLine();
		ArrayList<String> as = new ArrayList();
		
		String[] arr=str.split(" ");
		
		String newstr="";
		
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb=new StringBuffer(arr[i]);
			
			sb.reverse();
			newstr=newstr+sb+" ";
			System.out.println(sb);
		}
		System.out.println(newstr.trim());
	}

}
