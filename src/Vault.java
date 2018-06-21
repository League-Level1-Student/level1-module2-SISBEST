
public class Vault {
	private int code;

	Vault(int code){
		this.code = code;
}

boolean tryCode(int guess, Vault va){
	if(guess == va.code) {
		return true;
	}
	else {
		return false;
}
}}