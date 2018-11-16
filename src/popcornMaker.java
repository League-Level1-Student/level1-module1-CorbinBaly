import javax.swing.JOptionPane;

public class popcornMaker {
	public static void main(String[] args) {
		Microwave Micro = new Microwave();
		Popcorn Pop = new Popcorn("Butter");
		Micro.putInMicrowave(Pop);
		Micro.setTime(5);
		Micro.startMicrowave();
		Pop.eat();

	}
}
