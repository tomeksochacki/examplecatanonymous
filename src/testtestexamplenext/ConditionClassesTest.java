package testtestexamplenext;

public class ConditionClassesTest {
    public static void main(String[] args) {

        System.out.println("Less than 50 condition?");
        printNumbers(new IsNumberLessThen50());

        System.out.println("Even condition?");
        printNumbers(new IsNumberEven());
    }

    public static void printNumbers(NumberCondition numberCondition){
        for (int i = 40; i<60; i ++){
            if (numberCondition.checkCondition(i))
            System.out.println(i);
        }
    }
}


