package fruit.impl;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

import fruit.api.Fruit;
import fruit.api.FruitBasket;
import fruit.constants.FruitId;
//import fruit.constants.FruitIdApple;

//public class FruitBasketImpl<T extends Enum<T extends FruitId>> 
public class FruitBasketImpl<T extends Enum<T> & FruitId> 
	implements FruitBasket<T>{
	
	private T t;
	private Set<Fruit<T>> fruits = null;
	
	public FruitBasketImpl(T t){
		this.t = t;
		fruits = new HashSet<Fruit<T>>();
	}
	
	public T getFruitId(){
		return t;
	}
	public Fruit<T> createNewFruit() {
		Fruit<T> fruit = new FruitImpl<T>(t);
		return fruit;
	}
	public void addFruit(Fruit<T> fruit){
		fruits.add(fruit);
	}
	public Fruit<T> getFruit() {
		Fruit<T> fruit = null;
		Iterator<Fruit<T>> itFruit = fruits.iterator();
		if (itFruit.hasNext()) {
			fruit = itFruit.next();
			fruits.remove(fruit);
		}
		return fruit;
	}
}
