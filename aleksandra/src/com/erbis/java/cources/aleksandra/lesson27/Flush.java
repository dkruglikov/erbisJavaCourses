package com.erbis.java.cources.aleksandra.lesson27;

public enum Flush {
	PIKE ("пика"), 
	CLUBS ("треф"),
	DIAMOND ("бубна"),
	HEART ("черва");
	
	private final String screenName;
	
	Flush(String screenName) {
		this.screenName = screenName;
	}
	
	String getFlush() {
		return screenName;
	}
	
	public String getScreenName() {
		return screenName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return screenName;
	}	
}

	
