package bin.dao;

import java.util.ArrayList;
import java.util.List;

import bin.bean.User;

public class UserDaoImpl implements IUserDao {
	//用户数据列表
	List<User> data;

	public UserDaoImpl() {
		data=new ArrayList<User>();
		data.add(new User(1, "zhangsan", "333"));
		data.add(new User(2, "lisi", "444"));
		data.add(new User(3, "wangwu", "555"));
		data.add(new User(4, "superman", "999"));
		data.add(new User(5, "spideman", "333"));
	}

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByParm(User parm) {
		if (parm!=null) {
			// Java foreach
			for (User u : data) {
				if (parm.getUname()!=null && parm.getUpass()!=null) {
					if (u.getUname().equals(parm.getUname()) && u.getUpass().equals(parm.getUpass())) {
						return u;
					} 
				}
			} 
		}
		return null;
	}

}
