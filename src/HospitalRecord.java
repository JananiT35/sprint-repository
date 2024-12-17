import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HospitalRecord implements PatientRecord {
private List<Patient> pat=new LinkedList<>();
public static void main(String[] args) {
	HospitalRecord hr=new HospitalRecord();
	Scanner s=new Scanner(System.in);
	
	hr.addPatient("XXX", "Dr.Abc", "Cold");
	hr.addPatient("yyy", "Dr.bcd", "Fever");
	hr.addPatient("aaa", "Dr.def", "ttt");
	hr.addPatient("bbb", "Dr.ghi", "flu");
	hr.displayPatients();
	System.out.print("Enter doctor name: ");
    String sDoctorName = s.nextLine();
    hr.searchPatientByDoctor(sDoctorName);
    hr.patwithmostDiagnosis();
}
public void addPatient(String PatientName, String DoctorName,String diagnosis) {
		// TODO Auto-generated method stub
		pat.add(new Patient(PatientName, DoctorName,diagnosis));
	}
	public void displayPatients() {
		// TODO Auto-generated method stub
		for(Patient p:pat) {
			System.out.println(p);
		}
	}

	@Override
	public void searchPatientByDoctor(String sDoctorName) {
		// TODO Auto-generated method stub
		boolean f=false;
		for(Patient p:pat) {
			if(p.getDoctorName().equalsIgnoreCase(sDoctorName)) {
				 System.out.println("Patient Name: " + p.getPatientName() + ", Diagnosis: " +p.getDiagnosis());
				 f=true;
			}
		}
		if (!f) {
            System.out.println("No patients found for Doctor ");
        }
	}
	public void patwithmostDiagnosis() {
		String mostDiag="";
		int max=0;
		for(Patient p:pat) {
			int count=0;
			for(Patient p1:pat) {
				if(p.equals(p1)) {
					count++;
				}
				if(count>max) {
					max=count;
					mostDiag=p.getPatientName();
				}
			}
		}
			if (!mostDiag.isEmpty()) {
		        System.out.println("The patient with the most diagnoses is " + mostDiag + " with " + max + " diagnoses");
		    } else {
		        System.out.println("No patients found.");
		    }
		
		
	}
}	
class Patient{
	private String PatientName;
	private String DoctorName;
	private String diagnosis;
	Patient(String PatientName,String DoctorName,String diagnosis){
		this.PatientName=PatientName;
		this.DoctorName=DoctorName;
		this.diagnosis=diagnosis;
	}
	public String getPatientName() {
		return PatientName;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public String toString() {
		return "Patient [Name=" + PatientName + ", Doctor=" + DoctorName + ", Diagnosis=" + diagnosis + "]";
	}
}

