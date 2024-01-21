public class TestStock {
       public static void main(String[] args) {
           stock stock1 = new stock("ORLC", "Oracle", 34.5, 34.35);
           System.out.println("Stock symbol " + stock1.symbol + " stock name"
                   + " " + stock1.name + " with previous closing price"
                           + " " + stock1.previousClosingPrice
                                + " and current price"
                                   + " " + stock1.currentPrice + " has price"
                                           + " change "
                                                + stock1.getChangePercent());
       }
}

class stock {
    String symbol;
    String name;
    double previousClosingPrice = 1;
    double currentPrice = 1;
    stock() {
    }
    stock(String a, String b, double previousPrice,
            double price) {
        symbol = a;
        name = b;
        previousClosingPrice = previousPrice;
        currentPrice = price;
    }
    double getChangePercent() {
        return currentPrice / previousClosingPrice;
    }
    void setInfo(String newSymbol, String newName, double newPrice){
        symbol = newSymbol;
        name = newName;
        currentPrice = newPrice;
    }
}
