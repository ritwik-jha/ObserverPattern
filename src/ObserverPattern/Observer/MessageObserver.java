package ObserverPattern.Observer;

import ObserverPattern.Observable.ObservableInterface;

public class MessageObserver implements ObserverInterface {
	private ObservableInterface observable;
	
	public MessageObserver(ObservableInterface obs) {
		this.observable = obs;
	}
	
	public void update() {
		System.out.println("Message notification: " + observable.getValue());
	}

}
