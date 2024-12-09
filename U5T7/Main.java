import Day3.Clinic;
import Day3.Person;
import Day3.Store;
import Day3.Words;

public class Main {
    public static void main(String[] args) {
        Store store1 = new Store(0, 100);
        Store store2 = new Store(0, 1000);
        System.out.println("Two new stores:\n1. Money Earned: " + store1.getBalance() + ", stock: " + store1.getStock() +"\n2. Money Earned: " + store2.getBalance() + ", stock: " + store2.getStock());
        System.out.println("Customer approaches store 1!");
        store1.customerApproaches();
        System.out.println("Store 1 earned $" + store1.getBalance() + " and the stock reduced to " + store1.getStock());
        System.out.println("Five customers approach store 2!");
        store2.customerApproaches();
        store2.customerApproaches();
        store2.customerApproaches();
        store2.customerApproaches();
        store2.customerApproaches();
        System.out.println("Store 2 earned $" + store2.getBalance() + " and the stock reduced to " + store2.getStock());
        System.out.println("Store 1. Money Earned: $" + store1.getBalance() + ", stock: " + store1.getStock() +"\nStore 2. Money Earned: $" + store2.getBalance() + ", stock: " + store2.getStock());
    
        store1.customerApproaches();
        store1.customerApproaches();
        store1.customerApproaches();
        store1.customerApproaches();
        System.out.println("More customers");
        System.out.println("Store 1. Money Earned: $" + store1.getBalance() + ", stock: " + store1.getStock() +"\nStore 2. Money Earned: $" + store2.getBalance() + ", stock: " + store2.getStock());
        System.out.println("");
        System.out.println("Max purchase: " + Store.getMaxItemBought());
    }
   }
   
   
   