
public class Minion {
	private static String name; 
	private static int eyes; 
	private static String color; 
	private static String master;
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
				
}
	String getMaster(){
		return Minion.master;
	}
	String getName() {
		return Minion.name;
	}
	int getEyes() {
		return Minion.eyes;
	}
	String getColor() {
		return Minion.color;
	}
	void setMaster(String newMaster) {
		master = newMaster;
	}
	}

	