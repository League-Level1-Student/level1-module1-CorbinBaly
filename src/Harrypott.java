import javax.swing.JOptionPane;

public class Harrypott {
	public static void main(String[] args) {
		String Stupify="Stupify";
		HarryPotter HarryPotter = new HarryPotter();
		String invis=JOptionPane.showInputDialog("Make Harry Invisible?");
			if(invis.equalsIgnoreCase("yes")) {
				HarryPotter.makeInvisible(true);
			}
		String spy=JOptionPane.showInputDialog("Spy on Professor Snape?");
		if(spy.equalsIgnoreCase("yes")) {
			HarryPotter.spyOnSnape();
		}
		String visible=JOptionPane.showInputDialog("Become visible again?");
		if(visible.equalsIgnoreCase("yes")) {
			HarryPotter.makeInvisible(false);
		}
		String spell=JOptionPane.showInputDialog("Cast a spell?");
		if(spell.equalsIgnoreCase("yes")) {
			HarryPotter.castSpell(Stupify);
		}
	}
}
