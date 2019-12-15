package com.rs2.app.bw.mgui.windows;

import com.rs2.app.bw.mgui.panels.WindowPanel;
import org.smyld.app.event.WindowListener;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.SMYLDInternalFrame;

public class OpenFileWindow extends SMYLDInternalFrame {

	public    WindowPanel            acctPanel;      
	protected OpenFileWindowListener windowListener; 


	public OpenFileWindow(OpenFileWindowListener activeOpenFileWindowListener,GUIAction incomingAction){
		applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(activeOpenFileWindowListener == null){
			System.out.println("Warning : OpenFileWindowListener is not available ");
		}
		else{
			activeOpenFileWindowListener.openAction(incomingAction);
		}
		windowListener = activeOpenFileWindowListener;
		init();
	}


	private void init(){
		setJMenuBar(PEGuiMainClass.childMenuFactory.generateacctMenuAsBar(windowListener));
		setTitle(PEGuiMainClass.translate("windows","OpenFileWindow","Testing Panel"));
		setIcon(PEGuiMainClass.getImage("closefile.gif"));
		setSize(600,450);
		acctPanel          = new WindowPanel(windowListener);
		acctPanel.init();
		addComponent("acctPanel",acctPanel.getMainComponent());
		acctPanel.applyComponentOrientation(PEGuiMainClass.getOrientation());
		if(windowListener != null){
			windowListener.activeWindowHandle(this);
		}
	}


}