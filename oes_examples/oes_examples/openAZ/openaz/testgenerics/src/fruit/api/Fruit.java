package fruit.api;

import fruit.constants.FruitId;

public interface Fruit<T extends Enum<T> & FruitId> {
	public T getFruitId();
	public String getFruitName();
}
