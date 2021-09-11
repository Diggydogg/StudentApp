package fruit;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	
	public Fruit() {
		
	}
	
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	
	public class FruitComparator implements Comparator<Fruit>{
		@Override 
		public int compare(Fruit o1,Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	public class FruitComparatorDesc implements Comparator<Fruit>{
		
		@Override
		public int compare(Fruit o1,Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
	}
}
