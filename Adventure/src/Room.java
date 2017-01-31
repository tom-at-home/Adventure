import java.util.ArrayList;

public class Room {
	/* Name und Beschreibung des Raumes */
	private String name;
	private String description;
	
	/* Die Gegenstaende, die sich im Raum befinden. */
	private ArrayList<Item> items = new ArrayList<>();
	
	/* Legt fest, mit welchen anderen Raeumen
	 * dieser Raum verbunden ist.
	 */
	private Room roomN;
	private Room roomS;
	private Room roomW;
	private Room roomE;
	
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	/* Setter */
	public void setRoomN(Room roomN) {
		this.roomN = roomN;
	}
	
	public void setRoomS(Room roomS) {
		this.roomS = roomS;
	}
	
	public void setRoomW(Room roomW) {
		this.roomW = roomW;
	}
	
	public void setRoomE(Room roomE) {
		this.roomE = roomE;
	}
	
	/* Getter */
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Room getRoomN() {
		return this.roomN;
	}
	
	public Room getRoomS() {
		return this.roomS;
	}
	
	public Room getRoomW() {
		return this.roomW;
	}
	
	public Room getRoomE() {
		return this.roomE;
	}
	
	/* Fuegt einen Gegenstand zu einem Raum hinzu */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/* Entfernt einen Gegenstand aus dem Raum und gibt diesen zurueck */
	public Item removeItem(int index) {
		return this.items.remove(index);
	}
	
	/* Gibt die Anzahl der Gegenstaende in diesem Raum zurueck. */
	public int getNumberOfItems() {
		return this.items.size();
	}
	
	/* Gibt einen Gegenstand anhand seines Indizes zurueck */
	public Item getItem(int index) {
		return this.items.get(index);
	}
}
