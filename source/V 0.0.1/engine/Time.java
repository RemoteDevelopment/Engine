package engine;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Time {

	public static final String MINUTE = "m", HOUR = "h", SECOND = "s", MONTH = "M", DAY = "d";

	public static String getDate() {
		return LocalDate.now().toString();
	}

	public static String getDate(String format) {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(format);
		return ft.format(date);
	}

}
