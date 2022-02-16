/* Id   : 62-060216-3203-3
   Name : Mr. Tanakrit Wongtho
   Room : 3 RC
   File Name : Assign01_02.java 
*/
import java.util.Scanner;
public class Assign01_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fahrianheit = ");
        double f = scan.nextDouble();
        double c = (f - 32) / 1.8;
        System.out.println(f + " Fahrianheit  = " + c + " Celsius");
        scan.close();
    }
}
