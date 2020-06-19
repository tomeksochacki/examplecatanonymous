package newexampleexerciseclassanonymous;

public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meooow!!");
            }
        };
        animal.speak();
    }

}
