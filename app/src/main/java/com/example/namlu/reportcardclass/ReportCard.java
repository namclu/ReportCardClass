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
    private String studentName;

    // Grades are values between 0 - 100
    private int gradeArt;
    private int gradeHistory;
    private int gradeMath;
    private int gradeScience;

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
                "\n studentName = " + getStudentName() +
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
        return studentName;
    }

    public void setStudentName(String studentName) {
        if (studentName != null) {
            this.studentName = studentName;
        } else
            studentName = "No name given";
    }

    public int getGradeArt() {
        return gradeArt;
    }

    public void setGradeArt(int gradeArt) {
        if (gradeArt >= 0 && gradeArt <=100) {
            this.gradeArt = gradeArt;
        }else
            gradeArt = 0;
    }

    public int getGradeHistory() {
        return gradeHistory;
    }

    public void setGradeHistory(int gradeHistory) {
        if (gradeHistory >= 0 && gradeHistory <=100) {
            this.gradeHistory = gradeHistory;
        } else
            gradeHistory = 0;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        if (gradeMath >= 0 && gradeMath <=100) {
            this.gradeMath = gradeMath;
        } else
            gradeMath = 0;
    }

    public int getGradeScience() {
        return gradeScience;
    }

    public void setGradeScience(int gradeScience) {
        if (gradeScience >= 0 && gradeScience <=100) {
            this.gradeScience = gradeScience;
        } else
            gradeScience = 0;
    }
}
