import java.util.Scanner;

public class Console {
	Scanner scanner = new Scanner(System.in);
	
	/* Zeigt die Informationen zu dem uebergebenen Raum an */
	public void showRoom(Room room) {
		System.out.println("You are in " + room.getName());
		System.out.println(room.getDescription());
		System.out.print("Here are: ");
		for (int i = 0; i < room.getNumberOfItems(); i++) {
			System.out.print(i + ": " + room.getItem(i).getName() + " ");
		}
		System.out.println();
		System.out.print("You can go to ");
		if(room.getRoomN() != null) {
			System.out.print("N ");
		}
		if(room.getRoomS() != null) {
			System.out.print("S ");
		}
		if(room.getRoomW() != null) {
			System.out.print("W ");
		}
		if(room.getRoomE() != null) {
			System.out.print("E ");
		}
		System.out.println(".");
	}
	
	/* Zeigt das Inventar des Spielers an */
	public void showInventory(Player player) {
		for (int i = 0; i < player.getNumberOfItems(); i++) {
			System.out.print(i + ": " + player.getItem(i).getName() + " ");
		}
		System.out.println();
	}
	
	/* Holt ein Kommando von der Eingabeaufforderung */
	public String getCommand() {
		System.out.print("> ");
		String in = this.scanner.nextLine();
		return in.toLowerCase();
	}
	
	/* Holt einen Index von der Eingabeaufforderung */
	public int getIndex() {
		System.out.print("Which index? ");
		String in = this.scanner.nextLine();
		return Integer.parseInt(in);
	}
	
	/* Gibt eine Ausgabe aus */
	public void out(String out) {
		System.out.println(out);
	}
	
	/* Schliesst den Scanner */
	public void close() {
		this.scanner.close();
	}
}
