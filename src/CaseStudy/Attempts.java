package CaseStudy;

import java.util.Scanner;

public class Attempts {

	int[] marks;

	public static double[] referral(double[] ans) {
		Scanner sc = new Scanner(System.in);


		double[] refArray = new double[6];

		if (ans[6] != 0.0) {
			System.out.println("Module1 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[0] = nMark1;
		}
		if (ans[7] != 0.0) {
			System.out.println("Module2 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[1] = nMark1;
		}
		if (ans[8] != 0.0) {
			System.out.println("Module3 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[2] = nMark1;
		}
		if (ans[9] != 0.0) {
			System.out.println("Module4 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[3] = nMark1;
		}
		if (ans[10] != 0.0) {
			System.out.println("Module5 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[4] = nMark1;
		}
		if (ans[11] != 0.0) {
			System.out.println("Module6 Failed!");
			System.out.println("Enter Referral Marks(2nd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[5] = nMark1;
		}

		return refArray;

	}

	public static double[] retake(double[] ansi) {
		double[] refArray = new double[6];
		Scanner sc = new Scanner(System.in);

		if (ansi[0] <= 40 && ansi[0] != 0.0) {
			System.out.println("Module1 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[0] = nMark1;
		}
		if (ansi[1] <= 40 && ansi[1] != 0.0) {
			System.out.println("Module2 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[1] = nMark1;
		}
		if (ansi[2] <= 40 && ansi[2] != 0.0) {
			System.out.println("Module3 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[2] = nMark1;
		}
		if (ansi[3] <= 40 && ansi[3] != 0.0) {
			System.out.println("Module4 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[3] = nMark1;
		}
		if (ansi[4] <= 0 && ansi[4] != 0.0) {
			System.out.println("Module5 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[4] = nMark1;
		}
		if (ansi[5] <= 40 && ansi[5] != 0.0) {
			System.out.println("Module6 Failed!");
			System.out.println("Enter Retake Marks(3rd Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[5] = nMark1;
		}

		return refArray;

	}

	public static double[] referral2(double[] ansi1) {
		double[] refArray = new double[6];
		Scanner sc = new Scanner(System.in);

		if (ansi1[0] <= 40 && ansi1[0] != 0.0) {
			System.out.println("Module1 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[0] = nMark1;
		}
		if (ansi1[1] <= 40 && ansi1[1] != 0.0) {
			System.out.println("Module2 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[1] = nMark1;
		}
		if (ansi1[2] <= 40 && ansi1[2] != 0.0) {
			System.out.println("Module3 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[2] = nMark1;
		}
		if (ansi1[3] <= 40 && ansi1[3] != 0.0) {
			System.out.println("Module4 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[3] = nMark1;
		}
		if (ansi1[4] <= 0 && ansi1[4] != 0.0) {
			System.out.println("Module5 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[4] = nMark1;
		}
		if (ansi1[5] <= 40 && ansi1[5] != 0.0) {
			System.out.println("Module6 Failed!");
			System.out.println("Enter Referral Marks(4th Attempt):");
			int mark1 = sc.nextInt();
			double nMark1 = Marks.marksValidate(mark1);
			refArray[5] = nMark1;
		}

		return refArray;

	}

}
