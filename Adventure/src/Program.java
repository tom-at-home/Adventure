
public class Program {

	public static void main(String[] args) {
		Room room1 = new Room("Room1", "This is room 1.");
		Room room2 = new Room("Room2", "This is room 2.");
		Room room3 = new Room("Room3", "This is room 3.");
		Room room4 = new Room("Room4", "This is room 4.");
		Room room5 = new Room("Room5", "This is room 5.");
		Room room6 = new Room("Room6", "This is room 6.");

		room1.setRoomE(room2);
		room2.setRoomW(room1);
		room2.setRoomE(room3);
		room2.setRoomS(room4);
		room3.setRoomW(room2);
		room3.setRoomS(room5);
		room4.setRoomN(room2);
		room4.setRoomE(room5);
		room4.setRoomS(room6);
		room5.setRoomN(room3);
		room5.setRoomW(room4);
		room6.setRoomN(room4);
		
		Item apple = new Item("Apple", true);
		Item torch = new Item("Torch", false);
		Item stone = new Item("Stone", false);
		Item stone2 = new Item("Stone", false);
		Item bananaPeel = new Item("Banana Peel", true);
		
		room1.addItem(apple);
		room1.addItem(stone);
		room6.addItem(stone2);
		room2.addItem(torch);
		room5.addItem(bananaPeel);
		
		Player player = new Player(room4);		
		Console console = new Console();
		Game game = new Game(player, console);
		game.loop();
	}

}
