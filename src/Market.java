// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;
import java.util.Iterator;

public class Market {
   private ArrayList<Stock> stocks = new ArrayList();

   public Market() {
   }

   public void addStock(String var1, double var2) {
      this.stocks.add(new Stock(var1, var2));
   }

   public void displayMarket() {
      System.out.println("\n=== Market Data ===");
      Iterator var1 = this.stocks.iterator();

      while(var1.hasNext()) {
         Stock var2 = (Stock)var1.next();
         System.out.println(var2);
      }

   }

   public Stock getStock(String var1) {
      Iterator var2 = this.stocks.iterator();

      Stock var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (Stock)var2.next();
      } while(!var3.getSymbol().equalsIgnoreCase(var1));

      return var3;
   }
}
