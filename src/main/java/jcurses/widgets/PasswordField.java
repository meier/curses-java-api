package jcurses.widgets;

import jcurses.system.CharColor;
import jcurses.system.Toolkit;
import jcurses.util.Rectangle;

/**
 * Title:        JCurses
 * Description:
 * @author Dawie Malan
 * @author Alexei Chmelev
 */
public class PasswordField extends TextField
{

	public PasswordField()
	{
		super();
	}

	public PasswordField(int width, String text)
	{
		super(width,text);
	}

	/**
	*  The constructor
	*
	* @param width the preferred width, if -1, there is no preferred size.
	*/
	public  PasswordField(int width)
	{
		super(width);
	}

	/** Override method in TextComponent to display '*' instead of actual
	 *  character values.
	 */
	protected String replaceTextLineForPrinting(String line) {
	    int length = line.length();
		StringBuffer buf = new StringBuffer(length);
		for (int i=0; i<length; i++) {
			buf.append('*');
		}
		return buf.toString();
	}
}