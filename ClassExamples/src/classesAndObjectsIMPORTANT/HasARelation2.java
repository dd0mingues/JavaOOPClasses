package classesAndObjectsIMPORTANT;

public class HasARelation2 {

	public static void main(String[] args) {

		// make a school
		School cenit = new School();
		cenit.name = "Cenit College";

		// make teachers
		Teacher profMcCann = new Teacher("Thomas Mc Cann");
		Teacher profJones = new Teacher("Prof Jones");

		// make students
		Student stu1 = new Student("Eoin");
		Student stu2 = new Student("Larissa");
		Student stu3 = new Student("Diogo");
		Student stu4 = new Student("Georgios");
		Student stu5 = new Student("Denis");
		Student stu6 = new Student("Garry");
		Student stu7 = new Student("Peter");

		// make classrooms
		Classroom room5 = new Classroom();
		room5.roomNumber = 5;
		room5.students = new Student[] { stu1, stu2, stu3, stu4, stu5, stu6, stu7 };
		room5.teacher = profMcCann;

		Classroom room7 = new Classroom();
		room7.roomNumber = 7;
		room7.students = new Student[] { stu1, stu5, stu6, stu7 };
		room7.teacher = profJones;

		// add the classrooms to the school
		cenit.rooms = new Classroom[] { room5, room7 };

		// show the students in each classroom in cenit
		for (Classroom room : cenit.rooms) {
			System.out.println(
					"Classroom number " + room.roomNumber + " has " + room.teacher.name + " for it's teacher.");
			String studentString = "";
			for (Student student : room.students) {
				if (student.name.equals(room.students[room.students.length - 2].name)) {
					//this if statement is just to get an "and" before the last name, rather than a comma
					studentString += student.name + " and ";
				} else {
					studentString += student.name + ", ";
				}
			}
			studentString = studentString.substring(0, studentString.length() - 2);
			System.out.println("The students in this class are " + studentString);
		}
	}

}

class School {
	String name;
	Classroom[] rooms;
}

class Classroom {
	int roomNumber;

	Student[] students;
	Teacher teacher;
}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}
}

class Teacher {
	String name;

	public Teacher(String name) {
		this.name = name;
	}
}