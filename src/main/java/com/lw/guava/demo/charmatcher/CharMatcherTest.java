package com.lw.guava.demo.charmatcher;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {

    public static void main(String[] args) {
        // only the digits
        System.out.println(CharMatcher.DIGIT.retainFrom("mahesh123"));
        System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Mahesh     Parashar ", ' '));
        // trim whitespace at ends, and replace/collapse whitespace into single spaces
        // star out all digits
        System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("mahesh123", "*"));
        System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("Mahesh123"));
        // eliminate all characters that aren't digits or lowercase
        System.out.println(CharMatcher.inRange('a','z').retainFrom("dsfsdfsd455g"));

        System.out.println(CharMatcher.JAVA_DIGIT.retainFrom("jhf342skjdfskdjhj211"));
        System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("jhf342skjdfskdjhj211","*"));
        System.out.println(CharMatcher.JAVA_DIGIT.countIn("jhf342skjdfskdjhj211"));
    }
}
