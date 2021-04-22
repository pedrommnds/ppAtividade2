package cppfactory;

import interfaces.*;
import java.io.File;
import java.io.IOException;

public class GppBuilder implements IBuilder {
	public void compile(File file) throws IOException, InterruptedException {
		String fileName = file.getName().substring(0, file.getName().lastIndexOf('.'));
		
		String compile = "g++ " + file.getPath() + " -o " + file.getParent() + "/" + fileName + ".out";
		Process process = Runtime.getRuntime().exec(compile);
		process.waitFor();

		System.out.println(compile + " exitValue() " + process.exitValue());
	};
}
 