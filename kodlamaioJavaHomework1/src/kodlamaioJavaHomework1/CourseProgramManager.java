package kodlamaioJavaHomework1;

public class CourseProgramManager {
	public void Add(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". G�n program� eklendi.");
	}
	
	public void Update(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". G�n program� g�ncellendi.");
	}
	
	public void Delete(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". G�n program� silindi.");
	}
}
