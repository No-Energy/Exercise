package XXXX;

import java.util.Scanner;

/*
 * 判断是否回文
 */
public class isPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("plz str");
		String str = scan.nextLine();
		scan.close();
		int allNum = str.length()-1;
		int conparisonNum = allNum/2;
		boolean isP = true;
		for(int i=0;i<conparisonNum;i++){
			if(str.charAt(i)!=str.charAt(allNum-i)){isP=false;break;}
		}
		if(isP){
			System.out.println("OK");
		}
		else{
			System.out.println("NO");
		}
	}
}
