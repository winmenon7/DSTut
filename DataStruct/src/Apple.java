import food.Fruit;
import food.InterfaceOne;
import food.InterfaceThree;

public class Apple  extends Fruit implements InterfaceThree{

	@Override
	public  void carColor() {
System.out.println("This is an abstract method's implementation");		
	}

	@Override
	public void fruitColor() {
		System.out.println("This is an abstract method's implementation");	
		
	}

	@Override
	public void getNameAge(String x, int y) {
System.out.println("The age is : "+y);

System.out.println("The name is :  " +x);


System.out.println("Age = " +age);
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}
	
	Coffee c = new Coffee();
	
	public void getCoin()
	{
		System.out.println("This is from Apple class and not from Fruit");
		
	}
	

	

}
