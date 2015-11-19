//package Contacts;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class Contacts extends HttpServlet{
//	private Dao dao;
//	public void service(HttpServletRequest requst,HttpServletResponse response) throws ServletException,IOException{
//		requst.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		String type=requst.getParameter("type");
//		String name=requst.getParameter("name");
//		String phone=requst.getParameter("phone");
//		String mail=requst.getParameter("mail");
//		String address=requst.getParameter("address");
//		
//		PrintWriter out=response.getWriter();
//		
//		dao=new Dao();
//		
//		if(type.equals("add")){
//			int ret=dao.addContact(name, phone, mail, address);
//			if (ret==0){
//				out.println("name repeat");
//			}
//			else if(ret==1){
//				out.println("success");
//			}
//			else{
//				out.println("Error");
//			}
//		}
//		else if(type.equals("delete")){
//			int ret=dao.delContact(name);
//			if (ret==0){
//				out.println("no data");
//			}
//			else if(ret==1){
//				out.println("success");
//			}
//			else{
//				out.println("Error");
//			}
//		}
//		else if(type.equals("update")){
//			int ret=dao.updateContact(name, phone, mail, address);
//			if (ret==0){
//				out.println("no data");
//			}
//			else if(ret==1){
//				out.println("success");
//			}
//			else{
//				out.println("Error");
//			}
//		}
//		else if(type.equals("query")){
//			out.println(dao.QueryContact(name));
//		}
//		else if(type.equals("all")){
//			out.println(dao.QueryContactAll());
//		}
//		else{
//			out.println("Login Error");
//		}
//		
////		out.println("hello world and username:"+username+" password:"+password);
//	}
//}