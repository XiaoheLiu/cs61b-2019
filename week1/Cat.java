public class Cat {
    public int weight;

    // Static Variables
    public static String family = "Felidae";

    // Constructor
    public Cat(int w) {
        weight = w;
    }

    // Instance Method
    // (called by vance.makeNoise())
    public void makeNoise() {
        if (weight < 10) {
            System.out.println("Mimimi!");
        } else {
            System.out.println("Meow!");
        }
    }

    // Class Method
    // (called by Cat.maxCat())
    public static Cat maxCat(Cat c1, Cat c2) {
        if (c1.weight > c2.weight) {
            return c1;
        }
        return c2;
    }
}