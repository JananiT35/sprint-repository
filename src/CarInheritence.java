
public class CarInheritence {
	public static void main(String[] args) {
		
	}
}
abstract class Cartype{
	public boolean getIsSedan() {
		return this instanceof HondaCity;
		}
	public int getSeats(){
		if (this instanceof InnovaCrysta) {
            return 6;
        } else {
            return 4;
        }
	}
		
	public abstract String getMileage();
}
class WagonR extends Cartype{
	private int mileage;
	WagonR(int mileage){
		this.mileage=mileage;
	}
	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return mileage+"kmpl";
	}
	
}
class HondaCity extends Cartype{
	private int mileage;
	HondaCity(int mileage){
		this.mileage=mileage;
	}
	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return mileage+"kmpl";
	}
}
class InnovaCrysta extends Cartype{
	private int mileage;
	InnovaCrysta(int mileage){
		this.mileage=mileage;
	}
	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return mileage+"kmpl";
	}
}

