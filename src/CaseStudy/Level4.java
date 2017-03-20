package CaseStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level4 {
	{
		Scanner sc = new Scanner(System.in); // Creating new object in Scanner
												// class
		// Prompting user for Student Details
		System.out.print("Please Enter First Name of the Student:");
		String name = sc.next();
		System.out.print("Please Enter Last Name of the Student:");
		String namelast = sc.next();
		System.out.print("Enter Student ID:");
		String id = sc.next();
		System.out.println("");

		Student obj = new Student(name, namelast, id, null, null, null, null, null, null); // Creating
																							// a
																							// new
																							// object
		// in student class

		Module mod1 = new Module("Module 1", "#1", 40); // Creating new objects
														// in Module class and
														// passing values
		Module mod2 = new Module("Module 2", "#2", 20);
		Module mod3 = new Module("Module 3", "#3", 20);
		Module mod4 = new Module("Module 4", "#4", 20);
		Module mod5 = new Module("Module 5", "#5", 20);
		Module mod6 = new Module("Module 6", "#6", 20);
		List<Object> modList = new ArrayList<Object>();// Creating a new List of objects To
														// loop through objects
														
		modList.add(mod1);// Adding objects to ArrayList modList
		modList.add(mod2);
		modList.add(mod3);
		modList.add(mod4);
		modList.add(mod5);
		modList.add(mod6);

		Semester sem1 = new Semester(null);
		sem1.setLevel("Level 04");

		Marks m1 = new Marks("ICT1", 0, null);
		Marks m2 = new Marks("ICT2", 0, null);
		Marks m3 = new Marks("Coursework", 0, null);

		List<Object> comList = new ArrayList<Object>(); // Creating a new
														// ArrayList with
														// objects
		comList.add(m1);// Adding objects to comList modList
		comList.add(m2);
		comList.add(m3);
		System.out.println("Please Enter " + sem1.getLevel() + " Marks of the Student!");
		System.out.println("");
		int[] fMarks = new int[19];// Initializing fMarks integer array with the
									// length 19
		int n = 0;// initializing variable n

		for (int i = 0; i <= 5; i++) {// Looping through Modules
			System.out.println(((Module) modList.get(i)).getModuleCode());

			for (int j = 0; j <= 2; j++) {// Looping through Components
				System.out.println(((Marks) comList.get(j)).getComponentName() + ":");

				int mark = sc.nextInt();// passing entered value to integer mark
				double ans = Marks.marksValidate(mark);// passing mark to method
														// marksValidate
				mark = (int) ans;// casting returned double value to integer and passing variable mark
				fMarks[++n] = mark;// passing mark variable to fMark Array
				System.out.println("");
				((Marks) comList.get(j)).setMarks(mark);

			}
		}

		double[] ans = Marks.average(fMarks);// calling average method in Marks
												// class

		double[] ansi = Attempts.referral(ans);// calling referral method in
												// Attempts class

		double[] ansi1 = Attempts.retake(ansi);// calling retake method in
												// Attempts class

		double[] ansi2 = Attempts.referral2(ansi1);// calling referral2 method
													// in Attempts class

		Marks.awardCal4(ansi2);// calling method

		ArrayList<Double> attemeptsArray = Marks.status(ans, ansi, ansi1, ansi2);// calling
																					// method

		Marks.awardCal3(ans, attemeptsArray);// calling method

		/*
		 * List<Marks> marks = new ArrayList<Marks>();
		 * 
		 * marks.add(m1); marks.add(m2); marks.add(m3);
		 * 
		 * System.out.println(m1);
		 */

		obj.setModule1((int) ans[0]);
		obj.setModule2((int) ans[1]);
		obj.setModule3((int) ans[2]);
		obj.setModule4((int) ans[3]);
		obj.setModule5((int) ans[4]);
		obj.setModule6((int) ans[5]);

		File file = new File("Test.txt");// creating a new file
		FileOutputStream fos = null;// initializing file output Stream
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		FileInputStream sis = null;
		try {
			sis = new FileInputStream(file);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(sis);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			while (true) {
				Student s1 = (Student) ois.readObject();
				System.out.println(s1);

			}
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("COMPLETED");
			System.out.println("");

		}

		System.out.println("Do You Want Continue to Level5?");
		System.out.println("YES,Enter 1");
		System.out.println("NO,Enter 2");
		System.out.print("Selection: ");
		System.out.println("");

		Scanner q = new Scanner(System.in);
		switch (q.nextInt()) {// Creating a Switch case
		case 1:
			System.out.println("Proceeding to Level 5...");
			new Level5();
			System.out.println("");

			break;

		case 2:
			System.out.println("Closing Program...");
			System.exit(0);// closing the application
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}

	}

}
