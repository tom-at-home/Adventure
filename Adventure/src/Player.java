import java.util.ArrayList;

public class Player {
	/* Der Raum, in dem sich der Spieler aktuell befindet. */
	private Room actualRoom;
	/* Die Gegenstaende, die der Spieler mit sich traegt. */
	private ArrayList<Item> items = new ArrayList<>();
	/* Konstruktor */
	public Player(Room actualRoom) {
		this.actualRoom = actualRoom;
	}
	
	/* Getter */
	public Room getActualRoom() {
		return this.actualRoom;
	}
	
	/* Wechselt den aktuellen Raum */
	public void goN() {
		this.actualRoom = this.actualRoom.getRoomN();
	}

	public void goS() {
		this.actualRoom = this.actualRoom.getRoomS();
	}
	
	public void goW() {
		this.actualRoom = this.actualRoom.getRoomW();
	}
	
	public void goE() {
		this.actualRoom = this.actualRoom.getRoomE();
	}
	
	/* Fuegt einen Gegenstand zum Inventar hinzu */
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	/* Gibt die Anzahl der Gegenstaende im Inventar zurueck. */
	public int getNumberOfItems() {
		return this.items.size();
	}
	
	/* Gibt einen Gegenstand anhand seines Indizes zurueck */
	public Item getItem(int index) {
		return this.items.get(index);
	}
	
	/* Entfernt einen Gegenstand aus dem Inventar und gibt diesen zurueck */
	public Item removeItem(int index) {
		return this.items.remove(index);
	}
}
