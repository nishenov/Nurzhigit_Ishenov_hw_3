import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] randomArray = randomMassive();
        double sumOfDigits = 0;
        int countOfDigits = 0;
        boolean foundNegative = false;

        for (double digit : randomArray) {
            if (digit < 0) {
                foundNegative = true;
                continue;
            }
            if (foundNegative) {
                sumOfDigits += digit;
                countOfDigits++;
            }
        }

        double averageOfDigits = 0;
        if (countOfDigits > 0) {
            averageOfDigits = sumOfDigits / countOfDigits;
        }

        System.out.println("Ответ для массива " + Arrays.toString(randomArray) + " будет " + averageOfDigits);
    }

    public static double[] randomMassive() {
        double[] massive = new double[15];
        Random random = new Random();
        massive[0] = Math.round(random.nextDouble() * 100 * 10) / 10;
        massive[1] = Math.round(random.nextDouble() * 100 * 10) / 10;

        for (int i = 2; i < massive.length; i++) {
            massive[i] = Math.round((random.nextDouble() * 200 - 100) * 10) / 10;
        }
        return massive;
    }
}