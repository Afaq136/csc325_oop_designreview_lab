/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Afaq Waris
 */
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating Freshman student
		System.out.println("Enter GPA for James:");
		double gpaJames = scanner.nextDouble();
		Freshman std1 = new Freshman("James", (short) 20, gpaJames);
		std1.setAddress("123 Freshman Lane");

		// Creating Senior student
		System.out.println("Enter GPA for John:");
		double gpaJohn = scanner.nextDouble();
		Senior std2 = new Senior("John", (short) 30, gpaJohn, 90);
		std2.setAddress("456 Senior Blvd");

		// Printing student details
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}
