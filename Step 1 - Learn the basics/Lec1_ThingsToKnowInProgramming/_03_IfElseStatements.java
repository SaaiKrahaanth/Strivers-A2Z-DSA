package Lec1_ThingsToKnowInProgramming;

public class _03_IfElseStatements {
    public static String compareNM(int n, int m) {
        if(n<m){
            return "lesser";
        }
        else if(n>m){
            return "greater";
        }
        else{
            return "equal";
        }
        // code here
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        System.out.println("The value of n is " + n + " and the value of m is " + m + ".");
        System.out.println("The value of n is " + compareNM(n, m) + " than the value of m.");
    }
    
}
