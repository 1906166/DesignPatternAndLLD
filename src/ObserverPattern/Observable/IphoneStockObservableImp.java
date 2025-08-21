package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImp implements StockObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }

        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        System.out.println("Current stock count is " + stockCount);
        return  stockCount;
    }
}
