package homework_2;

public class StudentManager extends UserManager{

	public void addToLesson(user user1)
	{
		System.out.println(user1.getName() + " isimli ogrenci derse eklendi");
	}
	public void delete(user user1)
	{
		System.out.println(user1.getName() + "  isimli ogrenci dersten silindi");
	}
	public void addHomework(user user1){
		System.out.println(user1.getName() + "isimli ogrenci yeni bir odeve basladi");
	}
}
