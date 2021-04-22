package javafactory;

import interfaces.*;

public class JavaFactory extends AbstractFactory {
	
	private JavaFactory() {};
	
	public static AbstractFactory getInstance() {
		if (instance == null)
			instance = new JavaFactory();
		return instance; 
	};
	
	public IBuilder createBuilder() {
		return new JavacBuilder();
	};
	
	public IFrame createSyntaxHighlighter() {
		return new JavaSyntaxHighlighter();
	};
	
	public static String[] supportedExtensions() {
		String[] extensions = {"java"};
		return extensions;
	};
}
