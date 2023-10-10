public class YamlParsingException extends Exception {
	public YamlParsingException() {
		super();
	}

	public String toString() {
		String message = new String("An exception was thrown while parsing the YAML object");
		return message;
	}
}

