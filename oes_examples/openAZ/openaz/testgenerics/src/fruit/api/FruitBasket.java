package fruit.api;

import fruit.constants.FruitId;

public interface FruitBasket<T extends Enum<T> & FruitId> {
	public T getFruitId();
	public Fruit<T> createNewFruit();
	public void addFruit(Fruit<T> t);
	public Fruit<T> getFruit();
}
