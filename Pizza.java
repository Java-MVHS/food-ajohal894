public class Pizza extends Food //created subclass Pizza of Food
{
	public Pizza (String ingredientIn) //created constructor of Pizza
	{
		super("baked", ingredientIn, "pizza"); //called the constructor of the superclass and passed in the variables prepMethod, ingredient, name
	}
	
	public Pizza(String ingredientIn, String nameIn) //overloaded the constructor of pizza and added new parameter nameIn
	{
		super("baked", ingredientIn, nameIn); //replace "pizza" with nameIn
	}
}
