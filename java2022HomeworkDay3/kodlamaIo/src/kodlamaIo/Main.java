package kodlamaIo;

import kodlamaIo.business.abstracts.CategoryService;
import kodlamaIo.business.abstracts.CourseService;
import kodlamaIo.business.abstracts.InstructorService;
import kodlamaIo.business.concretes.CategoryManager;
import kodlamaIo.business.concretes.CourseManager;
import kodlamaIo.business.concretes.InstructorManager;
import kodlamaIo.core.loggers.DatabaseLogger;
import kodlamaIo.core.loggers.FileLogger;
import kodlamaIo.core.loggers.LogHelper;
import kodlamaIo.core.loggers.Logger;
import kodlamaIo.core.loggers.MailLogger;
import kodlamaIo.dataAccess.abstracts.CategoryDao;
import kodlamaIo.dataAccess.concretes.hibernate.CategoryManagerHibernate;
import kodlamaIo.dataAccess.concretes.hibernate.InstructorManagerHibernate;
import kodlamaIo.dataAccess.concretes.jdbc.CourseManagerJdbc;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category = new Category(1, "Programlama");
		Course course = new Course(1, "Java 2022", 500);
		Instructor instructor = new Instructor("Engin", "Demirog", "www.image.com", 1, "engin.demirog@gmail.com",
				"111112");

		Logger[] loggers = { new DatabaseLogger() };

		CategoryService categoryService = new CategoryManager(new CategoryManagerHibernate(), new LogHelper(loggers));
		categoryService.addCategory(category);

		CourseService courseService = new CourseManager(new CourseManagerJdbc(), new LogHelper(loggers));
		courseService.addCourse(course);

		InstructorService instructorService = new InstructorManager(new InstructorManagerHibernate(),
				new LogHelper(loggers));
		instructorService.addInstructor(instructor);
	}

}
