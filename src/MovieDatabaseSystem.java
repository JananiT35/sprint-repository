import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MovieDatabaseSystem {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Set<Actor> act = new HashSet<>();
	 Actor actor1 = new Actor("janani", 2002);
     Actor actor2 = new Actor("cat", 2001);
     Actor actor3 = new Actor("janani", 2003);
     Actor actor4 = new Actor("lion", 2002);
     act.add(actor1);
     act.add(actor2);
     act.add(actor3);
     act.add(actor4);
     MovieDatabase md = new MovieDatabase(new HashSet<>());
     Movie avengers = new Movie("dog", "\nxxx",2012,act);
     Movie xxx=new Movie("The x","\ndirect",2020,act);
     Movie yyy=new Movie("The Y","\naaa",2013,act);
     md.addMovie("dog", "xxx", 2012, act);
     md.addMovie("The x","direct",2020,act);
     md.addMovie("The Y","aaa",2013,act);
     while(true) {
         System.out.println("1. Display all movies");
         System.out.println("2. Add an actor to a movie");
         System.out.println("3. Remove an actor from a movie");
         System.out.println("4. Display unique actors in the database");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int choice = s.nextInt();
         s.nextLine(); 
         switch (choice) {
         case 1:
             System.out.println("All movies in the database:");
             md.displayAll();
             break;
         case 2:
             System.out.print("Enter movie title: ");
             String title = s.nextLine();
             System.out.print("Enter actor name: ");
             String name = s.nextLine();
             System.out.print("Enter actor year: ");
             int year = s.nextInt();
             md.addActor(title, new Actor(name, year));
             System.out.println("Actor added");
             break;
         case 3:
        	 System.out.print("Enter movie title: ");
             title = s.nextLine();
             System.out.print("Enter actor name to remove: ");
             name = s.nextLine();
             md.removeActor1(title, name);
             System.out.println("Actor removed");
             break;
         case 4:
             System.out.println("Unique actors in the database:");
             md.UniqueActorsinDatabase();
             break;
         case 5:
             System.out.println("Exit");
             return;
         default:
             System.out.println("Invalid choice");
     }
     }
     /*System.out.println("All movies in the database:");
     md.displayAll();
     md.addActor("The Avengers", actor4);
     System.out.println("\nAll movies in the database after adding an actor:");
     md.displayAll();
     md.removeActor1("The Avengers", "Chris Evans");
     System.out.println("\nAll movies in the database after removing an actor:");
     md.displayAll();
     System.out.println("\nUnique actors in the database:");
     md.UniqueActorsinDatabase();*/
 }	
}
class Actor{
	private String Name;
	private int birthYear;
	Actor(String Name,int birthYear){
		this.Name=Name;
		this.birthYear=birthYear;
	}
	public String getName() {
		return Name;
	}
	public int getbirthYear() {
		return birthYear;
	}
	public String toString() {
		return  Name + "\nBirthYear: " + birthYear;
	}
}
class Movie{
	private String Title;
	private String Director;
	private int Ryear;
	private Set<Actor> s;
	Movie(String Title,String Director,int Ryear,Set<Actor> s){
		this.Title=Title;
		this.Director=Director;
		this.Ryear=Ryear;
		this.s=s;
	}
	public String getTitle() {
		return Title;
	}
	public String getDirector() {
		return Director;
	}
	public int getRYear(){
		return Ryear;
	}
	public Set<Actor> getS(){
		return s;
	}
	public void addActor(Actor act) {
		s.add(act);
	}
	public void removeActor(String Name) {
		s.remove(Name);
	}
	public void display() {
		System.out.println("Title: "+Title+"\nDirector Name: "+Director+"\nRelease Year:"+Ryear);
		System.out.println("cast:");
		for(Actor a1:s) {
			System.out.println("Actor name:"+a1);
		}
	}
	/*public void uniqueActor() {
		List<String> n=new ArrayList<>();
		for(Actor a1:s) {
			int count=0;
			for(Actor a2:s) {
				/*if(count==1) {
					n.add(a1.getName());
					break;
				}*/
				/*if(a1.getName().equals(a2.getName())) {
					count++;
				}
				public Object getName() {
					// TODO Auto-generated method stub
					return null;
				}
			}
			if(count>1 && !n.contains(a1.getName())) {
				n.add(a1.getName());
			}
		    if(count==1) {
		    	n.add(a1.getName());
		    }
			}
		//System.out.println("Unique actor:"+n);
	
	System.out.println("Unique actor:"+n);
	}*/
} 
class MovieDatabase{
	private Set<Movie> m=new HashSet<>();
	MovieDatabase(Set<Movie> m){
		this.m=m;
	}
	public void addMovie(String Title,String Director,int Ryear,Set<Actor> s ) {
		m.add(new Movie(Title,Director,Ryear,s));
	}
	public void addActor(String Title,Actor a ) {
		for(Movie m1:m) {
			if(m1.getTitle().equalsIgnoreCase(Title)) {
				m1.addActor(a);
			}
		}
}
	public void removeActor1(String Title,String Name) {
		for(Movie m1:m) {
			if(m1.getTitle().equalsIgnoreCase(Title)) {
				m1.removeActor(Name);
			}
		}
	}
	public void displayAll() {
		for(Movie m1:m) {
			m1.display();
		}
	}
	public void UniqueActorsinDatabase() {
		List<String> n=new ArrayList<>();
		for(Movie m1:m) {
			for(Actor a1:m1.getS()) {	
			int count=0;
			for(Actor a:m1.getS()) {
				if(a1.getName().equals(a.getName())) {
					count++;
				}
			}
			if(count>1 && !n.contains(a1.getName())) {
				n.add(a1.getName());
			}
		    if(count==1) {
		    	n.add(a1.getName());
		    }
		}
	System.out.println("Unique actor:"+n);
	break;
	}	
}}
		