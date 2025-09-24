package main;

import pojos.EmploymentContract;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var employmentContract = new EmploymentContract();
        System.out.printf("Gross hourly rate: ");
        employmentContract.grossHourlyRate = keyboard.nextDouble();
        System.out.printf("Hours/week: ");
        employmentContract.hoursPerWeek = keyboard.nextDouble();
        System.out.printf("Annual net salary: %.2f\n", employmentContract.annualNetSalary());
    }

}
