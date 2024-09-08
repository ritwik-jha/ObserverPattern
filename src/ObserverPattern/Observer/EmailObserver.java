package ObserverPattern.Observer;

import ObserverPattern.Observable.ObservableInterface;

public class EmailObserver implements ObserverInterface {
	public ObservableInterface observable;
	
	public EmailObserver(ObservableInterface observable) {
		this.observable = observable;
	}
	
	public void update() {
		System.out.println("Email notification: " + observable.getValue());
	}

}
