package Day3;

public class Store{
    private static int totalShopsOpen = 0;
    private int money;
    private int stock;
    private static int maxItemsBought = 0;

    public Store(int startingBalance, int startingStock){
        this.money = startingBalance;
        stock = startingStock;
        totalShopsOpen++;
    }

    public int getBalance(){
        return money;
    }

    public static int getTotalStores(){
        return totalShopsOpen;
    }
    public static int getMaxItemBought(){
        return maxItemsBought;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int newStock){
        stock = newStock;
    }

    public boolean transferStockTo(Store store, int transferAmt){
        if(getStock()>=transferAmt){
            setStock(money - transferAmt);
            store.setStock(transferAmt + store.getStock());
            if(stock == 0){
                totalShopsOpen--;
            }
            return true;
        } 
        return false;
    }


    public void customerApproaches(){
        int chanceToFinish = 0;
        int totalItemsBought = 0;
        int totalCost = 0;
        while((int)(Math.random() * 100) + 1 >= chanceToFinish){
            totalItemsBought++;
            totalCost += (int) (Math.random() * 10) + 1;
            chanceToFinish += (int) (Math.random() * 21) - 10;
            if(chanceToFinish<0){
                chanceToFinish = 0;
            }
            if(totalItemsBought>maxItemsBought){
                maxItemsBought = totalItemsBought;
            }
            if(totalItemsBought >= stock){
                break;
            }
        }
        stock -= totalItemsBought;
        money += totalCost;
    }

}