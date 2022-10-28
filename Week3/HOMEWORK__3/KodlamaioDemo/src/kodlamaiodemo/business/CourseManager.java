/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaiodemo.business;

import kodlamaiodemo.dataAccess.CourseDao;
import kodlamaiodemo.entities.Course;
import kodlamaiodemo.core.logging.Logger;
/**
 *
 * @author ASUS
 */
public class CourseManager {
    private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void addCourse(Course course) throws Exception {
		if(course.getCoursePrice() <= 0.0) {
			throw new Exception("Course price connot be 0 or negative number.");
		}
		
		for(Course currentCourse: courses) {
			if(currentCourse != course) {
				if(currentCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Course name already exist");
				}
			}
		}
		
				
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		System.out.println();
	}
}
