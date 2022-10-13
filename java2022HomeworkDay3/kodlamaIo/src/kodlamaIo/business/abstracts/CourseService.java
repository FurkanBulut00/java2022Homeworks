package kodlamaIo.business.abstracts;

import kodlamaIo.entities.Course;

public interface CourseService {

	public void addCourse(Course course) throws Exception;

	public void deleteCourse(int id);

}
