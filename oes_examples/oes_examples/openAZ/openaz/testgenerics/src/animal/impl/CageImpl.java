package animal.impl;
//import animal.api.Animal;
import animal.api.Cage;
import java.util.HashSet;
import java.util.Collection;
import java.util.AbstractCollection;
import java.util.Iterator;

public class CageImpl<T>  
		extends AbstractCollection<T> implements Cage<T> {
	
	Collection<T> c;
	Iterator<T> iterator;
		
	public CageImpl(){
		c = new HashSet<T>();
		iterator = c.iterator();
	}
	public Iterator<T> iterator() {
		return iterator;
	}
	public int size(){
		return c.size();
	}
	public boolean add(T t){
		return c.add(t);
	}
}
