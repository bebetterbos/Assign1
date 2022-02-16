/* Id   : 62-060216-3203-3
   Name : Mr. Tanakrit Wongtho
   Room : 3 RC
   File Name : Assign01_04.java 
*/
import java.util.Scanner;
public class Assign01_04 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num ;       
        System.out.print("Enter Number : ");
        num = scan.nextInt();
        int sum = (num/100) + (num/10)%10 + num%10;
        System.out.print(sum);     
    }
}
