package kodlamaIo.business.concretes;

import kodlamaIo.business.abstracts.CategoryService;
import kodlamaIo.core.loggers.LogHelper;
import kodlamaIo.dataAccess.abstracts.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager implements CategoryService {

	CategoryDao categoryDao;
	LogHelper logHelper;

	public CategoryManager(CategoryDao categoryDao, LogHelper logHelper) {
		super();
		this.categoryDao = categoryDao;
		this.logHelper = logHelper;
	}

	@Override
	public void addCategory(Category category) throws Exception {
		if (categoryDao.getCategoryByName(category.getCategoryName()) == false) {
			categoryDao.saveCategory(category);
			logHelper.log(category.getCategoryName());
		} else {
			throw new Exception("Kategori Eklenemedi VAH VAH!");
		}

	}

	@Override
	public void deleteCategory(int id) {
		categoryDao.deleteCategory(id);

	}

}
