package CaseStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Marks {
private String ComponentName;
private int marks;
private List<Marks> list=new ArrayList<Marks>();

public String getComponentName() {
	return ComponentName;
}
public int getMarks() {
	return marks;
}

public List<Marks> getList() {
	return list;
}
public void setList(List<Marks> list) {
	this.list = list;
}
public void setComponentName(String componentName) {
	ComponentName = componentName;
}
public void setMarks(int marks) {
	this.marks = marks;
}

public Marks(String componentName, int marks, List<Marks> list) {
	super();
	ComponentName = componentName;
	this.marks = marks;
	this.list = list;
}
@Override
public String toString() {
	return "Marks [ComponentName=" + ComponentName + ", marks=" + marks + ", list=" + list + "]";
}
public static  double[] average(int[] fMarks) {//creating method average
	double[] avgMarks = new double[18];

	int avgMod1 = (fMarks[1] + fMarks[2] + fMarks[3]) / 3;
	if (avgMod1 >= 40) {
		avgMarks[0] = avgMod1;
	} else if (avgMod1 < 30) {
		avgMarks[6] = avgMod1;
	} else {
		avgMarks[12] = avgMod1;
		}

	int avgMod2 = (fMarks[4] + fMarks[5] + fMarks[6]) / 3;
	if (avgMod2 >= 40) {
		avgMarks[1] = avgMod2;
	} else if (avgMod2 < 30) {
		avgMarks[7] = avgMod2;
	} else {
		avgMarks[13] = avgMod2;
	}
	int avgMod3 = (fMarks[7] + fMarks[8] + fMarks[9]) / 3;
	if (avgMod3 >= 40) {
		avgMarks[2] = avgMod3;
	} else if (avgMod3 < 30) {
		avgMarks[8] = avgMod3;
	} else {
		avgMarks[14] = avgMod3;
	}
		int avgMod4 = (fMarks[10] + fMarks[11] + fMarks[12]) / 3;
		if (avgMod4 >= 40) {
			avgMarks[3] = avgMod4;
		} else if (avgMod4 < 30) {
			avgMarks[9] = avgMod4;
		} else {
			avgMarks[15] = avgMod4;
		}
			int avgMod5 = (fMarks[13] + fMarks[14] + fMarks[15]) / 3;
			if (avgMod5 >= 40) {
				avgMarks[4] = avgMod5;
			} else if (avgMod5 < 30) {
				avgMarks[10] = avgMod5;
			} else {
				avgMarks[16] = avgMod5;
			}
				int avgMod6 = (fMarks[16] + fMarks[17] + fMarks[18]) / 3;
				if (avgMod6 >= 40) {
					avgMarks[5] = avgMod6;
				} else if (avgMod6 < 30) {
					avgMarks[11] = avgMod6;
				} else {
					avgMarks[17] = avgMod6;
				}

			
		
	
	return avgMarks;//returning Array avgMarks
}

	Scanner sc=new Scanner(System.in);

	public static double marksValidate(int mark1) {//Creating method marksValidate 
		Scanner sc=new Scanner(System.in);


		    boolean invalid = true;//Initializing boolean variable invalid to true 
		    if (mark1 >100 || mark1 <0) {
		    do {
		        System.out.printf("Please enter a valid mark: ");

		        try {//Starting try block
		        	mark1 = sc.nextInt();

		            if (mark1 >= 0 && mark1 <= 100) {
		                invalid = false;
		            }
		        }
		        catch (InputMismatchException x) {//starting a catch block

		            System.out.println("Invalid entry, please try again");
		        
		        }
		    } while (invalid);//setting while condition
		
		
    }
		    return mark1;//returning array mark1  

	}
	public static ArrayList<Double> status(double[] ans,double[] ansi,double[] ansi1, double[] ansi2) {//Creating status method 
		ArrayList<Double> attemeptsArray = new ArrayList<Double>();
		System.out.println("");
		System.out.println("List of Modules Passed in 1st Attempt :");
		System.out.println("");
		for(int i=0;i<=5;i++){
			if(ans[i]!=0.0){
				System.out.println("Module:"+(i+1));
				System.out.println("Marks = "+(int)ans[i]);
				System.out.println("");
				

				}else if(ans[i+12]!=0.0){
			System.out.println("Module:"+(i+1)+" Can be Condoned!");
			System.out.println("");

				}
			else{
			System.out.println("Module:"+(i+1)+" Failed in 1st Attempt!");
			System.out.println("");

				}
			
		}
		System.out.println("");
		System.out.println("List of Modules Passed in 2nd Attempt(Refferal):");
		System.out.println("");
	
		for(int i=0;i<=5;i++){
		
			if(ansi[i]!=0.0&&ansi[i]>=40){
				System.out.println("Module:"+(i+1));
				System.out.println("Marks= "+(int)ansi[i]);
				System.out.println("");
				attemeptsArray.add(ansi[i]);
				}else if(ans[i]!=0.0||ans[i+12]!=0.0){
			System.out.println("Module:"+(i+1)+" Passed in 1st Attempt!");
			System.out.println("");

				}else{
					System.out.println("Module:"+(i+1)+" Failed in 2nd Attempt!");
					System.out.println("");

				}
		}
		System.out.println("");
		System.out.println("List of Modules Passed in 3rd Attempt(Retake):");
		System.out.println("");
		
		for(int i=0;i<=5;i++){
		
			if(ansi1[i]!=0.0&&ansi1[i]>=40){
				System.out.println("Module:"+(i+1));
				System.out.println("Marks= "+(int)ansi1[i]);
				System.out.println("");
				attemeptsArray.add(ansi1[i]);

				}else if(ansi[i]!=0.0&&ansi[i]>=40){
			System.out.println("Module:"+(i+1)+" Passed in 2nd Attempt!");
			System.out.println("");

				}
				else if(ans[i]!=0.0||ans[i+12]!=0.0){
					System.out.println("Module:"+(i+1)+" Passed in 1st Attempt!");
					System.out.println("");

						
				}else{
					System.out.println("Module:"+(i+1)+" Failed in 3rd Attempt!");
					System.out.println("");

				}
			
		}System.out.println("");
		System.out.println("List of Modules Passed in 4th Attempt(Referral):");
		System.out.println("");
		
		for(int i=0;i<=5;i++){
		
			if(ansi2[i]!=0.0&&ansi2[i]>=40){
				System.out.println("Module:"+(i+1));
				System.out.println("Marks= "+(int)ansi2[i]);
				System.out.println("");
				attemeptsArray.add(ansi2[i]);

				}else if(ansi[i]!=0.0&&ansi[i]>=40){
			System.out.println("Module:"+(i+1)+" Passed in 2nd Attempt!");
			System.out.println("");

				}
				else if(ans[i]!=0.0||ans[i+12]!=0.0){
					System.out.println("Module:"+(i+1)+" Passed in 1st Attempt!");
					System.out.println("");

						
				}else if(ansi1[i]!=0.0&&ansi1[i]>=40){
					System.out.println("Module:"+(i+1)+" Passed in 3rd Attempt!");
					System.out.println("");

				}else{
					System.out.println("Module:"+(i+1)+" Failed in 4th Attempt!");
					System.out.println("");
					
				}
		}
		return attemeptsArray;
	}
	public static ArrayList<Double> awardCal(double[] ans) {//Creating method awardCal
		ArrayList<Double> arr = new ArrayList<Double>();//Declaring Double ArrayList arr
		for(int i=0;i<=5;i++){
			if(ans[i]!=0.0){
				
				arr.add(ans[i]);
				
				
			}
		}
			if (arr.size() == 6 ) {//comparing ArrayList sizes  
				System.out.println("Got 120 Credits!Eligible for DipHE!And can Proceed to LEVEL6");

			} else if ((arr.size() == 5)) {
				System.out.println("Got 100 Credits!can Proceed to LEVEL06,But retake Failed module!");
			} else if ((arr.size() == 6)) {
				System.out.println("Got 120 Credits!can Proceed to LEVEL06");
			} else if ((arr.size() < 5)) {
				System.out.println("Not enough Credits to Proceed to LEVEL06!");
			} else {
				System.out.println("ERROR!Check the entered MARKS!");

			
		}
		
		
	
		return arr;//returning ArrayList arr
	}
	public static ArrayList<Double> awardCal2(double[] ans) {//Starting method awrdCal2
		ArrayList<Double> arr = new ArrayList<Double>();
		for(int i=0;i<=5;i++){
			if(ans[i]!=0.0){
				
				arr.add(ans[i]);
				
				
			}
		}
			if ((arr.size() == 6)) {//comparing ArrayList sizes
				System.out.println("Got 120 Credits for LEVEL06!");

			} else if ((arr.size() == 5)) {
				System.out.println("Got 100 Credits for LEVEL06!");
			} else if ((arr.size() == 4)) {
				System.out.println("Got 80 Credits for LEVEL06!");
			} else if ((arr.size() == 3)) {
				System.out.println("Got 60 Credits for LEVEL06!");
			} else {
				System.out.println("Not enough Credits to PASS LEVEL06!");
			}
		

			
		
		
		
	
		return arr;
	}
	public static void awardCal3(double[] ans, ArrayList<Double> attemeptsArray) {//Starting method awardCal3
		//Declaring ArrayLists
		ArrayList<Double> passed = new ArrayList<Double>();
		ArrayList<Double> condoned = new ArrayList<Double>();
		ArrayList<Double> failed = new ArrayList<Double>();
		int[] marks = new int[6];

		for(int i=0;i<=5;i++){
			if(ans[i]!=0.0){
				
				passed.add(ans[i]);
				
				
			}
		}
		for(int i=6;i<=11;i++){
			if(ans[i]!=0.0){
				
				failed.add(ans[i]);
				
				
			}
		}int x=0;
			for(int i=12;i<=17;i++){
				if(ans[i]!=0.0){
					
					condoned.add(ans[i]);
					marks[x] = (int)ans[i];
					x++;

					
					
				}
			}
		if ((passed.size() == 4||attemeptsArray.size()==4) && (condoned.size() == 2)) {//Comparing AarrayList sizes


			System.out.println("Got 120 Credits including 40 condoned Credits!Can proceed to LEVEL5");
			

		} else if ((passed.size() == 3||attemeptsArray.size()==3) && (condoned.size() == 2)) {

			System.out.println("Got 100 Credits including 40 condoned Credits!Can proceed to LEVEL5");

		} else if ((passed.size() == 6)) {

			System.out.println("Got 120 Credits!Can proceed to LEVEL5.Elegible for CERTHE!");

		} else if ((attemeptsArray.size()==6)) {

			System.out.println("Got 120 Credits!Can proceed to LEVEL5.");

		}
		else if ((failed.size() > 1)) {

			System.out.println("CAN NOT proceed to LEVEL05!CREDIT LEVEL less than 100! ");
		} else if ((passed.size() == 5||attemeptsArray.size()==6) && condoned.size() == 1) {

			System.out.println("GOT 120 CREDITS!WITH 20 CONDONE CREDITS.CAN PROCEED TO LEVEL5! ");

		} else if (condoned.size() == 3 && (passed.size() == 3||attemeptsArray.size()==3)) {

			System.out.println("GOT 100 CREDITS!WITH 40 CONDONE CREDITS.CAN PROCEED TO LEVEL5! ");

		} else if (condoned.size() >= 4) {

			System.out.println("CAN NOT PROCEED TO LEVEL5! ");
		} else if (passed.size() == 4 && condoned.size() == 1 && failed.size() == 1) {

			System.out.println("GOT 100 CREDITS!WITH 20 CONDONE CREDITS.CAN PROCEED TO LEVEL5! ");

		} else if ((passed.size() == 5||attemeptsArray.size()==5) && failed.size() == 1) {

			System.out.println("GOT 100 CREDITS!CAN PROCEED TO LEVEL 05! ");

		} else if (passed.size() == 2 && condoned.size() == 3 && failed.size() == 1) {

			System.out.println("CAN NOT proceed to LEVEL05!CREDIT LEVEL less than 100!  ");

		}
		for (int i = marks.length - 1; i >= 0; i--) {// sorting marks array in
													// ascending order//To display condoned marks
			for (int j = 0; j < i; j++) {
				if (marks[j] > marks[j + 1]) {
					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;
				}

			}
		}
		System.out.println("Marks of Condoned Modules:");

		System.out.println(marks[5]);//Displaying condoned marks
		System.out.println(marks[4]);
		System.out.println("");


		
		
	}
	public static void awardCal4(double[] ansi2) {//Starting method awardCal4
		for(int i=0;i<=5;i++){
			if(ansi2[i]<40&&ansi2[i]!=0.0){
				System.out.println("Student Exceeded Maximum No.of Possible ATTEMPTS!");
				System.out.println("");

				System.out.println("Student Excluded from the Program!");
				System.out.println("");

				System.out.println("Do You Want Continue With the Next Student?");
				System.out.println("YES,Enter 1");
				System.out.println("NO,Enter 2");
				System.out.print("Selection: ");
				System.out.println("");
				Scanner q = new Scanner(System.in);
				switch (q.nextInt()) 
				{
				    case 1:
				    System.out.println ( "Enter Details of New Student." );
					new Level4();
					System.out.println("");


				    break;
			  
				    case 2:
				    System.out.println ( "Program Closed." );
				    System.exit(0);

				    break;
				    default:
					    System.err.println ( "Unrecognized option" );
					    break;
				}

				
			}
		else{
			continue;
		}
			
		}
		
	}

	static ArrayList<Integer> readFile(String fileName) throws FileNotFoundException {
	    Scanner sc = new Scanner(new File(fileName));
	    ArrayList<Integer> tall = new ArrayList<Integer>();
	    while (sc.hasNextInt()) {
	        tall.add(sc.nextInt());
	    }

	    return tall;
	}
	

}
