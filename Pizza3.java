public class Pizza3 extends Food3 //created subclass Pizza3 of Food3
{
	public Pizza3 (String ingredientIn, int costIn, int countIn, double profitIn) //changed Pizza to Pizza3, added 2 ints one double as parameters
	{
		super("pizza", ingredientIn, "baked", 250, 8, 20.00); //called the constructor of the superclass and passed in the variables prepMethod, ingredient, name
	}
	
	public Pizza3(String nameIn, String ingredientIn, String prepMethodIn, int costIn, int countIn, double profitIn) //overloaded the constructor of pizza and added new parameter nameIn
	{
		super(nameIn, prepMethodIn, ingredientIn, costIn, countIn, profitIn); //replace "pizza" with nameIn
	}
}
