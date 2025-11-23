/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jansb
 */
import java.util.Scanner;
public class IssueMenu {
  
    public static String chooseIssue(Scanner in) {
        System.out.println("\nSelect the issue:");
        System.out.println("1. Projector - No signal");
        System.out.println("2. Projector - Lamp problem");
        System.out.println("3. PC - Not turning on");
        System.out.println("4. PC - Very slow");
        System.out.println("5. Network - No internet");
        System.out.print("Enter issue number: ");

        int issueChoice = in.nextInt();
        in.nextLine(); 

        return switch (issueChoice) {
            case 1 -> "Projector - No signal";
            case 2 -> "Projector - Lamp problem";
            case 3 -> "PC - Not turning on";
            case 4 -> "PC - Very slow";
            case 5 -> "Network - No internet";
            default -> null;
        };
    }
    
}