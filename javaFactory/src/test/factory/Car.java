package test.factory;

public class Car implements Moveable {

	@Override
	public void move(int width) {
		// TODO Auto-generated method stub
		System.out.println(11);
	}
	public void dirve() {
		System.out.println("i can dirve");
	}
	public void driver() {
		System.out.println("i am a driver");
	}

}
