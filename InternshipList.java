import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class InternshipList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> internships = new ArrayList<>();
        System.out.println("Welcome to your Internship List!");
        System.out.print("Enter file name (example: tech.txt): ");
        String fileName = input.nextLine();
        try {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner fileReader = new Scanner(file);
                while (fileReader.hasNextLine()) {
                    internships.add(fileReader.nextLine());
                }
                fileReader.close();
                System.out.println("Loaded " + internships.size() + " items from "
+ fileName);
            } else {
                System.out.println("File not found. A new list will be created.");
            }
        } catch (Exception e) {
            System.out.println("Error loading file.");
}
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Company");
            System.out.println("2. Delete Company");
            System.out.println("3. Show All Companies");
            System.out.println("4. Edit Company (Which is Extra Credit)");
            System.out.println("5. Save and Quit");
            System.out.print("Choose option: ");
            choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                addCompany(internships, input);
            } else if (choice == 2) {
                deleteCompany(internships, input);
            } else if (choice == 3) {
                showCompanies(internships);
            } else if (choice == 4) {
                editCompany(internships, input);
            } else if (choice == 5) {
                try {
                    PrintWriter writer = new PrintWriter(fileName);
                    for (String company : internships) {
                        writer.println(company);
                    }
                    writer.close();
System.out.println("List saved. Goodbye!");
                } catch (Exception e) {
                    System.out.println("Error saving file.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
      }
}
    public static void addCompany(ArrayList<String> list, Scanner input) {
        System.out.print("Enter company name: ");
        String company = input.nextLine();
        list.add(company);
        System.out.println("Added: " + company);
    }
    public static void deleteCompany(ArrayList<String> list, Scanner input) {
        showCompanies(list);
        System.out.print("Enter index to delete: ");
        int index = Integer.parseInt(input.nextLine());
        if (index >= 0 && index < list.size()) {
            System.out.println("Removed: " + list.remove(index));
        } else {
            System.out.println("Invalid index.");
        }
}
    public static void showCompanies(ArrayList<String> list) {
        if (list.size() == 0) {
            System.out.println("List is empty.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ": " + list.get(i));
                }
        }
}
    public static void editCompany(ArrayList<String> list, Scanner input) {
        showCompanies(list);
        System.out.print("Enter index to edit: ");
        int index = Integer.parseInt(input.nextLine());
        if (index >= 0 && index < list.size()) {
            System.out.print("Enter new name: ");
            String newName = input.nextLine();
            list.set(index, newName);
            System.out.println("Updated.");
        } else {
            System.out.println("Invalid index.");
               }       
        }
}