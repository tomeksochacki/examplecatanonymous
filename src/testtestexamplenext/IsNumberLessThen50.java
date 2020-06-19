package testtestexamplenext;

public class IsNumberLessThen50 implements NumberCondition{
    @Override
    public boolean checkCondition(int number) {
        return number < 50;
    }
}
