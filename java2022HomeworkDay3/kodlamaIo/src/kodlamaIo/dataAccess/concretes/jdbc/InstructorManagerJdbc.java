package kodlamaIo.dataAccess.concretes.jdbc;

import kodlamaIo.dataAccess.abstracts.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManagerJdbc implements InstructorDao {

	@Override
	public void addUser(Instructor instructor) {
		System.out.println("JDBC ile " + instructor.getFirstName() + " " + instructor.getLasttName() + " eklendi");

	}

	@Override
	public void deleteUser(int id) {
		System.out.println("JDBC ile " + "Egitmen silindi");

	}

}
