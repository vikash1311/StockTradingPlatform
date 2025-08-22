// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.HashMap;
import java.util.Iterator;

public class Portfolio {
   private HashMap<String, Integer> holdings = new HashMap();
   private double balance;

   public Portfolio(double var1) {
      this.balance = var1;
   }

   public double getBalance() {
      return this.balance;
   }

   public void deposit(double var1) {
      this.balance += var1;
   }

   public void withdraw(double var1) {
      if (var1 <= this.balance) {
         this.balance -= var1;
      } else {
         System.out.println("❌ Insufficient funds!");
      }

   }

   public void buyStock(Stock var1, int var2) {
      double var3 = var1.getPrice() * (double)var2;
      if (var3 <= this.balance) {
         this.withdraw(var3);
         this.holdings.put(var1.getSymbol(), (Integer)this.holdings.getOrDefault(var1.getSymbol(), 0) + var2);
         System.out.println("✅ Bought " + var2 + " shares of " + var1.getSymbol());
      } else {
         System.out.println("❌ Not enough balance!");
      }

   }

   public void sellStock(Stock var1, int var2) {
      int var3 = (Integer)this.holdings.getOrDefault(var1.getSymbol(), 0);
      if (var3 >= var2) {
         this.holdings.put(var1.getSymbol(), var3 - var2);
         this.deposit(var1.getPrice() * (double)var2);
         System.out.println("✅ Sold " + var2 + " shares of " + var1.getSymbol());
      } else {
         System.out.println("❌ Not enough shares to sell!");
      }

   }

   public void viewHoldings() {
      System.out.println("\n=== Portfolio Holdings ===");
      if (this.holdings.isEmpty()) {
         System.out.println("⚠ No stocks owned.");
      } else {
         Iterator var1 = this.holdings.keySet().iterator();

         while(var1.hasNext()) {
            String var2 = (String)var1.next();
            System.out.println(var2 + " - Shares: " + String.valueOf(this.holdings.get(var2)));
         }
      }

      System.out.println("Available Balance: $" + this.balance);
   }
}
