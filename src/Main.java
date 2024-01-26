import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
Welcome to my guessing game!
In this game, I will tell you what Minecraft item you are thinking of

Your options are
Pig
Sheep
Cow
Wolf
Bat
Bee
Alex
Steve
""");

        System.out.println("Is it an animal? [Y/N]");
        String animal = scanner.nextLine();

        //if animal run this
        if (animal.equalsIgnoreCase("Y")) {
            System.out.println("Does it have wings? [Y/N]");
            String wings = scanner.nextLine();

            if (wings.equalsIgnoreCase("N")) {
                System.out.println("Can it be tamed? [Y/N]");
                String tame = scanner.nextLine();

                if (tame.equalsIgnoreCase("Y")) {
                    System.out.println("It's a Wolf");
                } else {
                    System.out.println("Can it be sheared? [Y/N]");
                    String shear = scanner.nextLine();

                    if (shear.equalsIgnoreCase("Y")) {
                        System.out.println("It's a Sheep");
                    } else {
                        System.out.println("Does it like Carrots? [Y/N]");
                        String carrot = scanner.nextLine();

                        if (carrot.equalsIgnoreCase("Y")) {
                            System.out.println("It's a Pig");
                        } else {
                            System.out.println("It's a Cow");
                        }
                    }
                }
            } else {
                System.out.println("Does it collect honey? [Y/N]");
                String honey = scanner.nextLine();

                if (honey.equalsIgnoreCase("Y")) {
                    System.out.println("It's a Bee");
                } else {
                    System.out.println("It's a Bat");
                }
            }
            //if person run this
        } else {
            System.out.println("Is it a male? [Y/N]");
            String male = scanner.nextLine();

            if (male.equalsIgnoreCase("Y")) {
                System.out.println("You're thinking of Steve");
            } else {
                System.out.println("I got it, It's Alex");
            }
        }
    }
}