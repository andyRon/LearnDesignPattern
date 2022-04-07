package com.andyron.c14.pm;

public class Client {

    public static void main(String[] args) {
        PM pm = new HRProject();
        pm.kickoff();

        pm = new APIProject();
        pm.kickoff();
    }
}
