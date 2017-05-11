package com.erbis.java.cources.olga.lesson27;

public enum Flush {
	PIKE("Пика"), 
	CLUBS("Треф"), 
	DIAMOND("Бубна"), 
	HEART("Черва");

	private final String screenName;

	Flush(String screenName) {
		this.screenName = screenName;
	}

	public String getScreenName() {
		return screenName;
	}

	@Override
	public String toString() {
		return getScreenName();
	}

	public static Flush fromScreenName(String screenName) {
		for (Flush f : values()) {
			if (f.getScreenName().equals(screenName)) {
				return f;
			}
		}
		return null;
	}

}
