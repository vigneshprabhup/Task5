
import java.util.*;

public class SumOfArrayExceptLowAndHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a JAVA program that gives sum of all the values of array except the highest and lowest values. 
		
		int[] a= {1,5,2,4,3};
		int sum=0;
		
		Arrays.sort(a);
		
		
        for(int i=1;i<a.length-1;i++)
        {
        	System.out.println(a[i]);
        	sum = sum+a[i];
        }
        System.out.println("the sum is :" +sum);
	}

}
