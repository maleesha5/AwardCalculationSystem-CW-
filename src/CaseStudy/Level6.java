package CaseStudy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.paint.Color;

public class Level6 {
	Scanner sc = new Scanner(System.in);

	int[] marks;
	{// declaration of array
		marks = new int[19];
		// to get marks as input
		int n = 0;
		System.out.println("Please Enter Level 06 Marks of the Student!");
		System.out.println("");

		for (int i = 1; i <= 6; i++) {// looping through modules
			System.out.println("ENTER Module" + (i));
			System.out.print("Coursework Mark:");
			marks[++n] = sc.nextInt();
			System.out.println("");

			double ans = Marks.marksValidate(marks[n]);
			marks[n] = (int) ans;

			for (int j = 1; j <= 2; j++) {// looping through components
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

		ArrayList<Double> awrd = Marks.awardCal2(ans);

		int[] temp = new int[6];
		int i = 0;
		for (double str : awrd) {
			temp[i] = (int) str;
			i++;
		}

		BufferedWriter outputWriter = null;
		try {
			outputWriter = new BufferedWriter(new FileWriter("1st Attempt Marks(LEVEL 06).txt"));

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
		try {
			outputWriter.write(Student.getFirstName());
			outputWriter.write(" " + Student.getLastName());
			outputWriter.newLine();
			outputWriter.write("ID:" + Student.getStudentId());
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

		ArrayList<Integer> arraylvl5 = null;
		try {
			arraylvl5 = Marks.readFile("1st Attempt Marks(LEVEL 05).txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<Integer> arraylvl6 = null;
		try {
			arraylvl6 = Marks.readFile("1st Attempt Marks(LEVEL 06).txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// parsing ArrayList values to a Integer Array
		Integer marksPassed1[] = arraylvl6.toArray(new Integer[arraylvl6.size()]);
		Integer marksPassed[] = arraylvl5.toArray(new Integer[arraylvl5.size()]);
		// sorting final Module marks in Level 5
		for (int i1 = marksPassed.length - 1; i1 >= 0; i1--) {
			for (int j = 0; j < i1; j++) {
				if (marksPassed[j] > marksPassed[j + 1]) {
					int temp1 = marksPassed[j];
					marksPassed[j] = marksPassed[j + 1];
					marksPassed[j + 1] = temp1;
				}

			}
		}
		// sorting final Module marks in Level 6
		for (int i1 = marksPassed1.length - 1; i1 >= 0; i1--) {
			for (int j = 0; j < i1; j++) {
				if (marksPassed1[j] > marksPassed1[j + 1]) {
					int temp1 = marksPassed1[j];
					marksPassed1[j] = marksPassed1[j + 1];
					marksPassed1[j + 1] = temp1;
				}

			}
		}

		Integer sum1 = 0;// declaring and initializing variables sum1
							// and sum
		Integer sum = 0;

		if (marksPassed[5] < marksPassed1[5]) {// finding least mark in
												// level 5 and level 6

			for (int i1 = 1; i1 < marksPassed.length; i1++) {

				sum += Integer.valueOf(marksPassed[i1]);
			}
			for (int i1 = 0; i1 < marksPassed1.length; i1++) {

				sum1 += Integer.valueOf(marksPassed1[i1]);
			}
			Integer avg5 = sum / 15;// calculating final mark
			Integer avg6 = sum1 / 9;
			Integer fnmarks = avg5 + avg6;
			System.out.println("Final Mark: ");

			System.out.println(fnmarks);
			System.out.println("Degree Status: ");
			if (fnmarks >= 70) {// Checking final degree status

				System.out.println("1st CLASS HONOURS!");
			} else if (fnmarks < 70 && fnmarks >= 60) {

				System.out.println("2nd CLASS HONOURS UPPER DIVISION!");

			} else if (fnmarks < 60 && fnmarks >= 50) {

				System.out.println("2nd CLASS HONOURS LOWER DIVISION!");

			} else {

				System.out.println("3rd CLASS HONOURS!");
			}

		} else {// removing least mark in level 6
			for (int i1 = 0; i1 < marksPassed.length; i1++) {

				sum += Integer.valueOf(marksPassed[i1]);
			}
			for (int i1 = 1; i1 < marksPassed1.length; i1++) {

				sum1 += Integer.valueOf(marksPassed1[i1]);
			}
			Integer avg5 = sum / 18;
			Integer avg6 = (sum1 + sum1) / 15;
			Integer fnmarks = avg5 + avg6;
			System.out.println("Final Mark: ");

			System.out.println(fnmarks);// calculating final
										// mark
			System.out.println("Degree Status: ");

			if (fnmarks >= 70) {// Checking final degree status

				System.out.println("1st CLASS HONOURS!");
			} else if (fnmarks < 70 && fnmarks >= 60) {

				System.out.println("2nd CLASS HONOURS UPPER DIVISION!");

			} else if (fnmarks < 60 && fnmarks >= 50) {

				System.out.println("2nd CLASS HONOURS LOWER DIVISION!");

			} else {

				System.out.println("3rd CLASS HONOURS!");
			}
		}

	}

}
