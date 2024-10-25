/* Aades Johal
 * 10-24-2024
 * Period 5
 * Food.java
 * Creating subclasses of Food called Pizza and DeepDishPizza and printing them out in FoodTester
 * Working on: Creating subclasses
*/


public class Food
{
	protected String str;
	
	public Food ()
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
