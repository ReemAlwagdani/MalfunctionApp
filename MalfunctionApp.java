
package malfunctionsystem1;

import java.util.Scanner;
public class MalfunctionApp {
    
public static void main(String[] args) {
    
System.out.println("\t\tWelcome to Malfunction Report System!\n"
+ "\t_______________________________________________\n");
Scanner input = new Scanner(System.in);
ReportSystem system = new ReportSystem();
int role = 0;
while (true) {
System.out.println("\nSelect your role:");System.out.println("1. Reporter (student / instructor)");
System.out.println("2. IT staff / technician");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
role = input.nextInt();
input.nextLine();
if (role == 1) {
runUserMenu(input, system);
} 
else if (role == 2) {
runITMenu(input, system);
} 
else if (role == 3) {
break;
}
else {
System.out.println("Invalid role. Please try again.");
}

}

System.out.println("\nThank you for using Malfunction Report System.");
input.close();
}
private static void runUserMenu(Scanner input, ReportSystem system) {
int choice = 0;
String anotherService = "";
while (!anotherService.equalsIgnoreCase("no") && choice != 3) {
printUserMenu();
choice = input.nextInt();
input.nextLine();
if (choice == 1) {
system.addNewReport(input); } else if (choice == 2) {
system.viewReportStatusById(input); } else if (choice == 3) {
break;
} else {
// Add a new report
// View report status by ID
System.out.println("Please enter a correct number.");
}if (choice != 3) {
System.out.println("_______________________________________________"
+ "\n\nWould you like to use another user service? (yes/no)");
anotherService = input.next();
}
}
System.out.println("\nThank you for using Malfunction Report System!");
System.out.println("_______________________________________________");
System.out.println("");
System.out.println("");
System.out.println("\t\tWelcome to Malfunction Report System!\n"
+ "\t_______________________________________________\n");
}
private static void runITMenu(Scanner input, ReportSystem system) {
int choice = 0;
String anotherService = "";
while (!anotherService.equalsIgnoreCase("no") && choice != 4) {
printITMenu();
choice = input.nextInt();
input.nextLine();
if (choice == 1) {
system.viewAllReports();
} else if (choice == 2) {
system.updateReportStatus(input);
} else if (choice == 3) {
system.showStats();
} else if (choice == 4) {
break;
} else {
System.out.println("Please enter a correct number.");
}
if (choice != 4) {
System.out.println("_______________________________________________"
+ "\n\nWould you like to do another IT action? (yes/no)");
anotherService = input.next();
}
}
System.out.println("\nThank you for using Malfunction Report System!");System.out.println("_______________________________________________");
System.out.println("");
System.out.println("");
System.out.println("\t\tWelcome to Malfunction Report System!\n"
+ "\t_______________________________________________\n");
}
private static void printUserMenu() {
System.out.print("\n=== User Menu ===\n"
+ "press 1: to add a new malfunction report\n"
+ "press 2: to view the status of a report\n"
+ "press 3: to exit user menu\n" + "_______________________________________________\n"
+ "your choice is: ");
}
private static void printITMenu() {
System.out.print("\n=== IT Staff Menu ===\n"
+ "press 1: to view all reports\n"
+ "press 2: to update report status\n"
+ "press 3: to show reports statistics\n"
+ "press 4: to exit IT menu\n"+ "_______________________________________________\n"
+ "your choice is: ");
}
}