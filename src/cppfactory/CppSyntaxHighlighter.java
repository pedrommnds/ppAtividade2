package cppfactory;

import interfaces.*;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

@SuppressWarnings("serial")
public class CppSyntaxHighlighter extends IFrame {
	
	public RSyntaxTextArea createTextArea() {
		RSyntaxTextArea textArea = new RSyntaxTextArea(33, 75);
	    textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);
	    textArea.setCodeFoldingEnabled(true);  
	    
	    return textArea;
	};
}
