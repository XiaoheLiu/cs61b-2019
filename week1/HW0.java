public class HW0 {
    public static void main(String[] args) {

        // Conditionals
        int x = 10;
        if (x < 10) {
            System.out.println("x is smaller than 10");
        } else if (x > 10) {
            System.out.println("x is big!");
        } else
            System.out.println("x is 10.");

        // While Loop
        while (x > 0) {
            System.out.println(x);
            x -= 2;
        }

        // Doubles and Strings
        String a = "diameter";
        double d = 0.00065;
        System.out.println(a + " is " + d);

        // Call a function
        System.out.println(max(29, 10));

        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 10;
        int[] numbers2 = new int[] { 4, 7, 10 };
        System.out.println(numbers2[1]);

        // For loops
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Enhanced For loop
        String[] pets = { "cat", "dog", "horse" };

        for (String s : pets) { // like python "for s in pets"
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("dog")) {
                    break;
                }
            }
        }
        // Break: completely terminates the innermost loop

        // Continue: skips the current iteration of the loop, effectively jumping
        // straight to the increment condition.
        for (int i = 0; i < pets.length; i += 1) {
            if (pets[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(pets[i]);
            }
        }
    }

    // Defining Functions/Methods
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
}