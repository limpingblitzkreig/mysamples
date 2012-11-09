package fruit.impl;

import fruit.api.FruitBasket;
import fruit.api.FruitTruck;
import fruit.constants.FruitId;
import fruit.constants.FruitIdApple;
import fruit.constants.FruitIdOrange;
//import fruit.constants.VegetableId;
import fruit.impl.FruitBasketImpl;
import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
/**
 * 
 * We want the FruitTruck to have both a Set of apple baskets
 * and a Set of orange baskets. But we just want to pass the
 * specific FruitId to get an appropriate basket.
 * <p>
 * Note: it appears the key trick is to have the stored
 * variables, in this case the subtypes of FruitBasket,
 * be declared as wildcards compatible with what will
 * be assigned to them. i.e. any of the following will
 * work: FruitBasket<?>, FruitBasket<? extends Enum<?>,
 * or FruitBasket<? extends FruitId>. These are all
 * compatible with FruitBasket<FruitIdApple> or
 * FruitBasket<FruitIdOrange>.
 * <p>
 * However FruitBasket<? extends VegetableId> is 
 * not compatible w the assignments as described below.
 * 
 * @author rlevinson
 *
 */
public class FruitTruckImpl  
		implements FruitTruck {

	@SuppressWarnings("unused")
	private FruitBasket<? extends Enum<?>> appleBasket = null;
	@SuppressWarnings("unused")
	private FruitBasket<? extends FruitId> orangeBasket = null;
	
	// Note: the following does not compile below when try
	// to assign "orangeBasket = fruitBasket;" get msg:
	// "Type mismatch: cannot convert from FruitBasket<T> 
	//         to FruitBasket<? extends VegetableId>	
	//private FruitBasket<? extends VegetableId> orangeBasket = null;
	
	private Set<FruitBasket<? extends FruitId>> appleBaskets = null;
	private Set<FruitBasket<? extends FruitId>> orangeBaskets = null;
	
	public FruitTruckImpl(){
		appleBaskets = 
			new HashSet<FruitBasket<? extends FruitId>>();
		orangeBaskets =
			new HashSet<FruitBasket<? extends FruitId>>();
	}
	
	/**
	 * <pre>
	 *  Note: the following will not work because  
	 *  can't convert and return the type: 
	 *  	FruitBasket<FruitIdApple>
	 *  to:
	 *  	FruitBasket<T extends Enum<T> & FruitId>
	 *  which is required to be returned.
	 *  
	 *  However, we can assign a specific instance of type: 
	 *  	FruitBasket<T extends Enum<T> & FruitId> 
	 *  to an instance of type:
	 *  	FruitBasket<? extends FruitId>
	 *  because the former is some kind of subtype of
	 *  the latter.
	 *  
	 *  </pre>
	 *  This is example of "put" rule where you can
	 *  put a subtype to a supertype.
	 *  
	 *  FruitBasket<FruitIdApple> appleBasket = null;
	 *  appleBasket = fruitBasket;
	 */
	public <T extends Enum<T> & FruitId>
			FruitBasket<T> createNewFruitBasket(T t) {
		
		FruitBasket<T> fruitBasket = new FruitBasketImpl<T>(t);
		// In the following we select the basket collection
		// to add the new FruitBasket to based on the FruitId
		// that was passed in.
		if (t.equals(FruitIdApple.FRUIT_APPLE_ID)){
			appleBasket = fruitBasket;
			appleBaskets.add(fruitBasket);
		}
		else if (t.equals(FruitIdOrange.FRUIT_ORANGE_ID)){
			orangeBasket = fruitBasket;
			orangeBaskets.add(fruitBasket);
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
			//@SuppressWarnings("unchecked") 
			//FruitBasket<T> fruitBasket = (FruitBasket<T>)appleBasket;
			FruitBasket<T> fruitBasket = null;
			Iterator<FruitBasket<? extends FruitId>> 
				it = appleBaskets.iterator();
			while (it.hasNext()) {
				@SuppressWarnings("unchecked")
				FruitBasket<T> 
					tempBasket = (FruitBasket<T>) it.next();
				fruitBasket = tempBasket;
			}
			return fruitBasket;
		}
		else if (t.equals(FruitIdOrange.FRUIT_ORANGE_ID)){
			//@SuppressWarnings("unchecked") 
			//FruitBasket<T> fruitBasket = (FruitBasket<T>)orangeBasket;
			Iterator<FruitBasket<? extends FruitId>> 
				it = orangeBaskets.iterator();
			FruitBasket<T> fruitBasket = null;
			while (it.hasNext()) {
				@SuppressWarnings("unchecked")
				FruitBasket<T> 
					tempBasket = (FruitBasket<T>) it.next();
				fruitBasket = tempBasket;
			}
			return fruitBasket;
		}
		return null;
	}
}
