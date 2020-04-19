package edu.miu.cs.cs472.model;

public class CourseRegister {
    private String studentId;
    private String fullName;
    private String degree;
    private String nextCourse;


    public CourseRegister(String studentId, String fullName, String degree, String nextCourse) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.degree = degree;
        this.nextCourse = nextCourse;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getNextCourse() {
        return nextCourse;
    }

    public void setNextCourse(String nextCourse) {
        this.nextCourse = nextCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", degree='" + degree + '\'' +
                ", nextCourse='" + nextCourse + '\'' +
                '}';
    }
}
