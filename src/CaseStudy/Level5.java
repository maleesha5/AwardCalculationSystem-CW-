package CaseStudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Level5 {

	Scanner sc = new Scanner(System.in);

	int[] marks;
	{// declaration of array
		marks = new int[19];
		// to get marks as input
		int n = 0;
		System.out.println("Please Enter Level 05 Marks of the Student!");
		System.out.println("");

		for (int i = 1; i <= 6; i++) {//looping through modules
			System.out.println("ENTER Module " + (i));
			System.out.print("Coursework Mark:");
			marks[++n] = sc.nextInt();
			System.out.println("");
			double ans = Marks.marksValidate(marks[n]);
			marks[n] = (int) ans;

			for (int j = 1; j <= 2; j++) {//looping through components 
				System.out.println("ENTER Module" + (i));
				System.out.print("ICT" + (j) + " Mark:");
				marks[++n] = sc.nextInt();
				System.out.println("");

				double ans1 = Marks.marksValidate(marks[n]);
				marks[n] = (int) ans1;

			}
		}
		double[] ans = Marks.average(marks);
	
		double[] ansi = Attempts.referral(ans);
		
		double[] ansi1 = Attempts.retake(ansi);
		
		double[] ansi2 = Attempts.referral2(ansi1);// calling referral2 method
												   // in Attempts class
		Marks.awardCal4(ansi2);
		
		ArrayList<Double> awrd = Marks.awardCal(ans);
		int[] temp = new int[6];
		int i = 0;
		for (double str : awrd) {
			temp[i] = (int) str;
			i++;
		}

		BufferedWriter outputWriter = null;
		try {
			outputWriter = new BufferedWriter(new FileWriter("1st Attempt Marks(LEVEL 05).txt"));
			




		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int y = 0; y < temp.length && temp[y] > 0; y++) {

			try {
				outputWriter.write(temp[y] + "");
				outputWriter.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		try {outputWriter.write(Student.getFirstName());
			outputWriter.write(" "+Student.getLastName());
			outputWriter.newLine();
			outputWriter.write("ID:"+Student.getStudentId());
			outputWriter.newLine();
			outputWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			outputWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");

		System.out.println("Do You Want Continue to Level6?");
		System.out.println("YES,Enter 1");
		System.out.println("NO,Enter 2");
		System.out.print("Selection: ");
		System.out.println("");

		Scanner q = new Scanner(System.in);
		switch (q.nextInt()) {
		case 1:
			System.out.println("Proceeding to Level6...");
			System.out.println("");

			new Level6();

			break;

		case 2:
			System.out.println("Closing Program...");
			System.exit(0);
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
	}
}
