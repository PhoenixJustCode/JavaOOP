package users;

import java.util.Vector;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		User u1 = new Student("Nurtas", "nurtasik", "123123", "21bd", 2021, DegreeStudent.BACHELOR, FacultyType.FIT, "IS");
		
		Database.users.add(u1);
		
		Database db = new Database();
		db.serializeUser();
		System.out.println("okkkk");
		
		Vector<User> uuu = db.deserializeUser();
		System.out.println(uuu);
		
		Teacher t= new Teacher("Beisenbek", "Baisakov", "198574", 1000000, DegreeTeacher.LECTURER, FacultyType.FIT);
		Database.teachers.add(t);
		db.serializeTeacher();
		System.out.println("okkkk");
		
		Vector<Teacher> tt = db.deserializeTeacher();
		System.out.println(tt);
	}
}