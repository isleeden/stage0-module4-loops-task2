package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0) {
            System.out.println("too much power");
            return;
        }
        int i = 1;
        while(i < Math.pow(2, power + 1)) {
            System.out.println(i);
            i = i * 2;
        }
    }
}
