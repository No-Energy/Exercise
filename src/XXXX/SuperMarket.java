package XXXX;

import java.util.Scanner;
/*
 * 超市结账
 */
public class SuperMarket {
	public static void main(String[] args) {
		System.out.println("plz name");
		Scanner s=new Scanner(System.in);
		String Name=s.nextLine();
		
		
		System.out.println("plz num");
		int num =s.nextInt();
		
		System.out.println("plz p");
		double p =s.nextDouble();
		
		System.out.println("plz money");
		double m=s.nextDouble();
		
		s.close();
		System.out.println(Name+" Num:"+num+" price:"+p+" All:"+p*num+" In:"+m+" Out:"+(m-(num*p)));
	}
}
