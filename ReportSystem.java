/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaree
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ReportSystem {
      
    private ArrayList<Report> reports = new ArrayList<Report>();

    private int nextId = 1;

   
    public void addNewReport(Scanner in) {

        String issue = IssueMenu.chooseIssue(in);
        if (issue == null) {
            System.out.println("Invalid issue choice. Report was not created.");
            return;
        }

        System.out.print("Enter Class number: ");
        String location = in.nextLine();

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        if (location.isEmpty() || name.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        Report r = new Report(nextId++, issue, location ,name);
        reports.add(r);

        System.out.println("Report added successfully with ID: " + r.getId());
    }

   
    public void viewAllReports() {
        if (reports.isEmpty()) {
            System.out.println("No reports yet.");
            return;
        }

        System.out.println("\n--- All Reports ---");
        for (Report r : reports) {
            System.out.println(r.toString());
        }
    }
}
