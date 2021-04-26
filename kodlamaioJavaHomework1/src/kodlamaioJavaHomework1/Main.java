package kodlamaioJavaHomework1;


public class Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.id = 1;
		course.name = "C#, Angular";
		course.instructorName = "Engin Demiroð";
		course.details = "Yazýlým Geliþtirici Yetiþtirme Kampý";
		
		Course course1 = new Course(2, "Java, React", "Engin Demiroð", "Yazýlým Geliþtirici Yetiþtirme Kampý");
		
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
        courseProgram.lessonProgram = "Kamp tanýtýmý ve tanýþma. Kamptan en büyük faydayý nasýl saðlarsýnýz?"
        		+ "Gerçek hayatla iliþkilendirilmiþ programlamaya giriþ. JAVA Temelleri 1. Deðiþkenler, þart bloklarý, döngüler, diziler."
        		+ "Quiz sistemine yönlendirme. Canlý yayýn sonrasý videolar, ödevler, testler buraya eklenecektir."
        		+ "Canlý yayýn YouTube kanalýmda gerçekleþecek. Yayýn alanýna ulaþmak için týklayýnýz.Abone olup hatýrlatýcý eklemeyi unutmayýnýz."
        		+ "Canlý yayýn tarihi : 21 Nisan 2021 Canlý yayýn saati : 21.00 Canlý yayýn süresi : 3 ders saati";
        courseProgram.registration = "url";
        courseProgram.evaluation ="Birinci gün kamp programýmýzý nasýl buldunuz?"
        		+ "Sorularýnýza cevap alabildiniz mi?"
        		+ "Ödevleri nasýl buldunuz?";
        Homework homework1 = new Homework(1, "Java dilinde kullanýlan diðer veri tiplerini araþtýrýnýz. Araþtýrma sonucunda ortaya çýkan bilgileri bu ödevin yorum kýsmýnda paylaþýnýz.");
        Homework homework2 = new Homework(2, "Altin.in sitesine gidiniz. Bu sitede þart bloklarýyla kodlanmýþ alanlarý ekran görüntüsü üzerinde gösteriniz.");
        Homework[] homeworks = {homework1, homework2};
         for (int i = 0; i < homeworks.length; i++) {
			courseProgram.homework = homeworks[i];
			System.out.println(courseProgram.homework.description);
		}
        CourseProgramManager courseProgramManager = new CourseProgramManager();
        courseProgramManager.Add(courseProgram);
        
        Instructor instructor = new Instructor(1, "Engin Demiroð");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Add(instructor);
        
        
	}
} 


