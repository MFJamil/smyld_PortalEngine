package com.rs2.app.bw.mgui.windows;

import org.smyld.app.event.WindowListener;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.SMYLDInternalFrame;

public class HelpWindow extends SMYLDInternalFrame {

	protected HelpWindowListener windowListener; 


	public HelpWindow(HelpWindowListener activeHelpWindowListener,GUIAction incomingAction){
		applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(activeHelpWindowListener == null){
			System.out.println("Warning : HelpWindowListener is not available ");
		}
		else{
			activeHelpWindowListener.openAction(incomingAction);
		}
		windowListener = activeHelpWindowListener;
		init();
	}


	private void init(){
		setJMenuBar(PEGuiMainClass.childMenuFactory.generatemainMenuAsBar(null));
		setTitle(PEGuiMainClass.translate("windows","HelpWindow","Help Window"));
		setSize(200,100);
		if(windowListener != null){
			windowListener.activeWindowHandle(this);
		}
	}


}