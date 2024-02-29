package com.pojo;

public class Announcement {
    private String name;
    private String date;
    private String content;

    public Announcement() {
    }

    public Announcement(String name, String date, String content) {
        this.name = name;
        this.date = date;
        this.content = content;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "announcement{name = " + name + ", date = " + date + ", content = " + content + "}";
    }
}
