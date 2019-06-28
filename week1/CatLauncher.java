public class CatLauncher {
    public static void main(String[] args) {
        Cat vance;
        vance = new Cat(15);
        vance.makeNoise();

        Cat[] cats = new Cat[2];
        cats[0] = vance;
        cats[1] = new Cat(8);
        cats[1].makeNoise();

        Cat bigCat = Cat.maxCat(cats[0], cats[1]);
        bigCat.makeNoise();

        System.out.println(args[0]);
    }
}