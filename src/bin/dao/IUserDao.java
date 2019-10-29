package bin.dao;

import java.util.List;

import bin.bean.User;

/**
 * 与数据库打交道常见的操作 ：增删改查
 * @author lintao
 *
 */
public interface IUserDao {
	
	/**
	 * 添加用户
	 * @param user
	 * @return true-添加成功，false-添加失败
	 */
	public boolean save(User user);
	
	public boolean delete(int id);
	
	/**
	 * 查询所有的用户
	 * @return 用户列表
	 */
	public List<User> getUsers();
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return 用户
	 */
	public User getUserById(int id);
	/**
	 * 根据条件查询用户
	 * @param user 条件
	 * @return 用户
	 */
	public User getUserByParm(User user);

}
