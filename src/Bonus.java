import java.util.Scanner;
public class Bonus {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the employee's designation (e.g., Manager, Developer, Analyst): ");
	        String designation = scanner.nextLine();

	        System.out.print("Enter the number of years of experience: ");
	        int yearsOfExperience = scanner.nextInt();

	        double bonus = calculateBonus(designation, yearsOfExperience);

	        System.out.println("The bonus salary for the employee is: " + bonus);
	    }

	    public static double calculateBonus(String designation, int yearsOfExperience) {
	        double bonus = 0;

	        switch (designation.toLowerCase()) {
	            case "manager":
	                if (yearsOfExperience >= 10) {
	                    bonus = 20000;
	                } else if (yearsOfExperience >= 5) {
	                    bonus = 15000;
	                } else {
	                    bonus = 10000;
	                }
	                break;
	            case "developer":
	                if (yearsOfExperience >= 10) {
	                    bonus = 15000;
	                } else if (yearsOfExperience >= 5) {
	                    bonus = 10000;
	                } else {
	                    bonus = 5000;
	                }
	                break;
	            case "analyst":
	                if (yearsOfExperience >= 10) {
	                    bonus = 12000;
	                } else if (yearsOfExperience >= 5) {
	                    bonus = 8000;
	                } else {
	                    bonus = 4000;
	                }
	                break;
	            default:
	                System.out.println("Invalid designation entered.");
	                break;
	        }

	        return bonus;
	    }
	}



