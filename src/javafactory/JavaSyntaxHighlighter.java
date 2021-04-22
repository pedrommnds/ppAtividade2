package javafactory;

import interfaces.*;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

@SuppressWarnings("serial")
public class JavaSyntaxHighlighter extends IFrame {
	public RSyntaxTextArea createTextArea() {
		RSyntaxTextArea textArea = new RSyntaxTextArea(33, 75);
	    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
	    textArea.setCodeFoldingEnabled(true);  
	    
	    return textArea;
	};
}
	