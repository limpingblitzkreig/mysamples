package fruit.impl;

import fruit.api.Fruit;
import fruit.constants.FruitId;
import fruit.constants.FruitIdApple;

public class FruitImpl<T extends Enum<T> & FruitId> 
		implements Fruit<T> {
	
	private T t;
	private String fruitName = "I don't have a name";
	
	public FruitImpl(T t){
		this.t = t;
		if (t.equals(FruitIdApple.FRUIT_APPLE_ID)){
			this.fruitName = "I am an apple";
		}
	}
	
	public T getFruitId(){
		return t;
	}
	
	public String getFruitName(){
		return fruitName;
	}
}
