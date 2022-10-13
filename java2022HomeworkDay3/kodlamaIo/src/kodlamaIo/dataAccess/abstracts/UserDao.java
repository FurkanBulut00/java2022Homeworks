package kodlamaIo.dataAccess.abstracts;

import kodlamaIo.entities.Instructor;
import kodlamaIo.entities.User;

public interface UserDao<T extends User>  {
	public void addUser(T t);

	public void deleteUser(int id);
}
