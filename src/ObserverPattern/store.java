package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservableImp;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImp;
import ObserverPattern.Observer.MobileAlertObserverImp;
import ObserverPattern.Observer.NotificationAlertObserver;

public class store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservableImp();
        NotificationAlertObserver observer1 = new EmailAlertObserverImp("skpatil@amazon.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImp("zpatsaur@amazon.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImp("Saurabh", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(20);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(-30);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(5);
        iphoneStockObservable.getStockCount();
    }
}
