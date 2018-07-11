package com.lw.guava.demo.vo;

import java.util.Objects;

public class ScoreRecord {
    private String name;
    private String scode;
    private String testDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreRecord that = (ScoreRecord) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(scode, that.scode) &&
                Objects.equals(testDate, that.testDate);
    }

    @Override
    public String toString() {
        return "ScoreRecord{" +
                "name='" + name + '\'' +
                ", scode='" + scode + '\'' +
                ", testDate='" + testDate + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, scode, testDate);
    }

    public ScoreRecord(String name, String scode, String testDate) {

        this.name = name;
        this.scode = scode;
        this.testDate = testDate;
    }

    public ScoreRecord() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }
}
