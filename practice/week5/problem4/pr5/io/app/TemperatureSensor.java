// How to run:
// cd practice/week5/problem4
// javac pr5/io/app/TemperatureSensor.java
// java pr5.io.app.TemperatureSensor
// (make sure sensor.txt is in the problem4 directory — used to read initial values)

package pr5.io.app;

import java.io.*;

public class TemperatureSensor {
    private static final String BIN_FILE = "sensor.bin";
    private static final String TXT_FILE = "sensor.txt";
    private static final int RECORD_COUNT = 60;

    public static void main(String[] args) throws IOException {
        double[] temperatures = readFromTextFile();

        writeToBinary(temperatures);
        System.out.println("Written " + RECORD_COUNT + " temperature values to " + BIN_FILE);

        patchRecord(29, 999.9);
        System.out.println("Patched record #30 (index 29) with value 999.9");

        double[] data = readFromBinary();
        double sum = 0;
        double max = Double.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
        }

        double average = sum / data.length;
        System.out.println("\n--- Results ---");
        System.out.printf("Average temperature: %.2f °C%n", average);
        System.out.printf("Max temperature: %.2f °C (at index %d)%n", max, maxIndex);
        System.out.println("Spike confirmed at index 29: " + (data[29] == 999.9 ? "YES" : "NO"));
    }

    private static double[] readFromTextFile() throws IOException {
        double[] temps = new double[RECORD_COUNT];
        try (BufferedReader reader = new BufferedReader(new FileReader(TXT_FILE))) {
            for (int i = 0; i < RECORD_COUNT; i++) {
                temps[i] = Double.parseDouble(reader.readLine().trim());
            }
        }
        return temps;
    }

    private static void writeToBinary(double[] temperatures) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(BIN_FILE))) {
            for (double temp : temperatures) {
                dos.writeDouble(temp);
            }
        }
    }

    private static void patchRecord(int index, double value) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(BIN_FILE, "rw")) {
            raf.seek((long) index * 8);
            raf.writeDouble(value);
        }
    }

    private static double[] readFromBinary() throws IOException {
        double[] data = new double[RECORD_COUNT];
        try (DataInputStream dis = new DataInputStream(new FileInputStream(BIN_FILE))) {
            for (int i = 0; i < RECORD_COUNT; i++) {
                data[i] = dis.readDouble();
            }
        }
        return data;
    }
}
