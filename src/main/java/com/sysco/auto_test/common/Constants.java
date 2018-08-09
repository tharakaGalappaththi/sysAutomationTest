package com.sysco.auto_test.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
//    public static final String TEST_RELEASE = System.getProperty("test.release", "<release name>");
    public static final String TEST_RELEASE = System.getProperty("Java Based Web UI Automation", "Build_Tharaka_01");
    public static final String TEST_PROJECT = System.getProperty("test.project", "<project name>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "false"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.bundabergrum.com.au/");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");


}