package Lec1_ThingsToKnowInProgramming;

import java.util.List;

public class _04_SwitchStatement {
    static double switchCase(int choice, List<Double> arr){
        switch(choice){
            case 1:
                double num=arr.get(0);
                return (Math.PI*num*num);
                
            case 2:
                return (arr.get(0)*arr.get(1));
            
        }
        
    return 0;  // code here
    }
    public static void main(String[] args) {
        List<Double> arr = List.of(5.0, 10.0);
        int choice = 2;
        System.out.println("The area is " + switchCase(choice, arr) + ".");
    }
    
}
