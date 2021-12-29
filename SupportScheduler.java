/*
@Vanessa Lyra
x19234554
*/

public class SupportScheduler{

		//Declare variables
		private String subject, message; //type string stores text
		private int time;  //type int stores whole numbers

		//Constructors - initializes the objects
		public SupportScheduler (){
		}

		//Compute - do the calculations for the program
		public void compute (){ //IF statement used, a message will be sent to the output according to the subject and duration chosen.

			if((subject.equals("D") && time == 1)){
				message = "Monday";
			}
			else if((subject.equals("p") && time == 1) ||	(subject.equals("d") && time == 2)){
					message = "Your support session can be scheduled on Tuesday";
			}
			else if	((subject.equals("w") && time == 1) || (subject.equals("d") && time == 3)){
					message = "Your support session can be scheduled on Wednesday";
			}
			else if	((subject.equals("p") && time == 2)){
					message = "Your support session can be scheduled on Thursday";
			}
			else if	((subject.equals("p") && time == 3) || (subject.equals("w") && time == 2)){
					message = "Your support session can be scheduled on Friday";
			}
			else if	((subject.equals("w")) && time == 3){
					message = "Your support session can be scheduled on Saturday";
			}
			else {
				message = "Invalid data entered";
			}
		}

		//Setters and getters
		public void setSubject(String subject){  //one to each input from the user
		this.subject = subject;
		}

		public void setTime(int time){
		this.time = time;
		}

		public String getMessage(){  //one for every output
		return message;
	    }

}

