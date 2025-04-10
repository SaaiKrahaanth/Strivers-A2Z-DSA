package Lec4_KnowBasicMath;

public class _01_CountDigit {
   
    
        static int evenlyDivides(int n) {
            int num=n;
            int digit;
            int count=0;
            while(num!=0){
                digit=num%10;
                num/=10;
                if(digit!=0){
                if(n%digit==0){
                    count++;
                }
                    
                }
            }
            return count;
}
        public static void main(String[] args) {
            int n=1012;
            System.out.println(evenlyDivides(n));
        }
    }
