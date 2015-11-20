package Contacts;

import java.util.Scanner;

import test.entity.Contact;

public class TestContacts {	
	private static Dao dao=new Dao();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("输入用户名：");
			String username =s.nextLine();
			System.out.println("输入密码：");
			String password =s.nextLine();
			
			int logRet=dao.checkLoginIn(username, password);
		
			if (logRet==0){
				System.out.println("Database Connecting Error！");
			}
			else if(logRet==1){
				UseConnect();
				break;
			}
			else{
				System.out.println("Username and Password Error!");
			}
		}
		s.close();
	}
	
	private static void UseConnect(){
		Scanner s = new Scanner(System.in);
		while(true){			
			System.out.println("输入操作：add，remove，update，search,all,exit");
			String Choose =s.nextLine();
			if (Choose.equals("add")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				if(!dao.QueryContact(name).equals("No Data!")){			
					System.out.println("联系人:"+name+"已存在！");
					break;
				}
				else{
					System.out.println("输入电话：");
					String phone=s.nextLine();
					System.out.println("输入邮件：");
					String mail=s.nextLine();
					System.out.println("输入地址：");
					String address=s.nextLine();
					int ret=dao.addContact(name, phone, mail, address);
					if (ret==0){
						System.out.println("联系人:"+name+"已存在！");
					}
					else if(ret==1){
						System.out.println("Success!");
					}
					else{ 
						System.out.println("Error!");
					}
				}			
			}
			else if(Choose.equals("remove")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				int ret=dao.delContact(name);
				if (ret==0){
					System.out.println("联系人:"+name+"不存在！");
				}
				else if(ret==1){
					System.out.println("Success!");
				}
				else{
					System.out.println("Error!");
				}
			}
			else if(Choose.equals("update")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				Boolean isAdd=true;
				if(!dao.QueryContact(name).equals("No Data!")){			
					System.out.println("联系人:"+name+"不存在！");
					break;
				}
				else{
					System.out.println("输入电话：");
					String phone=s.nextLine();
					System.out.println("输入邮件：");
					String mail=s.nextLine();
					System.out.println("输入地址：");
					String address=s.nextLine();
					int ret=dao.updateContact(name, phone, mail, address);
					if (ret==0){
						System.out.println("联系人:"+name+"不存在！");
					}
					else if(ret==1){
						System.out.println("Success!");
					}
					else{
						System.out.println("Error!");
					}
				}			
			}
			else if(Choose.equals("search")){
				System.out.println("输入姓名：");
				String name=s.nextLine();
				String ret=dao.QueryContact(name);
				if (ret.equals("No Data!")){
					System.out.println("联系人:"+name+"不存在！");
				}
				else{
					System.out.println(ret);
				}
			}
			else if(Choose.equals("all")){
				String ret=dao.QueryContactAll();
				if (ret.equals("No Data!")){
					System.out.println("无联系人!");
				}
				else{
					System.out.println(ret);
				}
			}
			else if(Choose.equals("exit")){
				dao.OutLoginIn();
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
