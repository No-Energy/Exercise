package XXXX;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("input Num");
		int num =s.nextInt();
		
		//int sum=0;
		System.out.println(2);
		
		for(int i=3;i<num;i++){
			if (i%2>0){
				boolean isPrime=true;
				for(int j=3;j<i;j+=2){
					if(i%j==0){isPrime=false;break;}
				}
				if(isPrime){
					//sum+=i;
					System.out.println(i);
				}
			}
		}
		//System.out.println(sum);
		s.close();
	}
}
