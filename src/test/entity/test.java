package test.entity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class test {
	public static void main(String[] args) {
		User user=new User();
		user.setName("xufeng");
		user.setSalary(50000);
		user.setAge("18");
		System.out.println(user.getSalary());
		List<User> list=new ArrayList<User>();
		list.add(user);
		System.out.println(list.get(0).getName());
		for(User user1:list){
			user1.getName();
		}
		
		Map m=new HashMap();
        m.put("name", "xufeng");
        m.put("age", 666);
        m.put(333, 2222);
        for(Object key:m.keySet()){
        	Object s=m.get(key);
        }
	}
   public synchronized void t(){
	   int i=1;
	   while(i==-1){
		   i--;
		   break;
	   }
	   
   }
	

}
class test2 extends test{
	public static void main(String[] args) {
		test t=new test();
	
	}
}