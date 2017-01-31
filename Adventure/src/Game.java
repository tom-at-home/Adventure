
public class Game {
	private Player player;
	private Console console;
	
	public Game(Player player, Console console) {
		this.player = player;
		this.console = console;
	}
	
	/* Verarbeitet die Eingabe, gibt false zurueck, falls das Programm beendet werden soll */
	private boolean parse(String in) {
		switch(in) {
		case "n":
			if(this.player.getActualRoom().getRoomN() != null) {
				this.player.goN();
			} else {
				this.console.out("There is no room in N.");
			}
			break;
		case "s":
			if(this.player.getActualRoom().getRoomS() != null) {
				this.player.goS();
			} else {
				this.console.out("There is no room in S.");
			}
			break;
		case "w":
			if(this.player.getActualRoom().getRoomW() != null) {
				this.player.goW();
			} else {
				this.console.out("There is no room in W.");
			}
			break;
		case "e":
			if(this.player.getActualRoom().getRoomE() != null) {
				this.player.goE();
			} else {
				this.console.out("There is no room in E.");
			}
			break;
		case "g":
			int get_index = this.console.getIndex();
			Item item = this.player.getActualRoom().removeItem(get_index);
			this.player.addItem(item);
			break;
		case "d":
			int drop_index = this.console.getIndex();
			this.player.getActualRoom().addItem(this.player.removeItem(drop_index));
			break;
		case "c":
			int consume_index = this.console.getIndex();
			if(this.player.getItem(consume_index).isConsumable()) {
				System.out.println(this.player.removeItem(consume_index).getName() + " njam njam");
			} else {
				System.out.println("I don't want to eat " + this.player.getItem(consume_index).getName());
			}
			break;
		case "x":
			this.console.out("Bye.");
			this.console.close();
			return false;		
		default:
			this.console.out("Command unknown.");
			break;
		}
	
		return true;
	}
	
	/* Diese Methode stellt den Game-Loop dar */
	public void loop() {
		boolean isRunning = true;
		
		/* Solange das Spiel als laufend markiert ist,
		 * soll wiederholt werden.
		 */
		while(isRunning) {
			this.console.showRoom(this.player.getActualRoom());
			this.console.showInventory(this.player);
			isRunning = this.parse(this.console.getCommand());
		}
	}
}
