// Question 5

// A student taking a module at the University is assessed both on the exam paper 
// and continuous assessment. Continuous assessment is on 50 marks 
// while the exam is on 100 marks. To obtain a pass in a Module a student must 
// score more than 40% in each component. 
// If a student scores more than 80% in one component but has scored 
// between 35% and 40% (inclusive) in the other component he/she is “Pushed Up”. 
// Write a program to enter a student’s marks in each component and enter whether 
// he/she has passed, failed or been “pushed up”.


import java.util.Scanner;

public class AssessmentMarks 
{
	public static void main(String [] args)
	{
		Scanner values = new Scanner(System.in);
		
		double examPaper = 100 , continousAssessment = 50 , pass1, pass2,pushedUpExam1 , 
				pushedUpExam2 ,pushedUpExam3,pushedUpcontinous1,pushedUpcontinous2,pushedUpcontinous3;
		
		System.out.println("Please Enter Marks for EXAM PAPER maximum marking 100: ");
		double examMarks = values.nextDouble();
		
		System.out.println("Please Enter Marks for CONTINUOUS ASSESSMENT maximum marking 50: ");
		double continousMarks = values.nextDouble();
		
		
		pass1 = 40.0/100.0 * examPaper;
		pass2 = 40.0/100.0 * continousAssessment;
		
		pushedUpExam1 = 80.0/100 * examPaper;
		pushedUpExam2 = 35.0/100.0 * examPaper;
		pushedUpExam3 = 40.0/100.0 * examPaper;
		
		
		pushedUpcontinous1 = 80.0/100 * continousAssessment;
		pushedUpcontinous2 = 35.0/100.0 * continousAssessment;
		pushedUpcontinous3 = 40.0/100.0 * continousAssessment;
		
		
		
		if((examMarks < 0 || continousMarks < 0) || ( examMarks > 100 || continousMarks > 50))
		{
			System.out.println("Enter a vaild number");
		}
		
		
		else if ((examMarks >= pushedUpExam1) && (continousMarks >= pushedUpcontinous2 || continousMarks >= pushedUpcontinous3))
		{
			System.out.println("Pushed up!");
		}
		else if ((continousMarks >= pushedUpcontinous1) && (examMarks >= pushedUpExam2 || examMarks >= pushedUpExam3))
		{
			System.out.println("Pushed up!");
		}
		else if (examMarks >=pass1 &&  continousMarks >= pass2)
		{
			System.out.println("Passed");
		}
		
		else
		{
			System.out.println("Failed!!!");
		}
		
	}

}
