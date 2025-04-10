package Lec4_KnowBasicMath;

public class _03_CheckPallindrome {

   
        public boolean isPalindrome(int x) {
            if (x<0){
                return false;
            }
    
            String str=String.valueOf(x);
            char[] CharArr=str.toCharArray();
            int l=0,r=CharArr.length-1;
            while(l<r){
                if(CharArr[l]!=CharArr[r]){
                    return false;
                }
                l+=1;
                r-=1;
    
                
            }
            return true;
    
    
        

    }
    public static void main(String[] args) {
        _03_CheckPallindrome obj=new _03_CheckPallindrome();
        System.out.println(obj.isPalindrome(121)); // true
        System.out.println(obj.isPalindrome(-121)); // false
        System.out.println(obj.isPalindrome(10)); // false
        System.out.println(obj.isPalindrome(12321)); // true
    }
    

}