package package20151116;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Dao {
	private Connection conn;
	
	public void findAll(){
		try{
			conn=DBUtil.getConnection();
			String  sql="select * from contact where name=? and phone=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "josh");
			ps.setString(2, "is not null");
			ResultSet rs=ps.executeQuery();
			if (rs.next()){
				System.out.println(rs.getString("name"));
			}
			else{
				System.out.println("No Data!");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Dao dao=new Dao();
		dao.findAll();
	}
}
