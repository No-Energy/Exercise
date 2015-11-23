package XXXX;

import java.util.Scanner;

public class GetText {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("input text");
		String str =s.nextLine();
		System.out.println("input password");
		String pwd =s.nextLine();
		s.close();
		int[] revert_int = new int[pwd.length()];
        for (int i = 0; i < pwd.length(); i++)
        {
            revert_int[i] = Integer.parseInt(String.valueOf(pwd.charAt(i)));
        }
        int start_num = 0;
        String revert_str = "";
        for (int i=0;i<str.length();i++)
        {
        	char c=str.charAt(i);
            int cint = revert_int[start_num];
            if (start_num == (pwd.length() - 1))
            {
                start_num = 0;
            }
            else
            {
                start_num++;
            }
            revert_str += ((char)((int)c - cint));
        }
        System.out.println(revert_str);
	}
}
