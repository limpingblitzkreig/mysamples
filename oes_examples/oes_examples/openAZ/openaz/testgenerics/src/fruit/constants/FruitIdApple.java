package fruit.constants;


public enum FruitIdApple implements FruitId{
/** Fruit Apple <b> urn:fruit:apple </b> */
	FRUIT_APPLE_ID("urn:fruit:apple");
	private final String fruitId;
	FruitIdApple(String fruitId){
		this.fruitId = fruitId;
	}
	@Override public String toString() {
		return fruitId;
	}
}
