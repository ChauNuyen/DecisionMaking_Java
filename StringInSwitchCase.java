package greatExercises;

public class StringInSwitchCase {
	/**
	 * This methods is used for identified statement by the enter string.
	 * <i><b> Author: Ngo Thi Thuy</i>
	 * @param str - input String to compared to each case.
	 * @return value - output string.
	 */
	public static String getExpendedMessage(String str) {
		String value = null;
		switch (str) {
		case "one":
			value = "token one identified!";
			break;
		case "two":
			value = "token two identified!";
			break;
		case "three":
			value = "token three identified!";
			break;
		default:
			value = "No token was identified!";
			break;
		}
		return value;
	}
}
