package kodlamaioJavaHomework1;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println(instructor.name + " eklendi.");
	}
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.name + " silindi.");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.name + " güncellendi.");
	}
}
