package Lec1_ThingsToKnowInProgramming;
import java.util.Scanner;
public class _02_DataTypes {
    static int dataTypeSize(String str) {
        if("Character".equals(str)){
            return 1;
        }
        else if("Integer".equals(str)|| "Float".equals(str)){
            return 4;
        }
        else{
            return 8;
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the data type: ");
        String dataType = scanner.nextLine();
        scanner.close();
        System.out.println("The size of " + dataType + " is " + dataTypeSize(dataType) + " bytes.");
    }
    
}
