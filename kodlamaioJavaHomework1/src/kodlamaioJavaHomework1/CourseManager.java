package kodlamaioJavaHomework1;

public class CourseManager {
	public void Add(Course course) {
		System.out.println(course.name + " eklendi.");
	}
	
	public void Update(Course course) {
		System.out.println(course.name + " gŁncelendi.");
	}
	
	public void Delete(Course course) {
		System.out.println(course.name + " silindi.");
	}
}
