/* Id   : 62-060216-3203-3
   Name : Mr. Tanakrit Wongtho
   Room : 3 RC
   File Name : Assign01_05.java 
*/
import java.util.Scanner;
public class Assign01_05 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        float num;  
        int show1,show2,show3;      
        System.out.print("Enter Floating Number : ");
        num = scan.nextFloat();
        float num1 = (num*10)%10;
        float num2 = (num*100) %10;
        float num3 = (num*1000) %10;  
        show1 = (int) (num1);
        System.out.println(show1); 
        show2 = (int) (num2);
        System.out.println(show2); 
        show3 = (int) (num3);
        System.out.println(show3);
      
    }
}
