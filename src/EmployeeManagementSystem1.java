

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class EmployeeManagementSystem1 {
	    private EmployeeManagement empManage;

	    public EmployeeManagementSystem1() {
	        this.empManage = new EmployeeManagement();
	    }

	    public void addNewEmployee(int id, String name, int age, double salary) {
	        Employee employee = new Employee(id, name, age, salary);
	        empManage.addEmployee(employee);
	    }

	    public void removeEmployee(int id) {
	        empManage.removeEmployee(id);
	    }

	    public void sortEmployeesById() {
	        empManage.sortEmployeesbyID();
	    }

	    public void sortEmployeesByName() {
	        empManage.sortEmployeesbyName();
	    }

	    public void sortEmployeesByAge() {
	        empManage.sortEmployeesbyAge();
	    }

	    public void sortEmployeesBySalary() {
	        empManage.sortEmployeesbySalary();
	    }

	    public void displayEmployees() {
	        empManage.displayEmployees();
	    }

	    public static void main(String[] args) {
	        EmployeeManagementSystem1 emp = new EmployeeManagementSystem1();
	        emp.addNewEmployee(123, "xxx", 23, 30000.00);
	        emp.addNewEmployee(452, "abc", 25, 45000.00);
	        emp.addNewEmployee(678, "yyy", 22, 40000.00);
	        emp.addNewEmployee(35, "xyz", 26, 60000.00);

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\nEmployee Management System");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Remove Employee");
	            System.out.println("3. Sort Employees by ID");
	            System.out.println("4. Sort Employees by Name");
	            System.out.println("5. Sort Employees by Age");
	            System.out.println("6. Sort Employees by Salary");
	            System.out.println("7. Display Employees");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    System.out.print("Enter Salary: ");
	                    double salary = scanner.nextDouble();
	                    emp.addNewEmployee(id, name, age, salary);
	                    break;
	                case 2:
	                    System.out.print("Enter ID to remove: ");
	                    int removeId = scanner.nextInt();
	                    emp.removeEmployee(removeId);
	                    break;
	                case 3:
	                    emp.sortEmployeesById();
	                    break;
	                case 4:
	                    emp.sortEmployeesByName();
	                    break;
	                case 5:
	                    emp.sortEmployeesByAge();
	                    break;
	                case 6:
	                    emp.sortEmployeesBySalary();
	                    break;
	                case 7:
	                    emp.displayEmployees();
	                    break;
	                case 8:
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
	class Employee {
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    Employee(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
	    }
	}
	class EmployeeComparator {
	    public static Comparator<Employee> idcomp = new Comparator<Employee>() {
	        public int compare(Employee o1, Employee o2) {
	            return o1.getId() - o2.getId();
	        }
	    };

	    public static Comparator<Employee> agecomp = new Comparator<Employee>() {
	        public int compare(Employee o1, Employee o2) {
	            return o1.getAge() - o2.getAge();
	        }
	    };

	    public static Comparator<Employee> salarycomp = new Comparator<Employee>() {
	        public int compare(Employee o1, Employee o2) {
	            return Double.compare(o1.getSalary(), o2.getSalary());
	        }
	    };

	    public static Comparator<Employee> namecomp = new Comparator<Employee>() {
	        public int compare(Employee o1, Employee o2) {
	            return o1.getName().compareTo(o2.getName());
	        }
	    };
	}
	class EmployeeManagement {
	    private List<Employee> employees;

	    public EmployeeManagement() {
	        this.employees = new ArrayList<>();
	    }

	    public void addEmployee(Employee e) {
	        employees.add(e);
	    }

	    public void removeEmployee(int id) {
	        employees.removeIf(e -> e.getId() == id);
	    }

	    public void sortEmployeesbyID() {
	        Collections.sort(employees, EmployeeComparator.idcomp);
	        displayEmployees();
	    }

	    public void sortEmployeesbyName() {
	        Collections.sort(employees, EmployeeComparator.namecomp);
	        displayEmployees();
	    }

	    public void sortEmployeesbyAge() {
	        Collections.sort(employees, EmployeeComparator.agecomp);
	        displayEmployees();
	    }

	    public void sortEmployeesbySalary() {
	        Collections.sort(employees, EmployeeComparator.salarycomp);
	        displayEmployees();
	    }

	    public void displayEmployees() {
	        for (Employee e : employees) {
	            System.out.println(e);
	        }
	    }
	}

