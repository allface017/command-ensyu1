
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ;i < 2;i++){
        double  sin = scan.nextDouble();
        double tai = scan.nextDouble();
        double sin2 = sin /100; 
        double bmi = tai / (sin2 * sin2);
        System.out.println(String.format("%.2f", bmi));
        }
    }
}
