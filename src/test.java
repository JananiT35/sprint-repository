package another;

class covariant1 {
	test covariant() {
		System.out.println("Covariant demo");
		return new test();
	}

}
class Demo extends test{
	Demo covariant() {
		System.out.println("testing");
		return new Demo();
	}
}
public class test{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.covariant();
	}
}