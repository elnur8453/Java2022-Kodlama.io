/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaiodemo;

import kodlamaiodemo.business.CategoryManager;
import kodlamaiodemo.business.CourseManager;
import kodlamaiodemo.core.logging.DatabaseLogger;
import kodlamaiodemo.core.logging.FileLogger;
import kodlamaiodemo.core.logging.Logger;
import kodlamaiodemo.core.logging.MailLogger;
import kodlamaiodemo.dataAccess.HibernateCategoryDao;
import kodlamaiodemo.dataAccess.JdbcCourseDao;
import kodlamaiodemo.entities.Category;
import kodlamaiodemo.entities.Course;

/**
 *
 * @author ASUS
 */
public class KodlamaioDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Category category1 = new Category(1, "Programming");
		Category category2 = new Category(2, "Maths");
		Category category3 = new Category(3, "Data Science");


		Course course1 = new Course(1, "C", 29.90, category1);
		Course course2 = new Course(2, "C++", 19.90, category1);
		Course course3 = new Course(3, "Java", 120, category1);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Course[] courses = {course1, course2, course3};
		Category[] categories = {category1, category2, category3};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);

		for(Category category : categories) {
			categoryManager.addCategory(category);
		}

		
		for(Course course : courses) {			
			courseManager.addCourse(course);
		}

	}
    }
    

