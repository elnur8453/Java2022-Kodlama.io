/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaiodemo.dataAccess;

import kodlamaiodemo.entities.Course;
/**
 *
 * @author ASUS
 */
public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course){
        System.out.println("Added to database with Hibernate.");
    }
}
