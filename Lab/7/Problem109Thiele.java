
public class Problem109Thiele {
	public static void main(String[] args) {

		Course cmpt220 = new Course("cpmt220");


		cmpt220.addStudent("Austin");
		cmpt220.addStudent("Ryan");
		cmpt220.addStudent("Joe");

	
		cmpt220.dropStudent("Ryan");


		System.out.println("The students in the course " + 
				cmpt220.getCourseName() + ":");
		String[] students = cmpt220.getStudents();
		for (int i = 0; i < cmpt220.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " , ");
		}
		System.out.println();
	}
}

