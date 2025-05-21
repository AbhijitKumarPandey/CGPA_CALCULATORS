package DSA;

import java.util.Scanner;


public class CGPA_CALCULATOR {
	 
	 
	 
		 
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of subjects: ");
		        int n = sc.nextInt();

		        double[] marks = new double[n];
		        double total = 0;

		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
		            marks[i] = sc.nextDouble();
		            total += marks[i];
		        }

		        double averagePercentage = total / n;
		        double cgpa = averagePercentage / 9.5;

		        System.out.println("\nTotal Marks = " + total);
		        System.out.println("Average Percentage = " + averagePercentage + "%");
		        System.out.println("CGPA = " + String.format("%.2f", cgpa));

		     
		
	}


}
