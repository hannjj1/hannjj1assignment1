package passignment1;

import java.util.ArrayList;

public class StudentApp {

	public StudentApp() {

	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		StudentReader.load(students);

		StudentGUI gui = new StudentGUI(students);
		gui.setVisible(true);
	}
}
