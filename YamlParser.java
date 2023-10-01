import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YamlParser {

	File file;
	String rawText;

	public YamlParser() throws FileNotFoundException {
		this.file = setDefaultParsedFile();
	}

	public YamlParser(String str) {
		this.file = new File(str);
	}

	public YamlParser(File file) {
		this.file = file;
	}

	private File setDefaultParsedFile() throws FileNotFoundException {
		File localDir = new File("./");
		File[] fileList = localDir.listFiles();
		for (File file : fileList) {
			try {
				int fileNameLength = file.getName().length();
				if (file.getName().substring(fileNameLength - 4).equals(".yml")) return file;
				else if (file.getName().substring(fileNameLength - 5).equals(".yaml")) return file;
			} catch (IndexOutOfBoundsException i) {
				continue;
			}
		} throw new FileNotFoundException();
	}

	private void read() throws FileNotFoundException {
		Scanner scanner = new Scanner(this.file);
		while (scanner.hasNextLine()) {
			this.rawText += scanner.nextLine();
		}
		scanner.close();
	}

	public Yaml parse() {
		// TODO
		return null;
	}

	public String toString() {
		return this.file.getName();
	}
}

