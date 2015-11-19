package XXXX;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

import test.entity.Contact;

public class Contacts {
	public static void main(String[] args) {
		List<Contact> list =new LinkedList<Contact>();
		Scanner s = new Scanner(System.in);
		while(true){		
			System.out.println("输入操作：add，remove，update，search,all,exit");
			String Choose =s.nextLine();
			if (Choose.equals("add")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				Boolean isAdd=true;
				for(Contact a:list){
					if(a.getName().equals(name)){			
						isAdd=false;
						break;
					}
				}
				if(isAdd){
					Contact c = new Contact();	
					c.setName(name);
					System.out.println("输入电话：");
					c.setPhone(s.nextLine());
					System.out.println("输入邮件：");
					c.setMail(s.nextLine());
					System.out.println("输入地址：");
					c.setAdd(s.nextLine());
					list.add(c);
					System.out.println("Success！");
				}
				else{
					System.out.println("联系人:"+name+"已存在！");
				}				
			}
			else if(Choose.equals("remove")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				Boolean isIn=false;
				Contact remove = null;
				for(Contact a:list){
					if(a.getName().equals(name)){			
						isIn=true;
						remove=a;
						break;
					}
				}
				if(isIn){
					list.remove(remove);
					System.out.println("Success!");
				}
				else{
					System.out.println("联系人:"+name+"不存在！");
				}				
			}
			else if(Choose.equals("update")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				Boolean isIn=false;
				for(Contact a:list){
					if(a.getName().equals(name)){			
						isIn=true;
						System.out.println("输入电话：");
						a.setPhone(s.nextLine());
						System.out.println("输入邮件：");
						a.setMail(s.nextLine());
						System.out.println("输入地址：");
						a.setAdd(s.nextLine());
						System.out.println("Success!");
						break;
					}
				}
				if(!isIn){
					System.out.println("联系人:"+name+"不存在！");
				}	
			}
			else if(Choose.equals("search")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				Boolean isIn=false;
				for(Contact a:list){
					if(a.getName().equals(name)){			
						isIn=true;
						a.Show();
						break;
					}
				}
				if(!isIn){
					System.out.println("联系人:"+name+"不存在！");
				}	
			}
			else if(Choose.equals("all")){
				if(list.size()>0){
					for(Contact a:list){
						a.Show();	
					}
				}
				else{
					System.out.println("No Data!");
				}
			}
			else if(Choose.equals("exit")){
				System.out.println("已退出!");
				break;
			}
			else{
				System.out.println("请输入正确操作！");
			}
		}
		s.close();
	}
}
