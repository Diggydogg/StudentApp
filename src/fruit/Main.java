package fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi",2000));
		
		fl.add(new Fruit(104,"Mango",2300));
		fl.add(new Fruit(105,"Watermelon",2300));
		fl.add(new Fruit(106,"Strawberry",2300));
		fl.add(new Fruit(107,"Blackberry",2300));
		fl.add(new Fruit(108,"Banana",2300));
		fl.add(new Fruit(109,"AppleMango",2300));
		fl.add(new Fruit(110,"Grape",2300));
		
		
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s:fl) {
			//System.out.println(s.toString());
			System.out.println("Fruit [no ="+s.no+
					", name="+s.name+", price="+s.price+"]");
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0;i<fl.size();i++) {
			//System.out.println(fl.get(i).toString());
			System.out.println("Student [no ="+fl.get(i).no+
					", name="+fl.get(i).name+", price="+fl.get(i).price+"]");
		}
	}
}
