
public class Item {
	private String name;
	private boolean consumable;
	
	public Item(String name, boolean consumable) {
		this.name = name;
		this.consumable = consumable;
	}
	
	/* Getter */
	public String getName() {
		return this.name;
	}
	
	public boolean isConsumable() {
		return this.consumable;
	}
}
