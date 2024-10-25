/* Aades Johal
 * 10-24-2024
 * Period 5
 * Food3.java
 * Creating subclasses of Food called Pizza and DeepDishPizza and printing them out in FoodTester
 * Working on: Creating subclasses
*/


public class Food3 //changed Food to Food3
{
	protected String str;
	protected double profit;
	protected int count;
	protected int cost;
	
	public Food3 () //changed Food to Food3
	{
		str = new String("");
		profit = (cost * count) / 100;
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int cost, int count, double profit) //changed Food to Food3 and added parameters int cost, int count, double profit
	{
		str = String.format("At the sale: %s %s with %s will be sold for %d cents each. With %d %s(s), $%.2f can be made.", name, prepMethod, ingredient, cost, count, name, profit);
		// made str equal to String.format and put the output in that.
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
