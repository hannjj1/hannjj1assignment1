package passignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentReader {
	public StudentReader() {

	}

	public static void load(ArrayList<Student> students) {
		char sex;
		int age;
		char parentalStatus;
		String guardian;
		int studyTime;
		int failures;
		boolean activities;
		boolean romanticPartner;
		int freeTime;
		int dailyAlcoholConsumption;
		int weeklyAlcoholConsumption;
		int absences;
		int count = 0;
		String line;

		try {
			BufferedReader in = new BufferedReader(new FileReader("Students.csv"));
			while ((line = in.readLine()) != null) {
				String[] fields = line.split(",");
				sex = fields[0].charAt(0);
				age = Integer.parseInt(fields[1]);
				parentalStatus = fields[2].charAt(0);
				guardian = fields[3];
				studyTime = Integer.parseInt(fields[4]);
				failures = Integer.parseInt(fields[5]);
				activities = Boolean.parseBoolean(fields[6]);
				romanticPartner = Boolean.parseBoolean(fields[7]);
				freeTime = Integer.parseInt(fields[8]);
				dailyAlcoholConsumption = Integer.parseInt(fields[9]);
				weeklyAlcoholConsumption = Integer.parseInt(fields[10]);
				absences = Integer.parseInt(fields[11]);
				students.add(new Student(sex, age, parentalStatus, guardian, studyTime, failures, activities,
						romanticPartner, freeTime, dailyAlcoholConsumption, weeklyAlcoholConsumption, absences));
			}
			in.close();
			System.out.println(students);
		} catch (IOException e) {
			System.out.println("There was a problem with the file!");
			e.printStackTrace();
		} catch (NumberFormatException ne) {
			System.out.println("Not a Number!");
			ne.printStackTrace();
		}

	}
}
