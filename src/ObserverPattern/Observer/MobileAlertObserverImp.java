package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImp implements  NotificationAlertObserver {
    String userName;
    StockObservable observable;
    public MobileAlertObserverImp(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(userName, "Product is in stock hurry up!");
    }

    public void sendEmail(String userName, String message) {
        System.out.println("Sending email to " + userName);
        System.out.println("updated message : " + message);
    }
}
