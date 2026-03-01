package lab1.Problem1;

// import java.util.Scanner;

public class Data {
    // private int num;
    private int count;
    private double sum;
    private double max;
    

    public Data() {
        this.sum = 0;
        this.count = 0;
        this.max = Double.NEGATIVE_INFINITY;
    }

    public void add(double value) {
        this.sum += value;
        this.count++;

        if (value > this.max) {
            this.max = value;
        }
    }

    
    public double getAverage() {
        if (this.count == 0) {
            return 0;
        }
        return this.sum / this.count;
    }

    public double getMax() {
        if (this.count == 0) {
            return 0;
        }
        return this.max;
    }
}

