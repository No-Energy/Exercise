package Contacts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Dao {
	public Connection conn;
	
	public int checkLoginIn(String username,String password){
		try{
			conn=DBUtil.getConnection();
			String sql="select * from user where username=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if (rs.next()){
				return 1;
			}
			else{
				return 0;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public int addContact(String name,String phone,String mail,String address){
		try{
			conn=DBUtil.getConnection();
						
			String ret=this.QueryContact(name);
			if (!ret.equals("No Data!")){
				return 0;
			}
			
			String addsql="insert contact values('"+name+"','"+phone+"','"+mail+"','"+address+"')";
			PreparedStatement ps=conn.prepareStatement(addsql);
			int addNum=ps.executeUpdate(addsql);
			
			if (addNum==1){
				return 1;
			}
			else{
				return 2;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public int delContact(String name){
		try{
			conn=DBUtil.getConnection();
			
			String ret=this.QueryContact(name);
			if (ret.equals("No Data!")){
				return 0;
			}
			
			String delsql="delete from contact where name=?";
			PreparedStatement ps=conn.prepareStatement(delsql);
			ps.setString(1, name);
			int delNum=ps.executeUpdate(delsql);
			
			if (delNum==1){
				return 1;
			}
			else{
				return 2;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateContact(String name,String phone,String mail,String address){
		try{
			conn=DBUtil.getConnection();
			
			String ret=this.QueryContact(name);
			if (ret.equals("No Data!")){
				return 0;
			}
			
			String updatesql="update contact set phone='"+phone+"',mail='"+mail+"',address='"+address+"' where name='"+name+"'";
			PreparedStatement ps=conn.prepareStatement(updatesql);
			int updateNum=ps.executeUpdate(updatesql);
			
			if (updateNum==1){
				return 1;
			}
			else{
				return 2;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public String QueryContact(String name){
		try{
			conn=DBUtil.getConnection();
			
			String querysql="select * from contact where name=?";
			PreparedStatement ps=conn.prepareStatement(querysql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			if (rs.next()){
				return "name:"+rs.getString("name")+" phone:"+rs.getString("phone")+" mail:"+rs.getString("mail")+" address:"+rs.getString("address");
			}
			else{
				return "No Data!";
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "No Data!";
	}
	
	public String QueryContactAll(){
		try{
			conn=DBUtil.getConnection();
			
			String querysql="select * from contact";
			PreparedStatement ps=conn.prepareStatement(querysql);
			ResultSet rs=ps.executeQuery();
			String ret="";
			while (rs.next()){	
				ret+= "name:"+rs.getString("name")+" phone:"+rs.getString("phone")+" mail:"+rs.getString("mail")+" address:"+rs.getString("address")+"\n";
			}
			if(ret.equals("")){
				return "No Data!";
			}
			else{
				return ret;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "No Data!";
	}

	public static void main(String[] args) {
		Dao dao=new Dao();
		System.out.println(dao.QueryContactAll());
	}
}
