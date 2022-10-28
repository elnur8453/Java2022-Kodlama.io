/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaiodemo.dataAccess;

import kodlamaiodemo.entities.Category;
/**
 *
 * @author ASUS
 */
public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category){
        System.out.println("Added to database with JDBC.");
    }
}
