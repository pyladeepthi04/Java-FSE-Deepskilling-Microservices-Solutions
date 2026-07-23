import java.util.ArrayList;
import java.util.List;

public class Stock {

    private String stockName;
    private double price;

    private List<Observer> observers = new ArrayList<>();

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(stockName, price);
        }

    }

}