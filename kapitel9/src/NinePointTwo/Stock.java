package NinePointTwo;

public class Stock {
    String symbol;
    String name;
    public Double previousClosingPrice;
    public Double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }
    /** Draw the UML diagram for the class then implement the class. Write a test pro-
     gram that creates a Stock object with the stock symbol ORCL, the name Oracle
     Corporation, and the previous closing price of 34.5. Set a new current price to
     34.35 and display the price-change percentage.*/
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println(stock.getChangePercent());
    }
}
