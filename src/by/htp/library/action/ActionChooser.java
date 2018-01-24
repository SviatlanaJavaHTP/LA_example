package by.htp.library.action;

import by.htp.library.action.console.AddBookImpl;
import by.htp.library.action.console.ViewBookListImpl;

public class ActionChooser {

	public static BaseAction chooseAction(int userInput) {
		
		//PROBLEM NPE
		BaseAction action = null;

		switch (userInput) {
		case 1:	
			action = new ViewBookListImpl();
			break;
		case 2:
			action = new AddBookImpl();
			break;
		case 3:
			break;
		default:
			break;
		}
		return action;
	}

}
