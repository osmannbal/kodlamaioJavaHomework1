package kodlamaioJavaHomework1;



public class CourseProgram {
	public CourseProgram(int id, int day, int datetime, String lessonProgram,
			String registration, Homework homework, String evaluation) {
		this.id = id;
		this.day = day;
		this.datetime = datetime;
		this.lessonProgram = lessonProgram;
		this.registration = registration;
		this.homework = homework;
		this.evaluation = evaluation;
	}
	
	public CourseProgram() {
		
	}
	int id;
	int day;
	int datetime;
	String lessonProgram;
	String registration;
	String evaluation;
	Homework homework = new Homework();
}
