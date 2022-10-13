package kodlamaIo.business.concretes;

import kodlamaIo.business.abstracts.InstructorService;
import kodlamaIo.core.loggers.LogHelper;
import kodlamaIo.dataAccess.abstracts.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager implements InstructorService {

	InstructorDao instructorDao;
	LogHelper logHelper;

	public InstructorManager(InstructorDao instructorDao, LogHelper logHelper) {
		super();
		this.instructorDao = instructorDao;
		this.logHelper = logHelper;
	}

	@Override
	public void addInstructor(Instructor instructor) {
		instructorDao.addUser(instructor);
		logHelper.log(instructor.getFirstName() + " " + instructor.getLasttName());

	}

	@Override
	public void deleteInstructor(int id) {
		instructorDao.deleteUser(id);

	}

}
