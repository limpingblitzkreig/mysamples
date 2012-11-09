package animal.test;
import animal.api.*;
import animal.impl.*;

public class CageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion king = new LionImpl();
		
		@SuppressWarnings("unused")
		Animal a = king;
		
		Cage<Lion> lionCage = new CageImpl<Lion>();
		lionCage.add(king);
		Butterfly monarch = new ButterflyImpl();
		Cage<Butterfly> butterflyCage = new CageImpl<Butterfly>();
		butterflyCage.add(monarch);
		Cage<Animal> animalCage = new CageImpl<Animal>();
		animalCage.add(king);
		animalCage.add(monarch);
		//animalCage = lionCage;
		
		@SuppressWarnings("unused")
		Cage<? extends Animal> someCage;
		
		someCage = lionCage;
		//someCage.add(king);
		someCage = butterflyCage;
		// someCage.add(monarch);
		feedAnimals(lionCage);
		feedAnimals(butterflyCage);
		
		System.out.println("done");
	}
	static void feedAnimals(Cage<? extends Animal> someCage){
		for (Animal a : someCage)
			a.getClass();
	}

}
