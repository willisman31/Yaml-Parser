public abstract class Yaml {

	String key;
	Object value;

	public Yaml(String key, Object value) {
		this.key = key;
		this.value = value;
	}

	abstract Yaml getValue(String key);

	abstract void setValue(String key, Object value);

	public abstract String toString();

	abstract boolean equalTo(Yaml yaml);
}

