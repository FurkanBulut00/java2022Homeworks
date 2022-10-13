package kodlamaIo.dataAccess.concretes.jdbc;

import kodlamaIo.dataAccess.abstracts.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManagerJdbc implements CategoryDao {

	@Override
	public void saveCategory(Category category) {
		System.out.println("JDBC ile " + category.getCategoryName() + " eklendi");

	}

	@Override
	public void deleteCategory(int id) {
		System.out.println("JDBC ile kategori silindi");

	}

	@Override
	public boolean getCategoryByName(String categoryName) {
		return false;
		// TODO Auto-generated method stub

	}

}
