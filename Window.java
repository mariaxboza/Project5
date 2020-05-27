package game;
import javax.swing.*;

	/*
	 * This class is to use JOptionPane
	 */
public class Window {
	
	/*
	 * Method to print out a message in a window
	 */
	public void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    	}
	
	/*
	 * Method to print out options for the player to choose
	 */

    public int option(String[] options, String msg) {
        return JOptionPane.showOptionDialog(null, msg,// my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, // possible options
                options[0]); // default option
    }

	/*
	 * Method to print out a message
	 */
    public void println(String msg) {
        System.out.println(msg);
    }

	/*
	 * Method to get an input from the user
	 */
    public String input(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        return s;
    }

}
