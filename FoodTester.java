public class FoodTester
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n"); //added code to print 3 lines
		Food food1 = new Food ("baked", "banana", "muffins");
		food1.printForSale();
		Food food2 = new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
		DeepDishPizza ddp = new DeepDishPizza("pepperoni"); //created new instance of DeepDishPizza and added parameter "pepperoni"
		ddp.printForSale(); //called printForSale using ddp
		System.out.print("\n\n\n"); //added code to print 3 lines
	}
}
