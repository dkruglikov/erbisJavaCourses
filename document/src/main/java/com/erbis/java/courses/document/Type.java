package com.erbis.java.courses.document;

public enum Type {
	MATHEMATICS ("Математика"), 
	PHILOSOPHY ("Філософія"),
	SPORT ("Спорт"),
	OTHERS ("Інше");

	private final String readableName;
	
	Type(String readableName) {
		this.readableName = readableName;
	}

	public String getReadableName() {
		return readableName;
	}

	@Override
	public String toString() {
		return getReadableName();
	}
	
}
