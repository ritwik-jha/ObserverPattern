package ObserverPattern.Observable;


import ObserverPattern.Observer.ObserverInterface;

public interface ObservableInterface {
	
	public void addObserver(ObserverInterface obs);
	
	public void removeObserver(ObserverInterface obs);
	
	public void notifyAllObservers();
	
	public void setValue(int x);
	
	public int getValue();
	
}
