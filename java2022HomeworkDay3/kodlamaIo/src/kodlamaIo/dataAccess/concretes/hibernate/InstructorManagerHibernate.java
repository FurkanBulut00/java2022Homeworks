package kodlamaIo.dataAccess.concretes.hibernate;

import kodlamaIo.dataAccess.abstracts.InstructorDao;

import kodlamaIo.entities.Instructor;

public class InstructorManagerHibernate implements InstructorDao {

	@Override
	public void addUser(Instructor instructor) {
		System.out.println("Hibernate ile " + instructor.getFirstName() + " " + instructor.getLasttName() + " eklendi");

	}

	@Override
	public void deleteUser(int id) {
		System.out.println("Hibernate ile " + "Egitmen silindi");

	}

}
