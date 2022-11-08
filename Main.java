import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
	public class Main{ 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("1人目");
			System.out.print("身長:");
			int hight = sc.nextInt();
			System.out.print("体重");
			int weight = sc.nextInt();
			double bmi = weight / Math.pow(hight,2);
			bmi *=10000;
			BigDecimal bd = new BigDecimal(bmi);
			bd = bd.setScale(2,RoundingMode.DOWN);
			System.out.println("BMI" + bd);
			
			System.out.println("2人目");
			System.out.print("身長:");
			int hight2 = sc.nextInt();
			System.out.print("体重");
			int weight2 = sc.nextInt();
			double bmi2 = weight2 / Math.pow(hight2,2);
			bmi2 *=10000;
			BigDecimal bd2 = new BigDecimal(bmi2);
			bd2 = bd.setScale(2,RoundingMode.DOWN);
			System.out.println("BMI" + bd2);
		}
	}
