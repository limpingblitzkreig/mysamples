package fruit.test;

import fruit.api.FruitTruck;
import fruit.api.FruitBasket;
import fruit.api.Fruit;
import fruit.constants.FruitId;
import fruit.constants.FruitIdApple;
import fruit.constants.FruitIdOrange;
import fruit.impl.FruitTruckImpl;
import fruit.impl.FruitTruckImpl2;
//import fruit.constants.VegetableIdTomato;

public class FruitTruckTest {

	/**
	 * This test program is primarily to test the FruitTruckImpl
	 * class to determine if we can access generic collections
	 * by specifying the type of collection. In general, this
	 * requires casting specific assignments from specific
	 * subtypes to the more general wildcard type.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitTruck fruitTruck = new FruitTruckImpl();
		
		FruitBasket<FruitIdApple> apples = 
			fruitTruck.createNewFruitBasket(
					FruitIdApple.FRUIT_APPLE_ID);
		Fruit<FruitIdApple> apple = apples.createNewFruit();
		System.out.println("FruitId: " + apple.getFruitId() +
				"\n  Fruit name: " + apple.getFruitName());
		apples.addFruit(apple);
		
		//	fruitTruck.createNewFruitBasket(
		//		VegetableIdTomato.VEGETABLE_TOMATO_ID);
		
		FruitTruck fruitTruck2 = new FruitTruckImpl2();
		FruitBasket<FruitIdApple> apples2 = 
			fruitTruck2.createNewFruitBasket(
					FruitIdApple.FRUIT_APPLE_ID);
		Fruit<FruitIdApple> apple2 = apples2.createNewFruit();
		System.out.println("FruitId: " + apple2.getFruitId() +
				"\n  Fruit name: " + apple2.getFruitName());
		apples2.addFruit(apple2);
		
		//FruitBasket<VegetableIdTomato> tomatos = 
		//  fruitTruck2.createNewFruitBasket(
		//		VegetableIdTomato.VEGETABLE_TOMATO_ID);
	
		FruitBasket<FruitIdOrange> oranges = 
			fruitTruck.createNewFruitBasket(
					FruitIdOrange.FRUIT_ORANGE_ID);
		Fruit<FruitIdOrange> orange = oranges.createNewFruit();
		System.out.println("FruitId: " + orange.getFruitId() +
				"\n  FruitName: " + orange.getFruitName());
		oranges.addFruit(orange);

		// the following is illegal, which is the whole point  
		//  of this exercise:
		//apples.addFruit(orange);
		
		// Also, even more to the point, the following is
		// illegal, as well, which protects the user from
		// requesting one thing and getting another, even
		// if they explicitly try to:
		// Get this message in IDE:
		// Type mismatch: cannot convert from FruitBasket<FruitIdApple> to FruitBasket<FruitIdOrange>
		// FruitBasket<FruitIdOrange> orangeapples = fruitTruck.createNewFruitBasket(FruitIdApple.FRUIT_APPLE_ID);

		
		Fruit<? extends FruitId> fruit = apples.getFruit();
		//apples.addFruit(fruit);
		
		// Note the following compiles in eclipse w warnings,
		// but does not compile from ant:
		//apples.addFruit((Fruit<FruitIdApple>) fruit);
		//oranges.addFruit((Fruit<FruitIdOrange>) fruit);
		System.out.println("\nApple basket check:");
		apples = fruitTruck.getFruitBasket(FruitIdApple.FRUIT_APPLE_ID);
		while ((fruit = apples.getFruit()) != null)
		{
			System.out.println(
				"  FruitId: " + fruit.getFruitId() +
				"\n    Fruit name: " + fruit.getFruitName());
		}
		System.out.println("\nOrange basket check:");
		// The following won't compile because there is
		// one T in the sig for input and output
		//oranges = fruitTruck.getFruitBasket(
		//	FruitIdApple.FRUIT_APPLE_ID);
		oranges = fruitTruck.getFruitBasket(
				FruitIdOrange.FRUIT_ORANGE_ID);
		while ((fruit = oranges.getFruit()) != null)
		{
			System.out.println(
				"  FruitId: " + fruit.getFruitId() +
				"\n    Fruit name: " + fruit.getFruitName());
		}
	}
}
