package com.rs2.app.bw.mgui.windows;

import org.smyld.app.event.WindowListener;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.SMYLDInternalFrame;

public class AboutWindow extends SMYLDInternalFrame {

	protected AboutWindowListener windowListener; 


	public AboutWindow(AboutWindowListener activeAboutWindowListener,GUIAction incomingAction){
		applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(activeAboutWindowListener == null){
			System.out.println("Warning : AboutWindowListener is not available ");
		}
		else{
			activeAboutWindowListener.openAction(incomingAction);
		}
		windowListener = activeAboutWindowListener;
		init();
	}


	private void init(){
		setSize(200,100);
		if(windowListener != null){
			windowListener.activeWindowHandle(this);
		}
	}


}