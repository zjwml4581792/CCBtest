package bin.manager;

import bin.bean.User;

import java.util.List;
/**
 * 调用的入口
 * @author lintao
 *
 */
public interface UserMapper {
	public void save(User user);
	public User getUserByParm(User user);
	public List<User> getUsers();
	public User getUserById(int id);
	public User getUserAddressByUId(int user_id);
	
}
