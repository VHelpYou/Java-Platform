package ss.training.java.exception;

import java.io.IOException;
import java.nio.file.Path;

public abstract class SSFileReader {
	abstract void readAFile(Path filePath) throws IOException;
}
