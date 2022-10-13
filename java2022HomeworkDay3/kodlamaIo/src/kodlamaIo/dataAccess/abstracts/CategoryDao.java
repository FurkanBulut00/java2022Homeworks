package kodlamaIo.dataAccess.abstracts;

import kodlamaIo.entities.Category;

public interface CategoryDao {

	public void saveCategory(Category category);

	public void deleteCategory(int id);

	public boolean getCategoryByName(String categoryName);

}
