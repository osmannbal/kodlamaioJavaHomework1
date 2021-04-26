package kodlamaioJavaHomework1;

public class CourseProgramManager {
	public void Add(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". Gün programý eklendi.");
	}
	
	public void Update(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". Gün programý güncellendi.");
	}
	
	public void Delete(CourseProgram courseProgram) {
		System.out.println(courseProgram.day + ". Gün programý silindi.");
	}
}
