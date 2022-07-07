package assignment0707;

import java.util.Objects;

public class GroceryList <e> {
	
	e fruits;
	e vegitables;
	e bakery;
	e meat;
	public e getFruits() {
		return fruits;
	}
	public void setFruits(e fruits) {
		this.fruits = fruits;
	}
	public e getVegitables() {
		return vegitables;
	}
	public void setVegitables(e vegitables) {
		this.vegitables = vegitables;
	}
	public e getBakery() {
		return bakery;
	}
	public void setBakery(e bakery) {
		this.bakery = bakery;
	}
	public e getMeat() {
		return meat;
	}
	public void setMeat(e meat) {
		this.meat = meat;
	}
	public GroceryList(e fruits, e vegitables, e bakery, e meat) {
		super();
		setFruits(fruits);		
		setVegitables(vegitables);
		setBakery( bakery);
		setMeat(meat);
	}
	@Override
	public String toString() {
		return "GroceryList [fruits=" + fruits + ", vegitables=" + vegitables + ", bakery=" + bakery + ", meat=" + meat
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bakery, fruits, meat, vegitables);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		return Objects.equals(bakery, other.bakery) && Objects.equals(fruits, other.fruits)
				&& Objects.equals(meat, other.meat) && Objects.equals(vegitables, other.vegitables);
	}
	

}
