package price;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] arrayProduct = new Price[2];
        String myProductName;
        String myShopName;
        double myPrice;

        for (int i = 0; i < arrayProduct.length; i++) {
            System.out.println("Введіть назву " + (i + 1) + " продукту:");
            myProductName = scanner.nextLine();
            System.out.println("Введіть назву " + (i + 1) + " магазину:");
            myShopName = scanner.nextLine();
            System.out.println("Введіть ціну в гривнях " + (i + 1) + " продукту:");
            myPrice = scanner.nextDouble();
            scanner.nextLine(); // зчитування переходу на новий рядок
            arrayProduct[i] = new Price(myProductName, myShopName, myPrice);
        }
        System.out.println("Введіть назву магазину :");
        String currentShopName = scanner.nextLine();
        Price findingShopName = new Price();
        for (int i = 0; i < arrayProduct.length; i++) {
            if (currentShopName.equals(arrayProduct[i].getShopName())) findingShopName = arrayProduct[i];
        }
        if (findingShopName.getShopName() == null) {
            try {
                throw new Exception("Такого магазину не існує");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else System.out.println(findingShopName.toString());

    }
}
