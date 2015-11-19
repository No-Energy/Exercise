package XXXX;

import java.util.Scanner;
/*
 * 猜数字游戏
 */
public class GuessNumber {
	public static void main(String[] args) {
		
		int i=(int) (Math.random()*1000)+1;
		Scanner scan = new Scanner(System.in);
		int a=0;
		int s=1;
		int b=1000;
		while (true)
		{
			System.out.println("plz:");
			a=scan.nextInt();
			if(i==a){
				System.out.println("Right");
				break;
			}
			else{
				if (a>i){b=a;}
				if (a<i){s=a;}
				System.out.println("s:"+s+" b:"+b);	
			}		
		}
		scan.close();
	}
}
