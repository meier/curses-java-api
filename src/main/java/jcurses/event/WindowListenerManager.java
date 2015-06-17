package jcurses.event;

/**
*  This class implements a listener manager to manage <code>jcurses.event.ValueChangedEvent</code> instances and listener
* on these. Only possible type of handled events is <code>jcurses.event.ValueChangedEvent<code>,
* of managed listeners id <code>jcurses.event.ValueChangedListener</code>
*/
public class WindowListenerManager extends ListenerManager {
	
	protected void doHandleEvent(Event event, Object listener) {
		((WindowListener)listener).windowChanged((WindowEvent)event);
	}
	
	protected void verifyListener(Object listener) {
		if (!(listener instanceof WindowListener)) {
			throw new RuntimeException("illegal listener type");
		}
	}
	
	protected void verifyEvent(Event event) {
		if (!(event instanceof WindowEvent)) {
			throw new RuntimeException("illegal event type");
		}
	}

}
