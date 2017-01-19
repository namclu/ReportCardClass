package com.example.namlu.reportcardclass;

import java.util.Arrays;

/**
 * Created by namlu on 19-Jan-17.
 *
 * The ReportCard class is intended to represent a report card.
 */

public class ReportCard {

    public static final String TAG = "REPORT CARD";
    private final String SCHOOL_NAME = "Udacity University";

    private String[] schoolSubjects = new String[]{"Art", "History", "Math, Science", "Social Studies"};

    // Class constructor
    public ReportCard() {
        this.schoolSubjects = schoolSubjects;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "TAG = '" + TAG + '\'' +
                "\n SCHOOL_NAME = '" + SCHOOL_NAME + '\'' +
                "\n schoolSubjects = " + Arrays.toString(schoolSubjects) +
                '}';
    }
}
