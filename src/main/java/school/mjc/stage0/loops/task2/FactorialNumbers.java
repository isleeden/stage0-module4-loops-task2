package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int result = 1;
        while (i <= printToInclusive) {
            if (i == 0) {
                result = 1 * result;
            } else {
                result = i * result;
            }
            System.out.println(result);
            i++;
        }
    }
}
