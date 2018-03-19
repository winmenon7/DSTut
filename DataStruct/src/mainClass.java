import food.Fruit;

public class mainClass {
	
	
	public static void main(String[] args) {
		
	
	
	Apple a = new Apple();
	
	
	Fruit f = new Apple();
	f.getCoin();
	a.getCoin();

	Vehicle v = new Vehicle();
	Vehicle c = new Car();
	
	v.getDetails();
	c.getDetails();
	
	a.carColor();
	a.getNameAge("Vineeth", 30);
	doShapes(a);
	}

	public static void doShapes(Fruit f) 
	{ f.getCoin();
	}
	
	
	
	
}
