package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.ObserverInterface;

public class StockObservable implements ObservableInterface {
	List<ObserverInterface> observerList;
	int stockValue;
	
	public StockObservable() {
		observerList = new ArrayList<>();
		stockValue = 0;
	}
	
	@Override
	public void addObserver(ObserverInterface obs) {
		observerList.add(obs);
	}
	
	@Override
	public void removeObserver(ObserverInterface obs) {
		observerList.remove(obs);
	}
	
	@Override
	public void notifyAllObservers() {
		for(ObserverInterface observer : observerList) {
			observer.update();
		}
	}
	
	@Override
	public void setValue(int x) {
		if(stockValue == 0) {
			stockValue = x;
			notifyAllObservers();
		}
		else {
			stockValue = x;
		}
	}
	
	@Override
	public int getValue() {
		return stockValue;
	}

}
