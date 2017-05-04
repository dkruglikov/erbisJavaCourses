package com.erbis.java.cources.aleksandra.lesson27;

import java.time.chrono.ThaiBuddhistEra;

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

	public static String fromScreenName(String screenName) {		
		for(Flush entity: Flush.values()) {
			if(entity.getScreenName().equals(screenName)) {
			return entity.name();
		}
		}
		return null;
	}
}

	
