public class Test{
    public static void main(String[] args) {
    System.out.println("Less than 50 condition:");
    printNumbers(new NumberCondition() {
        public boolean checkCondition(int number) {
            return number < 50;
        }
    });

    System.out.println("Even condition:");
    printNumbers(new NumberCondition() {
        public boolean checkCondition(int number) {
            return number < 50;
        }
    });
}

        // metoda drukująca liczby od 40 do 60 spełniające podany warunek
        public static void printNumbers(NumberCondition numberCondition){
            for (int i = 40; i <= 60; i++) {
                if(numberCondition.checkCondition(i)){
                    System.out.println(i);
                }
            }
        }
}

// plik NumberCondition.java
interface NumberCondition {
    boolean checkCondition(int number);
}

