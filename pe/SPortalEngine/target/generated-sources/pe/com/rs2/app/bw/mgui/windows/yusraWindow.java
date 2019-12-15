package com.rs2.app.bw.mgui.windows;

import org.smyld.app.event.WindowListener;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.SMYLDInternalFrame;

public class yusraWindow extends SMYLDInternalFrame {

	protected yusraWindowListener windowListener; 


	public yusraWindow(yusraWindowListener activeyusraWindowListener,GUIAction incomingAction){
		applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(activeyusraWindowListener == null){
			System.out.println("Warning : yusraWindowListener is not available ");
		}
		else{
			activeyusraWindowListener.openAction(incomingAction);
		}
		windowListener = activeyusraWindowListener;
		init();
	}


	private void init(){
		setTitle(PEGuiMainClass.translate("windows","yusraWindow","Hello there can you see me ?"));
		setSize(500,300);
		if(windowListener != null){
			windowListener.activeWindowHandle(this);
		}
	}


}