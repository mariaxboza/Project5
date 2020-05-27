package game;
import javax.swing.*;

public class Window {
	
	public void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public int option(String[] options, String msg) {
        return JOptionPane.showOptionDialog(null, msg,// my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, // possible options
                options[0]); // default option
    }

    public void println(String msg) {
        System.out.println(msg);
    }

    public String input(String msg) {
        String s = JOptionPane.showInputDialog(msg);
        return s;
    }

}
