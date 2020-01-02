package Dec26;

import javax.swing.SwingConstants;

import org.apache.bcel.generic.SWITCH;

public class Statement {

	public static void main(String[] args) {
		String course="QTP";
		switch (course.toUpperCase()) {
		case "QTP":
			System.out.println("course is Availble");
			break;
		case "MANUAL":
			System.out.println("course is Availble");
			break;
		case "SELENIUM":
			System.out.println("course is Availble");
			break;
		default:
			System.out.println("course is not Available");
			break;
		}				

	}

}
