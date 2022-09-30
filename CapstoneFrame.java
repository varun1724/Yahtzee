import javax.swing.*;

public class CapstoneFrame extends JFrame {

	public static void main(String[] args)
	{
		JFrame w = new JFrame("Yahtzee Game"); // Creates a frame, instantiates a gameBoard, allows the game to be played
	    w.setBounds(100, 100, 800, 600);
	    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    GameScore gameBoard = new GameScore();
	    gameBoard.setLayout(null);
	    w.add(gameBoard);
	    w.setResizable(true);
	    w.setVisible(true);
	    
	}
}