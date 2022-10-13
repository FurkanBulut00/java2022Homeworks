package kodlamaIo.business.abstracts;

import kodlamaIo.entities.Category;

public interface CategoryService {
	public void addCategory(Category category) throws Exception;

	public void deleteCategory(int id);

}
