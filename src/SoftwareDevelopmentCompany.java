import java.util.*;
			 public class SoftwareDevelopmentCompany {
			     public static void main(String[] args) {
			         List<Employees> e = new ArrayList<>();
			         Developer d = new Developer("Janani", 22, 35, "A4", "Java", 2);
			         Developer d1 = new Developer("xxx", 23, 789, "Fresher", "C", 3);
			         Tester t = new Tester("abc", 23, 656, "ht", "pi", 3);
			         Tester t1 = new Tester("ttt", 24, 456, "yyy", "la", 4);
			         e.add(d);
			         e.add(t1);
			         e.add(d1);
			         e.add(t);

			         int dCount = 0;
			         int tCount = 0;
			         for (Employees emp : e) {
			             if (emp instanceof Developer) {
			                 dCount++;
			             } else if (emp instanceof Tester) {
			                 tCount++;
			             }
			         }

			         System.out.println("Total Developers: " + dCount);
			         System.out.println("Total Testers: " + tCount);

			         // Display details of all employees
			         for (Employees emp : e) {
			             emp.display();
			         }
			         for (Employees emp : e) {
			             emp.search(35);
			         }
			     }
			 }

			 abstract class Employees {
			     private String name;
			     private int age;
			     private int id;
			     private String department;

			     Employees(String name, int age, int id, String department) {
			         this.name = name;
			         this.age = age;
			         this.id = id;
			         this.department = department;
			     }

			     public abstract void search(int id);

			     public String getName() {
			         return name;
			     }

			     public int getAge() {
			         return age;
			     }

			     public int getId() {
			         return id;
			     }

			     public String getDepartment() {
			         return department;
			     }

			     public void display() {
			         System.out.println("Name: " + name + " Age: " + age + " ID: " + id + " Department: " + department);
			     }

			     public String getDetails() {
			         return "Name: " + getName() + " Age: " + getAge() + " ID: " + getId() + " Department: " + getDepartment();
			     }
			 }

			 class Developer extends Employees {
			     private String programmingLangKnown;
			     private int projectHandled;

			     Developer(String name, int age, int id, String department, String programmingLangKnown, int projectHandled) {
			         super(name, age, id, department);
			         this.programmingLangKnown = programmingLangKnown;
			         this.projectHandled = projectHandled;
			     }

			     @Override
			     public void search(int id) {
			         if (this.getId() == id) {
			             System.out.println(getDetails() + "\nProgramming languages known: " + programmingLangKnown + "\nProjects Handled: " + projectHandled);
			         }
			     }
			 }

			 class Tester extends Employees {
			     private String testingTools;
			     private int bugsReported;

			     Tester(String name, int age, int id, String department, String testingTools, int bugsReported) {
			         super(name, age, id, department);
			         this.testingTools = testingTools;
			         this.bugsReported = bugsReported;
			     }

			     @Override
			     public void search(int id) {
			         if (this.getId() == id) {
			             System.out.println(getDetails() + "\nTesting tools known: " + testingTools + "\nBugs Reported: " + bugsReported);
			         }
			     } 
	}

