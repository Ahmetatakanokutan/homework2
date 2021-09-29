package homework_2;

public class Main {

	public static void main(String[] args) {
	
		instructor egitmen =  new instructor();
		egitmen.setName("engin");
		egitmen.setId("53453");
		
		student ogrenci = new student();
		ogrenci.setName("atakan");
		ogrenci.setId("43242");
		
		InstructorManager instructor = new InstructorManager();
		instructor.addToLesson(egitmen);
		instructor.addHomework(egitmen);
		StudentManager instructor2 = new StudentManager();
		instructor2.addToLesson(ogrenci);
		instructor2.addHomework(ogrenci);
	}

}
