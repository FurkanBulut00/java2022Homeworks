package kodlamaIo.dataAccess.abstracts;

import kodlamaIo.entities.Course;

public interface CourseDao {
	public void addCourse(Course course);

	public void deleteCourse(int id);

	public boolean getCourseByName(String courseName);

}
