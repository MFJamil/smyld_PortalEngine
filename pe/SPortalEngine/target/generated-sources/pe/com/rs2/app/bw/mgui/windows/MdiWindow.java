package com.rs2.app.bw.mgui.windows;

import org.smyld.app.event.WindowListener;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.SMYLDMDI;

public class MdiWindow extends SMYLDMDI {

	protected MdiWindowListener windowListener; 


	public MdiWindow(MdiWindowListener activeMdiWindowListener,GUIAction incomingAction){
		applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(activeMdiWindowListener == null){
			System.out.println("Warning : MdiWindowListener is not available ");
		}
		else{
			activeMdiWindowListener.openAction(incomingAction);
		}
		windowListener = activeMdiWindowListener;
		init();
	}


	private void init(){
		if(windowListener != null){
			windowListener.init();
		}
		setJMenuBar(PEGuiMainClass.childMenuFactory.generatemainMenuAsBar(null));
		setTitle(PEGuiMainClass.translate("windows","MdiWindow","Accountancy"));
		setIcon(PEGuiMainClass.getImage("logo.gif"));
		setSize(600,400);
		centerWindowInScreen();
		if(windowListener != null){
			windowListener.activeWindowHandle(this);
		}
	}


}