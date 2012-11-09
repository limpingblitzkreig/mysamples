package fruit.constants;


public enum FruitIdOrange  implements FruitId{
/** Fruit Apple <b> urn:fruit:orange </b> */
	FRUIT_ORANGE_ID("urn:fruit:orange");
	private final String fruitId;
	FruitIdOrange(String fruitId){
		this.fruitId = fruitId;
	}
	@Override public String toString() {
		return fruitId;
	}
}
