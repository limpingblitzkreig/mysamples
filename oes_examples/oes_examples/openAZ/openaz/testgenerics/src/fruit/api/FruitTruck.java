package fruit.api;
import fruit.constants.FruitId;

public interface FruitTruck {
	
	public <T extends Enum<T> & FruitId> 
		FruitBasket<T> createNewFruitBasket(T t);
	
	public <T extends Enum<T> & FruitId>
	    FruitBasket<T> getFruitBasket(T t);
}
