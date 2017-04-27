import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Draw extends JPanel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Maze");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Maze M = new Maze(70,70);
		M.setBackground(Color.WHITE);
		f.add(M);
		f.setSize(785, 800);
		f.setVisible(true);
	}
}