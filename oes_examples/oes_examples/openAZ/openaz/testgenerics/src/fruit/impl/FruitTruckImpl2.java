package fruit.impl;

import fruit.api.FruitBasket;
import fruit.api.FruitTruck;
import fruit.constants.FruitId;
import fruit.constants.FruitIdApple;
import fruit.constants.FruitIdOrange;
import fruit.impl.FruitBasketImpl;
/**
 * We want the FruitTruck to have both an apple basket
 * and an orange basket. But we just want to pass the
 * FruitId to get the appropriate basket.
 * 
 * @author rlevinson
 *
 */
public class FruitTruckImpl2  
		implements FruitTruck {

	private FruitBasket<? extends FruitId> appleBasket = null;
	private FruitBasket<? extends FruitId> orangeBasket = null;
	
	// the ones below fail ant compile: FruitTruckImpl2.java:21: 
	//  type parameter ? extends java.lang.Enum<? extends fruit.constants.FruitId> 
	//  is not within its bound
	//private FruitBasket<? extends Enum<? extends FruitId>> appleBasket = null;
	//private FruitBasket<? extends Enum<? extends FruitId>> orangeBasket = null;
	
	public FruitTruckImpl2(){
	}
	
	/**
	 * <pre>
	 *  Note: the following will not work because  
	 *  can't convert the type: 
	 *  	FruitBasket<FruitIdApple>
	 *  to:
	 *  	FruitBasket<T>
	 *  which is required to be returned.
	 *  However, we can assign an instance of type: 
	 *  	<T extends Enum<T> & FruitId> FruitBasket<T>
	 *  or, more explicitly:
	 *  	FruitBasket<T extends Enum<T> & FruitId> 
	 *  to an instance of type:
	 *  	FruitBasket<? extends FruitId>
	 *  because the former is some kind of subtype of
	 *  the latter.
	 *  </pre>
	 *  
	 *  
	 *  FruitBasket<FruitIdApple> appleBasket = null;
	 *  appleBasket = fruitBasket;
	 */
	public <T extends Enum<T> & FruitId>
			FruitBasket<T> createNewFruitBasket(T t) {
		
		FruitBasket<T> fruitBasket = new FruitBasketImpl<T>(t);
		if (t.equals(FruitIdApple.FRUIT_APPLE_ID)){
			appleBasket = fruitBasket;
		}
		else if (t.equals(FruitIdOrange.FRUIT_ORANGE_ID)){
			orangeBasket = fruitBasket;
		}
		return fruitBasket;
	}
	
	/**
	 * In this method we know from the type parameter t, that
	 * is passed in, what kind of FruitBasket we want.
	 * In order to get the effect we want, which is to pass
	 * in the type of fruit basket and get that specific 
	 * type back, we need to suppress the warnings when we
	 * cast the known FruitBasket type to the more general type:
	 */
	public <T extends Enum<T> & FruitId>
	FruitBasket<T> getFruitBasket(T t){
		if (t.equals(FruitIdApple.FRUIT_APPLE_ID)){			
			@SuppressWarnings("unchecked") 
			FruitBasket<T> fruitBasket = (FruitBasket<T>)appleBasket;
			return fruitBasket;
		}
		else if (t.equals(FruitIdOrange.FRUIT_ORANGE_ID)){
			@SuppressWarnings("unchecked") 
			FruitBasket<T> fruitBasket = (FruitBasket<T>)orangeBasket;
			return fruitBasket;
		}
		return null;
	}
}
