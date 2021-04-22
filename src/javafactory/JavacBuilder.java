package javafactory;

import interfaces.*;
import java.io.File;
import java.io.IOException;

public class JavacBuilder implements IBuilder {
	public void compile(File file) throws IOException, InterruptedException {
		String compile = "javac " + file.getPath();
		Process process = Runtime.getRuntime().exec(compile);
		process.waitFor();

		System.out.println(compile + " exitValue() " + process.exitValue());
	};
}
