import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
	public class Main{ 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("êgí∑:");
			int hight = sc.nextInt();
			System.out.print("ëÃèd");
			int weight = sc.nextInt();
			double bmi = weight / Math.pow(hight,2);
			bmi *=10000;
			BigDecimal bd = new BigDecimal(bmi);
			bd = bd.setScale(2,RoundingMode.DOWN);
			System.out.println(bd);
		}
	}
