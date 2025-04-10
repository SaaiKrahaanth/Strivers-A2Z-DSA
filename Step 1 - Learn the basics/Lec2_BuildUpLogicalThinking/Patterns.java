package Lec2_BuildUpLogicalThinking;

// package PATTERNS;

public class Patterns {
    public static void Rectangle(int n){
        System.err.println("Rectangle\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
                
            } System.out.println("\n");
            
        }
    
    }
    public static void RightAngledTriangle(int n){
        System.err.println("RightNumberedTriangle\n");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
                
            } System.out.println("\n");
            
        }
    
    }
    public static void RightAngledNumberedTriangle(int n){
        System.err.println("RightAngledNumberedTriangle\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print((j+1)+" ");
                
            } System.out.println("\n");
            
        }
    
    }
    public static void InvertedRightPyramid(int n){
        System.err.println("InvertedRightPyramid\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1+" ");
                
            } System.out.println("\n");
            
        }
    
    }
    public static void StarPyramid(int n){
        System.err.println("StarPyramid\n");
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n-i-1; j++) {
                System.out.print("  ");
                
            }
            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            for (int l=0;l<i;l++){
                System.out.print("* ");
                
            }
            
            System.out.println("\n");
            
        }
    
    }
    public static void InvertedStarPyramid(int n){
        System.err.println("InvertedStarPyramid\n");
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n-i-1; j++) {
                System.out.print("  ");
                
            }
            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            for (int l=0;l<i;l++){
                System.out.print("* ");
                
            }
            
            System.out.println("\n");
            
        }
    
    }
    public static void DiamondStarPyramid(int n){
        System.err.println("DiamondStarPyramid\n");
        
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n-i-1; j++) {
                System.out.print("  ");
                
            }
            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            for (int l=0;l<i;l++){
                System.out.print("* ");
                
            }
            
            System.out.println("\n");
            
        }
        for (int i = 0; i < n; i++) {
            for (int j =0; j < i; j++) {
                System.out.print("  ");
                
            }
            for (int k=0;k<n-i;k++){
                System.out.print("* ");
            }
            for (int l=0;l<n-i-1;l++){
                System.out.print("* ");
                
            }
            
            System.out.println("\n");
            
        }
    
    }
    public static void HalfDiamondPyramid(int n){
        System.err.println("HalfDiamondPyramid\n");
        int stars;
        for(int i=1;i<=2*n-1;i++){
            stars=i;
            if (i>n){
                stars=2*n-i;
            }
            for (int j=1;j<=stars;j++){
                System.out.print("* ");

            }System.out.println("\n");
            
        }
    }
    public static void BinaryNumberTriangle(int n){
        System.err.println("BinaryNumberTriangle\n");
        int stars;
        for(int i=0;i<n;i++){
            if (i%2==0)stars=1;
            else stars=0;
            for (int j=0;j<i+1;j++){
                System.out.print(stars+" ");
                stars=1-stars;

            }System.out.println("\n");
            
        }
    }
    public static void NumberCrownPattern(int n){
        System.err.println("NumberCrownPattern\n");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
                
            }
            for(int space=2*(n-i) ;space>=1;space--){
                System.out.print("  ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println("\n");
            
        }
    
    }
    public static void IncreasingNumberTrianglePattern(int n){
        System.out.println("Increasing Number Triangle Pattern\n");
        int s=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                s+=1;
                
            } System.out.println("\n");
            
        }
    
    }
    public static void IncreasingLetterTrianglePattern(int n){
        System.out.println("Increasing Letter Triangle Pattern\n");
        char s='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                s+=1;
                
            } System.out.println("\n");
            s=65;
            
        }
    
    }
    public static void ReverseLetterTrianglePattern(int n){
        System.out.println("Reverse Letter Triangle Pattern\n");
        char s=65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(s+" ");
                s+=1;
                
            } System.out.println("\n");
            s=65;
            
        }
    
    }
    public static void AlphaRampPattern(int n){
        System.out.println("Alpha-Ramp Pattern\n");
        char s=65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                
                
            } System.out.println("\n");
            s+=1;
            
        }
        
    }
    public static void AlphaHillPattern(int n){
        System.out.println("Alpha-HIll Pattern\n");
        char s=65;
         int last= n + 65;
         char lasts =(char)last;
        for (int i = 0; i < n; i++) {
            for (int j=0 ; j < n-i; j++) {
                System.out.print("   ");
                
                
            }
            for(int k=0;k<i+1;k++){
                System.out.print((char)(s+k)+"  ");


            }
            
            for(int m=i-1;m>=0;m--){
                System.out.print((char)(s+m)+"  ");
            }
            System.out.println("\n");
            
            
        }
    
    }
    public static void AlphaTrianglePattern(int n){
        System.out.println("Alpha-Triangle Pattern\n");
        char s=65;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print((char)(s+(n-j))+"  ");
                
                
            } System.out.println("\n");
            
            
        }
        
    }
    
    public static void SymmetricVoidPattern(int n){
        System.out.println("Symmetric-Void Pattern\n");
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            for (int k=1;k<=(i-1)*2;k++){
                System.out.print("  ");
            }
            for (int l=1;l<=n-i+1;l++){
                System.out.print("* ");
            }
        
                
                
             System.out.println("\n");  
        }
          //bottom half
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("* ");
            }
        
                
                
             System.out.println("\n");  
        }
        
    }
    public static void SymmetricButterfly(int n){
        System.out.println("Symmetric-Butterfly\n");
        //upper half
         
        
          //bottom half
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("* ");
            }
        
                
                
             System.out.println("\n");  
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            for (int k=1;k<=(i-1)*2;k++){
                System.out.print("  ");
            }
            for (int l=1;l<=n-i+1;l++){
                System.out.print("* ");
            }
        
                
                
             System.out.println("\n"); 
        
    }
}
public static void HollowRectangle(int n){
    System.err.println("Hollow Rectangle\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i==0 ||j==0||i==n-1||j==n-1){

            System.out.print("* ");
            }
            else {System.out.print("  ");}
        } System.out.println("\n");
        
    }

}
public static void Practice(int n){
    System.err.println("Practice\n");
    for (int i=0; i<n; i++){
        for (int j=0;j<n-i;j++){
            System.out.print("  ");

        }
        for (int k=0;k<(i*2)+1;k++){
            System.out.print("* ");
        }
        System.out.println();
    } 
        System.out.println("\n");
        
    }






    /*****************main**************/
    public static void main(String[] args) {

        int n=5;
        System.out.println("Welcome to my pattern world\n");
        Rectangle(n);
        RightAngledTriangle(n);
        RightAngledNumberedTriangle(n);
        InvertedRightPyramid(n);
        StarPyramid(n);
        InvertedStarPyramid(n);
        DiamondStarPyramid(n);
        HalfDiamondPyramid(n);
        BinaryNumberTriangle(n);
        NumberCrownPattern(n);
        IncreasingNumberTrianglePattern(n);
        IncreasingLetterTrianglePattern(n);
        ReverseLetterTrianglePattern(n);
        AlphaRampPattern(n);
        AlphaHillPattern(n);
        AlphaTrianglePattern(n);
        SymmetricVoidPattern(n);
        SymmetricButterfly(n);
        HollowRectangle(n);
        Practice(n);


    }
}

