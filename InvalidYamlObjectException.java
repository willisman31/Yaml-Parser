public class InvalidYamlObjectException extends Exception {

	public InvalidYamlObjectException() {
		super();
	}

	 public InvalidYamlObjectException(String str) {
		 super(str);
	 }

	 public String toString() {
		 return "InvalidYamlObjectException thrown";
	 }
}

