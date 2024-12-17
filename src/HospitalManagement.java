import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagement {

    
	public static void main(String[] args) {
		HospitalManagement hospital = new HospitalManagement();
		List<Staff> staffList = new ArrayList<>();
		

        staffList.add(new Doctor("123","Dr.Janani",25,"Emergency","Cardio",500));
        staffList.add(new Doctor("456","Dr.xxx",30,"Neuro","Neurologist",600));
        staffList.add(new Nurse("676","yyy",28,"Pediatrics","day",250));
        staffList.add(new Nurse("456","abc",23,"ortho","Night",300));
        System.out.println(staffList.size());
        int Doccount = 0;
        for (Staff staff : staffList) {
            if (staff.isDoctor()) {
                Doccount++;
            }
        }
        System.out.println(Doccount);
       int Nurse=0;
       for (Staff staff : staffList) {
           if (staff.isNurse()) {
               Nurse++;
           }
       }
       System.out.println(Nurse);
	System.out.println("Enter the id");
	Scanner s=new Scanner(System.in);
	String StaffId=s.next();
	searchbyid(staffList,StaffId);
	}
       public static void searchbyid(List<Staff> staffMembers, String staffId) {
           boolean found = false;
           for (Staff staff : staffMembers) {
               if (staff.getId().equals(staffId)) {
                   staff.search(staffId);
                   found = true;
                   break;
               }
           }
           if (!found) {
               System.out.println("Staff with ID " + staffId + " not found.");
           }
	}

}
abstract class Staff{
	public String id;
	protected String name;
	private int age;
	private String dept;
	Staff(String id,String name,int age,String dept){
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
    protected abstract boolean isNurse();
	protected abstract boolean isDoctor();
	public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDepartment() {
	        return dept;
	    }
	 public abstract void displayDetails();

	    public abstract void search(String StaffId);
}
class Doctor extends Staff{
	private String spec;
	private int fee;
	Doctor(String id,String name,int age,String dept,String spec,int fee){
		super(id,name,age,dept);
		this.spec=spec;
		this.fee=fee;
	}
	public String getSpecialization() {
        return spec;
    }
    public double getConsultationFee() {
        return fee;
    }
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Doctor [ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() + ", Department: " + getDepartment() + ", Specialization: " + spec + 
                ", Consultation Fee: " + fee + "]");
	}
	@Override
	public void search(String StaffId) {
		// TODO Auto-generated method stub
		  if (this.getId().equals(StaffId)) {
	            displayDetails();
	            System.out.println("Name: " + name);
	            System.out.println("Specialization: " + spec);
	            System.out.println("Consultation Fee: " + fee);
	        }
	    }
		
	
	@Override
	protected boolean isDoctor() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	protected boolean isNurse() {
		// TODO Auto-generated method stub
		return false;
	}
}
	class Nurse extends Staff{
		private String shift;
		private int wage;
		Nurse(String id,String name,int age,String dept,String shift,int wage){
			super(id,name,age,dept);
			this.shift=shift;
			this.wage=wage;
			
		}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Nurse [ID: " + getId() + ", Name: " + getName() + ", Age: " + getAge() + ", Department: " + getDepartment() + ", Shift Timings: " + shift + 
                ", Hourly Wage: " + wage + "]");
		
	}
	@Override
	public void search(String StaffId) {
		// TODO Auto-generated method stub
		if (this.getId().equals(StaffId)) {
            displayDetails();
            System.out.println("Shift Timings: " + shift);
            System.out.println("Hourly Wage: " + wage);
        }
	
	}

	@Override
	protected boolean isDoctor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isNurse() {
		// TODO Auto-generated method stub
		return true;
	}
}