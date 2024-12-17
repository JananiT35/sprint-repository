package assignedexample;

public class FunctionalInterface {
	
//implements ThreeNumbers {
	public static void main(String[] args) {
		// ThreeNumbers t=new FunctionalInterface();
				
		ThreeNumbers t = (a, b, c) -> {
		    return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		    };
		
		System.out.println("Biggest :"+t.Compare(5,50,55));		
	}
/*
@Override
public int Compare(int a, int b, int c) {
	// TODO Auto-generated method stub
	if(a>b && a>c) {
		return a;
	}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
}*/
}
