public class UtilInteger extends Numeric {

	public UtilInteger() {}

	public boolean isUtilInteger(String str) {
		return categorize(str) != -1;
	}

	private int categorize(String str) {
		try {
			if (str.substring(0,1).equals("0") && !str.toLowerCase().substring(1,2).equals("x")) {
				Integer temp = Integer.parseInt(str.substring(1), 8);
				return 8;
			} else if (str.toLowerCase().substring(0,2).equals("0x")) {
				Integer temp = Integer.parseInt(str.substring(2), 16);
				return 16;
			} else {
				Integer temp = Integer.parseInt(str);
				return 10;
			}
		} catch (NumberFormatException n) {
			return -1;
		} catch (IndexOutOfBoundsException i) {
			return 10;
		} return -1;
	}

	public String print(int case) {
		return null;
	}
}

