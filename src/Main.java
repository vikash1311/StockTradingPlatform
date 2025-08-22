import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market market = new Market();
        market.addStock("AAPL", 150);
        market.addStock("GOOG", 2800);
        market.addStock("TSLA", 700);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();
        User user = new User(name, balance);

        while (true) {
            System.out.println("\n=== Stock Trading Platform ===");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    market.displayMarket();
                    break;
                case 2:
                    market.displayMarket();
                    System.out.print("Enter stock symbol: ");
                    String buySymbol = sc.nextLine();
                    Stock buyStock = market.getStock(buySymbol);
                    if (buyStock != null) {
                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        user.getPortfolio().buyStock(buyStock, qty);
                    } else {
                        System.out.println("❌ Stock not found.");
                    }
                    break;
                case 3:
                    user.getPortfolio().viewHoldings();
                    System.out.print("Enter stock symbol: ");
                    String sellSymbol = sc.nextLine();
                    Stock sellStock = market.getStock(sellSymbol);
                    if (sellStock != null) {
                        System.out.print("Enter quantity: ");
                        int qtySell = sc.nextInt();
                        user.getPortfolio().sellStock(sellStock, qtySell);
                    } else {
                        System.out.println("❌ Stock not found.");
                    }
                    break;
                case 4:
                    user.getPortfolio().viewHoldings();
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
