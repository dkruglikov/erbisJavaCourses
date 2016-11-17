
package com.erbis.java.courses.max;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MySecondApp {

    public static void main(String[] args) {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = formatter.format(new Date());
        System.out.println(s);
    }
}