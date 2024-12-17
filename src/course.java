package assignedexample;

public enum course {
	DBT(10),REACT(20),ANGULAR(10),REST(20),SPRING(10),HIBERNATE(20);
	private int course1;
	private int enroll;
	
	 course(int course1)
	{
		this.course1=course1;
		this.enroll=0;
	}
	 

public int getcourse1()
{
	
	return course1;
}
public boolean enrollStudent() {
    if (enroll>= course1) {
        return false;
    }
    enroll++;
    return true;
}
}


