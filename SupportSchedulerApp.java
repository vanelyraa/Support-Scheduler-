/*
@Vanessa Lyra
x19234554
*/

import javax.swing.JOptionPane;  //imports the JOptionPane

public class SupportSchedulerApp{ // starts the program

	public static void main (String args []){ //main method of the program

		//Declare variables - memory locations to store a value
		String subject, message;		//subject stores the sujbect from user input, message stores the message to be shown to the user
		int time;   					//used to store the duration of the support class

		//Create objects - declare the name of the object
		SupportScheduler mySUP = new SupportScheduler();

		//Input - message asking the user to input the chosen data(each one has just a character the reduce typo errors)
		subject = JOptionPane.showInputDialog(null, "Please enter the letter matching the subject P:Programming, W: Web Design, D: Databases");
		mySUP.setSubject(subject);

		time = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number matching the duration 1: Up to 45 min, 2: from 45 to 90 min, 3: from 90 to 130min"));
		mySUP.setTime(time);
		subject = subject.toLowerCase(); //accepts form the user lower/upper case letter for subject

		//Process
		mySUP.compute();

		//Output
		message = mySUP.getMessage();
		JOptionPane.showMessageDialog(null, message );  //message shown to the user according to the IF statement
//
	}

}


