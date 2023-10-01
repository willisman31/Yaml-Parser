public abstract class Numeric {
	
	private String str;
	
	public Numeric() {}
	
	public Numeric(String str) {this.str = str;}
	
	public static boolean isUtilBoolean(String str) {return false;}
	
	public static boolean isUtilInteger(String str) {return false;}
	
	public static boolean isUtilString(String str) {return true;}
	
	public String toString() {
		return this.str;
	}
}

