package kodlamaioJavaHomework1;

public class CategoryManager {
	public void Add(Category category) {
		System.out.println(category.name + " eklendi.");
	}
	
	public void Update(Category category) {
		System.out.println(category.name + " g�ncellendi.");
	}
	
	public void Delete(Category category) {
		System.out.println(category.name + " silindi.");
	}
}
