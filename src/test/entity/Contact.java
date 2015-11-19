package test.entity;

public class Contact {
	private String Name;
	private String Phone;
	private String Mail;
	private String Add;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public void Show(){
		System.out.println("姓名:"+Name+" 电话:"+Phone+" 邮件:"+Mail+" 地址:"+Add);
	}
}
