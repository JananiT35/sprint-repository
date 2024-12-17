import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ZooManagement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Zoo z=new Zoo();
	z.addAnimal(new Animal(1,"Reptiles","Lizard",3));
	z.addAnimal(new Animal(2,"Mammals","dog",2));
	z.addAnimal(new Animal(3,"birds","dove",1));
	z.addAnimal(new Animal(4,"animals","pig",4));
	while(true) {
		System.out.println("1.Add animal");
		System.out.println("2.remove animal");
		System.out.println("3.Get animals by species");
		System.out.println("4.get animals by age");
		System.out.println("5.Display all animals");
		System.out.println("6.exit");
		System.out.println("enter choice:");
		int choice = s.nextInt();
        s.nextLine(); 
        switch (choice) {
        case 1:
        	  System.out.print("\nEnter id: ");
              int id = s.nextInt();
              System.out.print("\nEnter animal species: ");
              String species = s.nextLine();
              System.out.print("\nEnter animal name: ");
              String name = s.nextLine();
              System.out.print("\nEnter age: ");
              int age = s.nextInt();
              z.addAnimal(new Animal(id,species,name,age));
              System.out.println("\nAnimal added");
              break;
        case 2:
        	 System.out.print("Enter id to remove: ");
        	 int removeId=s.nextInt();
        	 z.removeAnimal(removeId);
        	 System.out.println("Animal removed");
             break;
        case 3:
        	System.out.println("Enter species to be searched");
        	String search=s.nextLine();
        	List<IAnimal>ani=z.getAnimalsBySpecies(search);
        	for(IAnimal animal:ani) {
        		System.out.println(animal);
        	}
        case 4:
        	 Map<Integer, List<IAnimal>> animalsByAge =z.getAnimalsByAge();
        	 for (Map.Entry<Integer, List<IAnimal>> entry : animalsByAge.entrySet()) {
        		 System.out.println(entry.getKey());
        		 for (IAnimal animal : entry.getValue()) {
                     System.out.println(animal);
                 }  
        	 }
        	// System.out.println(animalsByAge);
        	break;
        case 5:
        	System.out.println("All animals in the zoo:");
                 z.display();
            break;
        case 6:
        	System.out.println("exit");
        	default:
        		System.out.println("invalid");
        }
	}	
}
}
class Animal implements IAnimal{
	private int id;
	private String species;
	private String name;
	private int age;
	Animal(int id,String species,String name,int age){
		this.id=id;
		this.species=species;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getSpecies() {
		return species;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Id:"+id+"\nSpecies:"+species+"\nName:"+name+"\nAge:"+age;
	}
}
class Zoo implements IZoo{
	private List<IAnimal> la;
	public Zoo() {
		this.la=new LinkedList<>();
	}
	public void addAnimal(IAnimal animal) {
		la.add(animal);
	}
	public void removeAnimal(int id) {
		la.remove(id);
	}
	public int countAnimals() {
		return la.size();
	}
	public List<IAnimal> getAnimalsBySpecies(String species) {
		List<IAnimal> s=new LinkedList<>();
		for(IAnimal lt:la) {
			if(((Animal)lt).getSpecies().equalsIgnoreCase(species)) {
				s.add(lt);
			}
		}
		return s;
	}
	public Map<Integer,List<IAnimal>> getAnimalsByAge(){
		Map<Integer,List<IAnimal>> m=new TreeMap<>();
		for(IAnimal lt:la) {
			m.putIfAbsent(((Animal)lt).getAge(),new LinkedList<>());
			m.get(((Animal)lt).getAge()).add(lt);
		}
		
		return m;
	}
	public void display() {
		for(IAnimal lt:la) {
			System.out.println(lt);
		}
	}
}
interface IZoo{
	
}
interface IAnimal{
	
}
/*public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {
Map<Integer, List<IAnimal>> ageGroups = new HashMap<>();
for (IAnimal animal : animals) {
int age = animal.getAge();
if (!ageGroups.containsKey(age)) {
ageGroups.put(age, new ArrayList<IAnimal>());
}
ageGroups.get(age).add(animal);
}
List<Map.Entry<Integer, List<IAnimal>>> result = new ArrayList<>(ageGroups.entrySet());
Collections.sort(result, new Comparator<Map.Entry<Integer, List<IAnimal>>>() {
@Override
public int compare(Map.Entry<Integer, List<IAnimal>> o1, Map.Entry<Integer, 
List<IAnimal>>
o2) {
return o2.getKey().compareTo(o1.getKey());
}
});
return result;
}*/