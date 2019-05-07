package elseif;

import javax.swing.JOptionPane;

public class Are_You_HappY {
	public static void main(String[] args) {
	String a =	JOptionPane.showInputDialog("Are you happy?");
	if (a.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	else if (a.equals("No")) {
		String b = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if (b.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		else if (b.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change Something");
		}
	}
	}

}
