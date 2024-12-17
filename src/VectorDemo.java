package task;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement("janani");
		v1.add(55);
		v1.addElement("example");;
		v1.add("xxx");
		v1.add("yyy");
		System.out.println("Vector:"+v1);
		System.out.println("Capacity: "+v1.capacity());
		System.out.println("Remove:"+v1.removeElement("yyy"));
		System.out.println("Contains:"+v1.contains("janani"));
		System.out.println("object at specified index:"+v1.get(2));
		System.out.println("Last index:"+v1.lastIndexOf("xxx"));//-1
		System.out.println("Vector:"+v1);//
	}

}
