package Lec1_ThingsToKnowInProgramming;

import java.util.Arrays;

public class _05_ArraysStrings {
    public static int MaxPossibleNumberFormDigits(int number){
        int[] digits = new int[String.valueOf(number).length()];
        // Extract digits from the number
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        Arrays.sort(digits); // Sorts the array in ascending order.
        
        // Reverse the array to get the digits in descending order.
        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            int temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }
        // Now digits[] contains the digits of the number in descending order.
        // Convert the digits back to a number
        int maxNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            maxNumber = maxNumber * 10 + digits[i];
        }

        
        return maxNumber; // Return the maximum number formed by the digits.
    }
    public static void main(String[] args) {
        int number = 1234;
        int digits = MaxPossibleNumberFormDigits(number);
        System.out.println("The maximum possible number that can be formed from the digits of " + number + " is " + digits+ ".");
    }
}
