package XXXX;

import java.util.Scanner;

public class SetText {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input text");
		String str =s.nextLine();
		s.close();
		String convert_str = "";
        int[] convert_int = { 1,2,3,4,5,6};
        int start_num = 0;
        for(int i=0;i<str.length();i++)
        {
        	char c =str.charAt(i);
        	
            int cint = convert_int[start_num];
            if (start_num == 5)
            {
                start_num = 0;
            }
            else
            {
                start_num++;
            }
            convert_str += ((char)((int)c + cint));
        }
        System.out.println(convert_str.trim());
	}
}
