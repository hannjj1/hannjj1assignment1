package passignment1;

public class Student {
	private char sex;
	private int age;
	private char parentalStatus; // Together or Apart
	private String guardian;
	private int studyTime; // Measured in Hours
	private int failures; // Measured in Failed Papers
	private boolean activities;
	private boolean romanticPartner;
	private int freeTime; // Measured in Hours
	private int dailyAlcoholConsumption; // Measured in Standard Drinks
	private int weeklyAlcoholConsumption; // Measured in Standard Drinks
	private int absences; // Measured in Days

	public Student(char sex, int age, char parentalStatus, String guardian, int studyTime, int failures,
			boolean activites, boolean romanticPartner, int freeTime, int dailyAlcoholConsumption,
			int weeklyAlcoholConsumption, int absences) {
		super();
		this.sex = sex;
		this.age = age;
		this.parentalStatus = parentalStatus;
		this.guardian = guardian;
		this.studyTime = studyTime;
		this.failures = failures;
		this.activities = activities;
		this.romanticPartner = romanticPartner;
		this.freeTime = freeTime;
		this.dailyAlcoholConsumption = dailyAlcoholConsumption;
		this.weeklyAlcoholConsumption = weeklyAlcoholConsumption;
		this.absences = absences;
	}

//Getters
	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public char getParentalStatus() {
		return parentalStatus;
	}

	public int getFailures() {
		return failures;
	}

	public String getGuardian() {
		return guardian;
	}

	public int getStudyTime() {
		return studyTime;
	}

	public boolean isActivities() {
		return activities;
	}

	public boolean isRomanticPartner() {
		return romanticPartner;
	}

	public int getFreeTime() {
		return freeTime;
	}

	public int getDailyAlcoholConsumption() {
		return dailyAlcoholConsumption;
	}

	public int getWeeklyAlcoholConsumption() {
		return weeklyAlcoholConsumption;
	}

	public int getAbsences() {
		return absences;
	}

//Setters
	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setParentalStatus(char parentalStatus) {
		this.parentalStatus = parentalStatus;
	}

	public void setFailures(int failures) {
		this.failures = failures;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	public void setStudyTime(int studyTime) {
		this.studyTime = studyTime;
	}

	public void setActivities(boolean activites) {
		this.activities = activities;
	}

	public void setRomanticPartner(boolean romanticPartner) {
		this.romanticPartner = romanticPartner;
	}

	public void setFreeTime(int freeTime) {
		this.freeTime = freeTime;
	}

	public void setDailyAlcoholConsumption(int dailyAlcoholConsumption) {
		this.dailyAlcoholConsumption = dailyAlcoholConsumption;
	}

	public void setWeeklyAlcoholConsumption(int weeklyAlcoholConsumption) {
		this.weeklyAlcoholConsumption = weeklyAlcoholConsumption;
	}

	public void setAbsences(int absences) {
		this.absences = absences;
	}

	@Override
	public String toString() {
		return "Student [sex=" + sex + ", age=" + age + ", parentalStatus=" + parentalStatus + ", guardian=" + guardian
				+ ", studyTime=" + studyTime + ", failures=" + failures + ", activities=" + activities
				+ ", romanticPartner=" + romanticPartner + ", freeTime=" + freeTime + ", dailyAlcoholConsumption="
				+ dailyAlcoholConsumption + ", weeklyAlcoholConsumption=" + weeklyAlcoholConsumption + ", absences="
				+ absences + "]";
	}

}
