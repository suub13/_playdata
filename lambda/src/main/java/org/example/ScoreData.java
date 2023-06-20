package org.example;

public class ScoreData {
    String name = "";
    int kor = 0;
    int eng = 0;
    int mat = 0;
    int total;
    float avg;

    public ScoreData(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public ScoreData(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %.2f", name, kor, eng, mat, total, avg);
    }

    public void process() {
        this.total = this.kor + this.eng + this.mat;
        this.avg = this.total/3.0f;
    }

}
