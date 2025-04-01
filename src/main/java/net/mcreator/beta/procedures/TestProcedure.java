package net.mcreator.beta.procedures;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class OpenGuiProcedure {
	public static void execute() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        JFrame frame = new JFrame("Simple Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
	}
}