import food.EnumOne;

public class EnumClass {
	public static void main(String[] args) {
		
		Coffee drink = new Coffee();
		
		Tea t = new Tea();
		t.strength = Tea.Chaya.LIGHT;
		
		
	} 

}
class Coffee{
	EnumOne size;
}

//Enum with-in a Class
class Tea{
	enum Chaya{STRONG, MEDIUM, LIGHT}
	Chaya strength;
}