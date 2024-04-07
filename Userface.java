package day5;
import java.util.Scanner;
import java.util.ArrayList;
public class Userface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    scanner.nextLine(); // Consume newline
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    ArrayList<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : productList) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}