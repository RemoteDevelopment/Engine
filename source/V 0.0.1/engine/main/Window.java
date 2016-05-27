package engine.main;

import java.awt.Component;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window(String title) {
		setTitle(title);
	}

	/**Creates a <code>Window</code>
	 * @param width: Width of the window
	 * @param height: Height of the window
	 * @param title: Title of the window
	 * @param comp: Component to put into the window
	 **/
	public static Window createWindow(int width, int height, String title, Component comp) {
		JFrame window = new Window(title);
		window.setResizable(false);
		window.setSize(width, height);
		window.add(comp);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		return (Window) window;
	}

}
