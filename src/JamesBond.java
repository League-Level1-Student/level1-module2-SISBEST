
public class JamesBond {

	public static void main(String[] args) {
		Vault v = new Vault(200);
		for (int i = 1; i<1000000; i++) {
		boolean b = v.tryCode(i,v);
		if (b == true) {
			System.out.println("Cracked It!");
		}
		else if (b == false){
			System.out.println("Locked.");
		}
	}
}}