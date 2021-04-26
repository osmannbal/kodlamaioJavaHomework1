package kodlamaioJavaHomework1;


public class Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.id = 1;
		course.name = "C#, Angular";
		course.instructorName = "Engin Demiro�";
		course.details = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�";
		
		Course course1 = new Course(2, "Java, React", "Engin Demiro�", "Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
		
		Course[] courses = {course1, course};
		for (int i = 0; i < courses.length; i++) {
			Course course2 = courses[i];
			System.out.println(course2.name);
			System.out.println(course2.details);
			System.out.println(course2.instructorName);
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course2);
		}
		
		Category category = new Category(1, "Programlama");
		System.out.println(category.name);
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(category);
		
		CourseProgram courseProgram = new CourseProgram();
		courseProgram.id = 1;
		courseProgram.day = 1;
		courseProgram.datetime = 21/04/2021;
        courseProgram.lessonProgram = "Kamp tan�t�m� ve tan��ma. Kamptan en b�y�k fayday� nas�l sa�lars�n�z?"
        		+ "Ger�ek hayatla ili�kilendirilmi� programlamaya giri�. JAVA Temelleri 1. De�i�kenler, �art bloklar�, d�ng�ler, diziler."
        		+ "Quiz sistemine y�nlendirme. Canl� yay�n sonras� videolar, �devler, testler buraya eklenecektir."
        		+ "Canl� yay�n YouTube kanal�mda ger�ekle�ecek. Yay�n alan�na ula�mak i�in t�klay�n�z.Abone olup hat�rlat�c� eklemeyi unutmay�n�z."
        		+ "Canl� yay�n tarihi : 21 Nisan 2021 Canl� yay�n saati : 21.00 Canl� yay�n s�resi : 3 ders saati";
        courseProgram.registration = "url";
        courseProgram.evaluation ="Birinci g�n kamp program�m�z� nas�l buldunuz?"
        		+ "Sorular�n�za cevap alabildiniz mi?"
        		+ "�devleri nas�l buldunuz?";
        Homework homework1 = new Homework(1, "Java dilinde kullan�lan di�er veri tiplerini ara�t�r�n�z. Ara�t�rma sonucunda ortaya ��kan bilgileri bu �devin yorum k�sm�nda payla��n�z.");
        Homework homework2 = new Homework(2, "Altin.in sitesine gidiniz. Bu sitede �art bloklar�yla kodlanm�� alanlar� ekran g�r�nt�s� �zerinde g�steriniz.");
        Homework[] homeworks = {homework1, homework2};
         for (int i = 0; i < homeworks.length; i++) {
			courseProgram.homework = homeworks[i];
			System.out.println(courseProgram.homework.description);
		}
        CourseProgramManager courseProgramManager = new CourseProgramManager();
        courseProgramManager.Add(courseProgram);
        
        Instructor instructor = new Instructor(1, "Engin Demiro�");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Add(instructor);
        
        
	}
} 


