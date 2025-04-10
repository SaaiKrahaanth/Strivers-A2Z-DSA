package Lec1_ThingsToKnowInProgramming;
import java.util.*;
public class _06_ForLoops_Factorial {
    



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fun(num));

		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}
	public static int fun(int n){
		if (n==1||n==2){
			return n;
		}
		int f1=1;
		int f2=1;
		int f3=0;

		for(int i=2;i<n;i++){
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}
		return f3;

	}

}

    

