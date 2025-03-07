package com.github.curriculeon;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private List<Double> testScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = Arrays.asList(testScores);

    }

    public Student() {
        this.testScores = Arrays.asList(null);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScores() {
        return testScores.toArray(new Double[0]);
    }

    public void addExamScore(double examScore) {
        testScores.add(examScore);
    }


    public void setExamScore(int examNum, double updateScore) {
        testScores.set(examNum,updateScore);
    }


    public Double getAverageExamScore() {
        double x = 0;
        for(double i : testScores) x += i;
        return x / testScores.size();
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {

    }
}

