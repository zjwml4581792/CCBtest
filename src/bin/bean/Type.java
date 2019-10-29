package bin.bean;
/**
 * 用户类型
 * @author lintao
 *
 */
public class Type {
	private Integer id;
	private String tname;
	private String remark;
	
	
	public Type() {
		super();
	}
	public Type(Integer id, String tname) {
		super();
		this.id = id;
		this.tname = tname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
