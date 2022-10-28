/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaiodemo.business;


import kodlamaiodemo.dataAccess.CategoryDao;
import kodlamaiodemo.entities.Category;
import kodlamaiodemo.core.logging.Logger;
/**
 *
 * @author ASUS
 */
public class CategoryManager {
    private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void addCategory(Category category) throws Exception  {
		for (Category currentCategory : categories) {
			if (currentCategory != category) {
				if (currentCategory.getCategoryName() == category.getCategoryName()) {
					throw new Exception("Caterories name already exist");
				}
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		System.out.println();
	}
}
