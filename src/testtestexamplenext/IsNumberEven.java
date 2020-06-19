package testtestexamplenext;

public class IsNumberEven implements NumberCondition {
    @Override
    public boolean checkCondition(int number) {
        return number % 2 == 0;
    }
}
