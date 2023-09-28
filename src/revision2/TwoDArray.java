package revision2;

public class TwoDArray {
    public static void main(String[] args) {
        double payScale[][] = { { 10.50, 12.0, 14.50, 16.75, 18.00 },
                { 20.50, 22.25, 24.00, 26.25, 28.00 },
                { 34.00, 36.50, 38.00, 40.35, 43.00 },
                { 50.00, 60.00, 70.00, 80.00, 99.99 } };

        double avgG[] = new double[4];

        for (int row = 0; row < payScale.length; row++) {
            for (int col = 0; col < payScale[row].length; col++) {
                avgG[row] +=payScale[row][col];
            }

            avgG[row] = avgG[row] / payScale[row].length;

        }


        for (int i = 0; i < avgG.length; i++) {
            System.out.println("Avg Grade "+(i+1)+" = "+avgG[i]);
        }


        // For Col

        double avgC[] = new double[4];

        for (int row = 0; row < payScale.length; row++) {
            for (int col = 0; col < payScale[row].length; col++) {
                avgC[row] +=payScale[row][col];
            }

            avgC[row] = avgC[row] / payScale[row].length;

        }


        for (int i = 0; i < avgC.length; i++) {
            System.out.println("Avg Step "+(i+1)+" = "+avgC[i]);
        }
    }
}
