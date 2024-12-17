package assigned;

import java.util.HashSet;
import java.util.Set;

	public class SetDemo {

	    public static void main(String[] args) {

	        /*Set<String> st = new HashSet<>();
	        st.add("a");
	        st.add("e");
	        System.out.println(st.add("a")); // false, "a" is already present
	        st.add("i");
	        System.out.println(st); // [a, e, i]*/

	        Set<YP> sety = new HashSet<>();
	        YP y1 = new YP("xxxx", 11);
	        YP y2 = new YP("yyyy", 12);
	        YP y3 = new YP("Janani", 13);
	        sety.add(y1);
	        sety.add(y2);
	        sety.add(y3);
	        System.out.println(sety); 
	        System.out.println();
	    }
	}

	class YP {
	    private String name;
	    private int empid;

	    YP(String name, int empid) {
	        this.name = name;
	        this.empid = empid;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        YP yp = (YP) obj;
	        return empid == yp.empid && name.equals(yp.name);
	    }

	    @Override
	    public int hashCode() {
	        int result = name.hashCode();
	        result = 31 * result + empid;
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Name:" + name + " Empid:" + empid;
	    }
	}



