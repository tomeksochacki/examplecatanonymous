package testtestexamplenext;

public class ConditionClassesTest {
    public static void main(String[] args) {

        System.out.println("Less than 50 condition?");
        printNumbers(new NumberCondition() {
            @Override
            public boolean checkCondition(int number) {
                return number < 50;
            }
        });

        //to samo co wyżej tylko przy pomocy lambdy
        System.out.println("Less then50");
        printNumbers(number -> number < 50);

        System.out.println("Even condition?");
        printNumbers(new NumberCondition() {
            @Override
            public boolean checkCondition(int number) {
                return number % 2 == 0;
            }
        });
    }

    public static void printNumbers(NumberCondition numberCondition){
        for (int i = 40; i<60; i ++){
            if (numberCondition.checkCondition(i))
            System.out.println(i);
        }
    }
}


