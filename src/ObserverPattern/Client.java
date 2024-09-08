package ObserverPattern;
import ObserverPattern.Observable.*;
import ObserverPattern.Observer.*;

public class Client {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		ObservableInterface iphoneStockObservable = new StockObservable();
		
		ObserverInterface emailObserver = new EmailObserver(iphoneStockObservable);
		ObserverInterface messageObserver = new MessageObserver(iphoneStockObservable);
		
		iphoneStockObservable.addObserver(messageObserver);
		iphoneStockObservable.addObserver(emailObserver);
		
		System.out.println("initial stock value: " + iphoneStockObservable.getValue());
		iphoneStockObservable.setValue(100);
		
	}
}
