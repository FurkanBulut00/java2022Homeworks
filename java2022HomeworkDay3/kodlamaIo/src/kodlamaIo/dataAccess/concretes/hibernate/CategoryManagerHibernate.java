package kodlamaIo.dataAccess.concretes.hibernate;

import kodlamaIo.dataAccess.abstracts.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManagerHibernate implements CategoryDao {

	@Override
	public void saveCategory(Category category) {
		System.out.println("Hibernate ile " + category.getCategoryName() + " eklendi");

	}

	@Override
	public void deleteCategory(int id) {
		System.out.println("Hibernate ile kategori silindi");

	}

	@Override
	public boolean getCategoryByName(String categoryName) {
		return false;
	}

}
