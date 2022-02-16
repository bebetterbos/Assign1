/* Id   : 62-060216-3203-3
   Name : Mr. Tanakrit Wongtho
   Room : 3 RC
   File Name : Assign01_01.java 
*/
import java.util.Scanner;
public class Assign01_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Celsius = ");
        double c = scan.nextDouble();
        double f = c * 1.8 + 32;
        System.out.println(c + " Celsius = " + f + " Fahrianheit");
        scan.close();
}
}