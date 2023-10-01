public class Boolean extends Numeric {
	
	boolean value;
	
	public Boolean() {
		this.value = false;
	}

	public Boolean(String str) {
		this.value = toBoolean(str).getBoolean();
	}

	public Boolean(boolean bool) {
		this.value = bool;
	}

	public static boolean toBoolean(String str) throws InvalidYamlObjectException {
		boolean on = str.toLowerCase().equals("on");
		boolean off = str.toLowerCase().equals("off");
		boolean yes = str.toLowerCase().equals("yes");
		boolean no = str.toLowerCase().equals("no");
		boolean truthful = str.toLowerCase().equals("true");
		boolean untruthful = str.toLowerCase().equals("false");
		if (on || yes || truthful) return new Boolean(true);
		if (off || no || untruthful) return new Boolean(false);
		throw new InvalidYamlObjectException();
	}

	public boolean getBoolean() {
		return this.value;
	}

	public boolean setBoolean(boolean bool) {
		this.value = bool;
	}

	public String toString() {
		if (this.value) return "True";
		return "False";
	}

}

