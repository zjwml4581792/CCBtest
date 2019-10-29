package bin.bean;

import java.util.List;

/**
 * 实体类POJO
 * @author lintao
 *
 */
public class User {
	
	private Integer id;
	private String uname;
	private String upass;
	//private Integer typeid;
	//用户类型
	private Type type;
	//地址的集合
	private List<Address> addresses;
	
	public User() {
		super();
	}
	
	
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}


	public User(Integer id, String uname, String upass) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	

}
