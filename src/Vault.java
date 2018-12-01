import java.util.Random;

public class Vault {

	Random gen = new Random();
	int code = gen.nextInt(609);

	boolean tryCode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {
Vault v= new Vault();
		v.tryCode(5);
		if(v.tryCode(5)==true) {
			System.out.println("This is it chief");
		}
	}
}
