package kodlamaIo.business.concretes;

import kodlamaIo.business.abstracts.CourseService;
import kodlamaIo.core.loggers.LogHelper;
import kodlamaIo.dataAccess.abstracts.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private LogHelper logHelper;

	public CourseManager(CourseDao courseDao, LogHelper logHelper) {
		super();
		this.courseDao = courseDao;
		this.logHelper = logHelper;
	}

	@Override
	public void addCourse(Course course) throws Exception {
		if (courseDao.getCourseByName(course.getCourseName()) == false && course.getCoursePrice() > 0) {
			courseDao.addCourse(course);
			logHelper.log(course.getCourseName());
		} else {
			throw new Exception("Kurs Eklenemedi VAH VAH!");
		}

	}

	@Override
	public void deleteCourse(int id) {
		courseDao.deleteCourse(id);

	}

}
