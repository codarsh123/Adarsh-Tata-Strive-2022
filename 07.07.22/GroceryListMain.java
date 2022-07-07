package assignment0707;

public class GroceryListMain {

	public static void main(String[] args) {
		GroceryList <String> g1= new GroceryList<String>("Apple", "Cabbige", "Bread", "Fish");
		GroceryList <String> g2= new GroceryList<String>("Orange", "Tomato", "Cake", "Chicken");
		GroceryList <String> g3= new GroceryList<String>("Apple", "Cabbige", "Bread", "Fish");
		GroceryList <String> g4= new GroceryList<String>("Mango", "Spinich", "Pav", "Egg");
		
		System.out.println(g1.equals(g3));
		System.out.println(g1.hashCode()+" "+g3.hashCode());
		System.out.println("-----------------");
		System.out.println(g1.equals(g2));
		System.out.println(g1.hashCode()+" "+g2.hashCode());

		


	}

}
