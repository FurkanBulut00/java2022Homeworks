package kodlamaIo.dataAccess.concretes.hibernate;

import kodlamaIo.dataAccess.abstracts.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManagerHibernate implements CourseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println("Hibernate ile " + course.getCourseName() + " eklendi");

	}

	@Override
	public void deleteCourse(int id) {
		System.out.println("Hibernate ile " + "kurs silindi");

	}

	@Override
	public boolean getCourseByName(String courseName) {
		return false;

	}

}
