package cppfactory;

import interfaces.*;

public class CppFactory extends AbstractFactory {
	
	private CppFactory() {};
	
	public static AbstractFactory getInstance() {
		if (instance == null)
			instance = new CppFactory();
		return instance; 
	};
	
	public IBuilder createBuilder() {
		return new GppBuilder();
	};
	
	public IFrame createSyntaxHighlighter() {
		return new CppSyntaxHighlighter();
	};
	
	public static String[] supportedExtensions() {
		String[] extensions = {"cc","cpp"};
		return extensions;
	};
}
