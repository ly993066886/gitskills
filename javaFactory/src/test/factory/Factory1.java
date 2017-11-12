package test.factory;

public class Factory1 extends AbstractFactory {

	@Override
	public Flyable createFlyable() {
		// TODO Auto-generated method stub
		return new Plane();
	}

	@Override
	public Moveable createMoveable() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Writeable createWriteable() {
		// TODO Auto-generated method stub
		return new Pen();
	}

}
