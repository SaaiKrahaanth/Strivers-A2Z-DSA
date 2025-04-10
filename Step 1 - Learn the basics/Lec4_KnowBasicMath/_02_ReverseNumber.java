package Lec4_KnowBasicMath;

// 7. Reverse Integer
// Solved
// Medium
// Topics
// Companies
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
public class _02_ReverseNumber {
    
    
        public int reverse(int x) { 
            int max=Integer.MAX_VALUE;
            int min=Integer.MIN_VALUE;
            int digit;
            int rev=0;
            while(x!=0)
            {
                digit=x%10;
                x/=10;
    
                if((rev>max/10)||((rev==max/10)&&(digit>max%10))){
                    return 0;
                }
                if((rev<min/10)||((rev==min/10)&&(digit<min%10))){
                    return 0;
                }
    
                rev=(rev*10)+digit;
    
    
            }return rev;
        }
        public static void main(String[] args) {
            _02_ReverseNumber obj=new _02_ReverseNumber();
            int x=-123;
            System.out.println(obj.reverse(x));
        }
    }

// Time Complexity: O(log10(n)) where n is the number of digits in the number
// Space Complexity: O(1) as we are using constant space
