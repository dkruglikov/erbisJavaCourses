package com.erbis.java.courses.document;

public enum Type {
    MATHEMATICS("Mathematics"), 
    OTHERS("Others"),
    PHILOSOPHY("Philosophy"), 
    SPORT("Sport");
    
    private final String readableName;
    

    Type(String readableName) {
        this.readableName = readableName;
    }

    public String getReadableName() {
        return readableName;
    }
    

}
