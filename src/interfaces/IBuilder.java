package interfaces;

import java.io.File;
import java.io.IOException;

public interface IBuilder {
	public abstract void compile(File file) throws IOException, InterruptedException;
}
