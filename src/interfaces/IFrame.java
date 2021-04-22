package interfaces;

import javax.swing.JFrame;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

@SuppressWarnings("serial")
public abstract class IFrame extends JFrame {
	public abstract RSyntaxTextArea createTextArea();
}
