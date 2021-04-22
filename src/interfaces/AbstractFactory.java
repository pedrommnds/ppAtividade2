package interfaces;

public abstract class AbstractFactory {
	protected static AbstractFactory instance = null;

	public abstract IBuilder createBuilder();
	public abstract IFrame createSyntaxHighlighter();
}
