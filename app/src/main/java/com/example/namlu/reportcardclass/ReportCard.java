package com.example.namlu.reportcardclass;

/**
 * Created by namlu on 19-Jan-17.
 *
 * The ReportCard class is intended to represent a report card.
 */

public class ReportCard {

    public static final String TAG = "REPORT CARD";
    private final String SCHOOL_NAME = "Udacity University";

    // Array of school subjects
    private String[] schoolSubjects = new String[]{"Art", "History", "Math", "Science"};

    // Instance variables
    private String mStudentName;

    // Grades are values between 0 - 100
    private int mGradeArt;
    private int mGradeHistory;
    private int mGradeMath;
    private int mGradeScience;

    // Class constructor
    public ReportCard(
            String studentName,
            int gradeArt,
            int gradeHistory,
            int gradeMath,
            int gradeScience) {
        setStudentName(studentName);
        setGradeArt(gradeArt);
        setGradeHistory(gradeHistory);
        setGradeMath(gradeMath);
        setGradeScience(gradeScience);
    }

    @Override
    public String toString() {

        return "ReportCard{" +
                "\n TAG = '" + TAG + '\'' +
                "\n SCHOOL_NAME = '" + SCHOOL_NAME + '\'' +
                "\n mStudentName = " + getStudentName() +
                "\n" + schoolSubjects[0] + " = " + getGradeArt() +
                "\n" + schoolSubjects[1] + " = " + getGradeHistory() +
                "\n" + schoolSubjects[2] + " = " + getGradeMath() +
                "\n" + schoolSubjects[3] + " = " + getGradeScience() +
                '}';
    }

    /*
     * Getter and setter methods for ReportCard
     */

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        if (studentName != null) {
            mStudentName = studentName;
        } else
            mStudentName = "No name given";
    }

    public int getGradeArt() {
        return mGradeArt;
    }

    public void setGradeArt(int gradeArt) {
        if (gradeArt >= 0 && gradeArt <=100) {
            mGradeArt = gradeArt;
        }else
            mGradeArt = 0;
    }

    public int getGradeHistory() {
        return mGradeHistory;
    }

    public void setGradeHistory(int gradeHistory) {
        if (gradeHistory >= 0 && gradeHistory <=100) {
            mGradeHistory = gradeHistory;
        } else
            mGradeHistory = 0;
    }

    public int getGradeMath() {
        return mGradeMath;
    }

    public void setGradeMath(int gradeMath) {
        if (gradeMath >= 0 && gradeMath <=100) {
            mGradeMath = gradeMath;
        } else
            mGradeMath = 0;
    }

    public int getGradeScience() {
        return mGradeScience;
    }

    public void setGradeScience(int gradeScience) {
        if (gradeScience >= 0 && gradeScience <=100) {
            mGradeScience = gradeScience;
        } else
            mGradeScience = 0;
    }
}
