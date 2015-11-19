package XXXX;

import java.util.Scanner;
/*
 * 输入字符串逆转后输出
 */
public class GoString {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("plz an string:");
		String str=scan.nextLine();
		scan.close();
		String OutStr="";
		for(int i=str.length()-1;i>=0;i--){
			OutStr+=str.charAt(i);
		}
		System.out.println(OutStr);
	}
}
