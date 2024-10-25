public class FoodTester3
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n"); //added code to print 3 lines
		Food3 food1 = new Food3 ("baked", "banana", "muffins", 50, 12); //changed Food to Food3, added 2 ints and 1 double as parameters
		food1.printForSale();
		Food3 food2 = new Food3 ("fried", "yam", "fritters", 100, 3); //changed Food to Food3, added 2 ints and 1 double as parameters
		food2.printForSale();
		Pizza3 pizza = new Pizza3 ("pepperoni", 250, 8); //changed Pizza to Pizza3, added 2 ints and 1 double as parameters
		pizza.printForSale();
		DeepDishPizza3 ddp3 = new DeepDishPizza3 ("baked", "deep dish pizza", "pepperoni", 250, 8, 20.00);
		ddp3.printForSale();
		System.out.print("\n\n\n"); //added code to print 3 lines
	}
}
