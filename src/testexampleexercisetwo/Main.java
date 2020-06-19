package testexampleexercisetwo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is number 33 less than 50? " + isLessThan50(33));
        System.out.println("Is number 66 less than 50? " + isLessThan50(66));
        System.out.println("Is number 33 even number? " + isEvenNumber(33));
        System.out.println("Is number 66 even number? " + isEvenNumber(66));

    }

    public static boolean isLessThan50(int number){
        return number < 50;
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
