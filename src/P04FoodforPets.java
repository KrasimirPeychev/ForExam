import java.util.Scanner;

public class P04FoodforPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        double totalAmountFood = Double.parseDouble(scanner.nextLine());

        double totalEatenBiscuits = 0;
        double totalEatenDogFood = 0;
        double totalEatenCatFood = 0;

        for (int d = 1 ; d <= countDays ; d++) {

            double dogFoodConsumedAtThisDay = Double.parseDouble(scanner.nextLine());
            double catFoodConsumedAtThisDay = Double.parseDouble(scanner.nextLine());

            totalEatenDogFood += dogFoodConsumedAtThisDay;
            totalEatenCatFood += catFoodConsumedAtThisDay;

            if (d == 3) {

                totalEatenBiscuits = (dogFoodConsumedAtThisDay + catFoodConsumedAtThisDay) * 0.1;

            }

        }

        double percentEatenByTheDog = (totalEatenDogFood / (totalEatenDogFood + totalEatenCatFood)) * 100;
        double percentEatenByTheCat = (totalEatenCatFood / (totalEatenDogFood + totalEatenCatFood)) * 100;
        double percentTotalFoodEaten = ((totalEatenCatFood + totalEatenDogFood) / totalAmountFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalEatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentTotalFoodEaten);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenByTheDog);
        System.out.printf("%.2f%% eaten from the cat.", percentEatenByTheCat);

    }
}

