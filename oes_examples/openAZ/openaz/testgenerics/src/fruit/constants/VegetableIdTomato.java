package fruit.constants;

public enum VegetableIdTomato implements VegetableId {
	/** Fruit Apple <b> urn:fruit:apple </b> */
	VEGETABLE_TOMATO_ID("urn:vegetable:tomato");
	private final String fruitId;
	VegetableIdTomato(String fruitId){
		this.fruitId = fruitId;
	}
	@Override public String toString() {
		return fruitId;
	}

}
