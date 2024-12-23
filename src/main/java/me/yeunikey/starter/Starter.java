package me.yeunikey.starter;

import me.yeunikey.assignment.AssignmentApplication;

public class Starter {

    private static Application application;

    public static void main(String[] args) {
        application = new AssignmentApplication();
        application.onStart();
    }

    public static Application getApplication() {
        return application;
    }

}
