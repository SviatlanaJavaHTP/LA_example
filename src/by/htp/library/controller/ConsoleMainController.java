package by.htp.library.controller;

import by.htp.library.action.ActionChooser;
import by.htp.library.action.BaseAction;

public class ConsoleMainController {
	
	private static final int USER_INPUT = 1;

	public static void main(String[] args) {
	
		BaseAction action = ActionChooser.chooseAction(USER_INPUT);
		action.doSmth();

	}

}
