package package20151116;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	private static BasicDataSource ds;
	
	static{
		try{
			ds=new BasicDataSource();
			Properties prop=new Properties();
			InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(is);
			ds.setDriverClassName(prop.getProperty("driver"));
			ds.setUrl(prop.getProperty("url"));
			ds.setUsername(prop.getProperty("username"));
			ds.setPassword(prop.getProperty("password"));
			
			//Class.forName("com.mysql.jdbc.Driver"); //原方法
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		try{
			Connection conn = ds.getConnection();//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUncode=Yes&CharacterEncoding=utf8", "root", "win");
			return conn;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void CloseConnection(Connection conn){
		try{
			if (conn!=null){
				conn.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection c=DBUtil.getConnection();
		if (c!=null){
			System.out.println("数据库连接成功");
			DBUtil.CloseConnection(c);
		}
		else{
			System.out.println("数据库连接失败");
		}
	}
	
	
}
