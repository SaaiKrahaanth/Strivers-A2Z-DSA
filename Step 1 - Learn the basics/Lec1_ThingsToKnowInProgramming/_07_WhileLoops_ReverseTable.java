package Lec1_ThingsToKnowInProgramming;

public class _07_WhileLoops_ReverseTable {
    
    public static void calculateMultiples(int n) {
        int i=n*10;
        while(i>=n){
            System.out.print(i+" ");
            i-=n;
            
        }
        
    }

// This program prints the first 10 multiples of a number in reverse order using a while loop.
public static void main(String[] args) {
    int n = 5; // Example number
    calculateMultiples(n);
}
// Output: The first 10 multiples of 5 in reverse order are: 50 45 40 35 30 25 20 15 10 5
// The program defines a method calculateMultiples that takes an integer n as input and prints the first 10 multiples of n in reverse order.        

}	
		