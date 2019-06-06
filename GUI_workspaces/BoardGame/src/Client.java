import javax.swing.JFrame;

public class Client {
	public static void main(String[] args) {
		Layout me = new Layout(); 
		me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me.setVisible(true);
		me.pack();
		me.setTitle("Test of GridLayout"); 
		me.setSize(700, 700);
	}
}
