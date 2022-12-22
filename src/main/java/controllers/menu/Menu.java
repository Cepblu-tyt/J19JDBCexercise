package controllers.menu;

import controllers.Students;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Students");

        System.out.println();
        System.out.print("Select an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                studentsMenu();
                break;

            default:
                System.out.println("Invalid option.");
                mainMenu();
                break;
        }
    }

    private static void studentsMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Get All Students");
        System.out.println("2. Create New Student");
        System.out.println("3. Delete Student");

        System.out.println();
        System.out.print("Select an option or enter 0 to go back to the main menu: ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                mainMenu();
                break;
            case 1:
                Students.getAllStudents();
                studentsMenu();
                break;
            case 2:
                Students.createNewStudent();
                studentsMenu();
                break;
            case 3:
                Students.deleteStudent();
                studentsMenu();
                break;

            default:
                System.out.println("Invalid option.");
                studentsMenu();
                break;
        }

    }
    }
