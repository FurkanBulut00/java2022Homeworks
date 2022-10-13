package kodlamaIo.dataAccess.concretes.jdbc;

import kodlamaIo.dataAccess.abstracts.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManagerJdbc implements CourseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println("JDBC ile " + course.getCourseName() + " eklendi");

	}

	@Override
	public void deleteCourse(int id) {
		System.out.println("JDBC ile " + "kurs silindi");

	}

	@Override
	public boolean getCourseByName(String courseName) {
		// TODO Auto-generated method stub
		return false;
	}

}
