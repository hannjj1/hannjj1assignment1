package passignment1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class StudentGUI extends JFrame {

	private ArrayList<Student> students;

	private ChartPanel myChartPanel;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane = new JScrollPane();
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	private DefaultTableModel tm = new DefaultTableModel(new Object[][] {},
			new String[] { "Sex", "Age", "Parental Status", "Guardian", "Study Time", "Failures", "Activities",
					"Romantic Partner", "Free Time", "Daily Alcohol Consumption", "Weekly Alcohol Consumption",
					"Absences" });

	/**
	 * Create the frame.
	 */
	public StudentGUI(ArrayList<Student> students) {
		super("Student Alcohol Consumption");
		this.students = students;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(35, 32, 591, 264);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("All Data", null, panel, null);
		panel.setLayout(null);
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("Pie Graph", null, panel2, null);
		panel2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 566, 214);
		panel.add(scrollPane);

		table = new JTable();
		new DefaultTableModel(new Object[][] {},
				new String[] { "Sex", "Age", "Parental Status", "Guardian", "Study Time", "Failures", "Activities",
						"Romantic Partner", "Free Time", "Daily Alcohol Consumption", "Weekly Alcohol Consumption",
						"Absences" });
		table.setModel(tm);
		scrollPane.setViewportView(table);
		drawTable();
		createAPie();
	}

	public void drawTable() {
		tm.setRowCount(0);
		for (int i = 0; i < 394; i++) {
			Object[] object = new Object[12];
			object[0] = students.get(i).getSex();
			object[1] = students.get(i).getAge();
			object[2] = students.get(i).getParentalStatus();
			object[3] = students.get(i).getGuardian();
			object[4] = students.get(i).getStudyTime();
			object[5] = students.get(i).getFailures();
			object[6] = students.get(i).isActivities();
			object[7] = students.get(i).isRomanticPartner();
			object[8] = students.get(i).getFreeTime();
			object[9] = students.get(i).getDailyAlcoholConsumption();
			object[10] = students.get(i).getWeeklyAlcoholConsumption();
			object[11] = students.get(i).getAbsences();
			tm.addRow(object);
		}
	}

	public void createAPie() {
		DefaultPieDataset data = new DefaultPieDataset();
		for (int i = 0; i < students.size(); i++) {
			if ((students.get(i).getSex()) == 'M') {
				int maleFailures = students.get(i).getFailures();
				data.setValue("Male", maleFailures);
			} else if ((students.get(i).getSex()) == 'F') {
				int femaleFailures = students.get(i).getFailures();
				data.setValue("Female", femaleFailures);
			}
		}

		JFreeChart chart = ChartFactory.createPieChart("Failed papers per sex", data, true, true, Locale.ENGLISH);

		myChartPanel = new ChartPanel(chart);
		myChartPanel.setVisible(true);
		myChartPanel.setBounds(100, 100, 100, 100);
		tabbedPane.add("Pie Graph", myChartPanel);
		myChartPanel.setLayout(null);
	}

}
