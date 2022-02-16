/* Id   : 62-060216-3203-3
   Name : Mr. Tanakrit Wongtho
   Room : 3 RC
   File Name : Assign01_03.java 
*/
import java.util.Scanner;
public class Assign01_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float principal, interate, deposit1, annual; 
        System.out.print("Principal : ");
        principal = scan.nextFloat();
        System.out.print("Interest rate : ");
        interate = scan.nextFloat();
        deposit1 = (principal * (interate / 100));  
        annual = principal + deposit1;
        float deposit2,annual2;
        deposit2 = (annual * (interate/100));         
        annual2 = annual + deposit2;
        float deposit3,annual3;
        deposit3 = (annual2 * (interate/100));    
        annual3 = annual2 + deposit3;
        float deposit4,annual4;
        deposit4 = (annual3 * (interate/100));    
        annual4 = annual3 + deposit4;
        System.out.println("\n*************************************");
        System.out.println("\nYear 1");
        System.out.printf("Annual deposit = %.2f",annual);        
        System.out.println("\n\nYear 2");        
        System.out.printf("Annual deposit = %.2f",annual2);       
        System.out.println("\n\nYear 3");        
        System.out.printf("Annual deposit = %.2f",annual3);        
        System.out.println("\n\nYear 4");       
        System.out.printf("Annual deposit = %.2f",annual4);
        System.out.println("\n\n*************************************");
        scan.close();
    }
}
