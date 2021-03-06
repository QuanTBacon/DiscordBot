package io.github.lxgaming.discordmusicbot.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
	
	public static String getDateTime() {
		return getDate() + " " + getTime();
	}
	
	public static String getDate() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(cal.getTime());
	}
	
	public static String getTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return sdf.format(cal.getTime());
	}
}