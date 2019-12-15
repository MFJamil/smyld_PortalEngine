package org.smyld.app.pe.active;

import com.rs2.app.bw.mgui.windows.AboutWindow;
import com.rs2.app.bw.mgui.windows.AboutWindowListener;
import com.rs2.app.bw.mgui.windows.HelpWindow;
import com.rs2.app.bw.mgui.windows.HelpWindowListener;
import com.rs2.app.bw.mgui.windows.MdiWindow;
import com.rs2.app.bw.mgui.windows.MdiWindowListener;
import com.rs2.app.bw.mgui.windows.OpenFileWindow;
import com.rs2.app.bw.mgui.windows.OpenFileWindowListener;
import com.rs2.app.bw.mgui.windows.yusraWindow;
import com.rs2.app.bw.mgui.windows.yusraWindowListener;
import java.awt.Window;
import org.smyld.app.AppWindowsFactory;
import org.smyld.app.event.WindowListener;
import org.smyld.gui.GUIAction;

public class WindowsFactory extends AppWindowsFactory {


	public void openWindow(String windowName,ApplicationManager appManager,GUIAction incomingAction){
		if (windowName.equals("HelpWindow")){
			HelpWindow HelpWindowInstance = null ;
			if (appManager!=null){
				HelpWindowInstance                    = new HelpWindow    (appManager.getHelpWindowListener(),incomingAction);
			}
			else{
				HelpWindowInstance                    = new HelpWindow    (null,incomingAction);
			}
			addWindow("HelpWindow",HelpWindowInstance);
			activeMDIWindow.addInternalFrame(HelpWindowInstance);
		}
		if (windowName.equals("MdiWindow")){
			MdiWindow MdiWindowInstance = null ;
			if (appManager!=null){
				MdiWindowInstance                     = new MdiWindow     (appManager.getMdiWindowListener(),incomingAction);
			}
			else{
				MdiWindowInstance                     = new MdiWindow     (null,incomingAction);
			}
			addWindow("MdiWindow",MdiWindowInstance);
			activeMDIWindow=MdiWindowInstance;
			MdiWindowInstance.setVisible(true);
		}
		if (windowName.equals("AboutWindow")){
			AboutWindow AboutWindowInstance = null ;
			if (appManager!=null){
				AboutWindowInstance                   = new AboutWindow   (appManager.getAboutWindowListener(),incomingAction);
			}
			else{
				AboutWindowInstance                   = new AboutWindow   (null,incomingAction);
			}
			addWindow("AboutWindow",AboutWindowInstance);
			activeMDIWindow.addInternalFrame(AboutWindowInstance);
		}
		if (windowName.equals("OpenFileWindow")){
			OpenFileWindow OpenFileWindowInstance = null ;
			if (appManager!=null){
				OpenFileWindowInstance                = new OpenFileWindow(appManager.getOpenFileWindowListener(),incomingAction);
			}
			else{
				OpenFileWindowInstance                = new OpenFileWindow(null,incomingAction);
			}
			addWindow("OpenFileWindow",OpenFileWindowInstance);
			activeMDIWindow.addInternalFrame(OpenFileWindowInstance);
		}
		if (windowName.equals("yusraWindow")){
			yusraWindow yusraWindowInstance = null ;
			if (appManager!=null){
				yusraWindowInstance                   = new yusraWindow   (appManager.getyusraWindowListener(),incomingAction);
			}
			else{
				yusraWindowInstance                   = new yusraWindow   (null,incomingAction);
			}
			addWindow("yusraWindow",yusraWindowInstance);
			activeMDIWindow.addInternalFrame(yusraWindowInstance);
		}
	}

	public HelpWindow openHelpWindowWindow(HelpWindowListener listener,Window owner){
		HelpWindow HelpWindowInstance = null ;
		HelpWindowInstance            = new HelpWindow(listener,null);
		addWindow("HelpWindow",HelpWindowInstance);
		activeMDIWindow.addInternalFrame(HelpWindowInstance);
		return HelpWindowInstance;
	}

	public MdiWindow openMdiWindowWindow(MdiWindowListener listener,Window owner){
		MdiWindow MdiWindowInstance = null ;
		MdiWindowInstance           = new MdiWindow(listener,null);
		addWindow("MdiWindow",MdiWindowInstance);
		activeMDIWindow=MdiWindowInstance;
		MdiWindowInstance.setVisible(true);
		return MdiWindowInstance;
	}

	public AboutWindow openAboutWindowWindow(AboutWindowListener listener,Window owner){
		AboutWindow AboutWindowInstance = null ;
		AboutWindowInstance             = new AboutWindow(listener,null);
		addWindow("AboutWindow",AboutWindowInstance);
		activeMDIWindow.addInternalFrame(AboutWindowInstance);
		return AboutWindowInstance;
	}

	public OpenFileWindow openOpenFileWindowWindow(OpenFileWindowListener listener,Window owner){
		OpenFileWindow OpenFileWindowInstance = null ;
		OpenFileWindowInstance                = new OpenFileWindow(listener,null);
		addWindow("OpenFileWindow",OpenFileWindowInstance);
		activeMDIWindow.addInternalFrame(OpenFileWindowInstance);
		return OpenFileWindowInstance;
	}

	public yusraWindow openyusraWindowWindow(yusraWindowListener listener,Window owner){
		yusraWindow yusraWindowInstance = null ;
		yusraWindowInstance             = new yusraWindow(listener,null);
		addWindow("yusraWindow",yusraWindowInstance);
		activeMDIWindow.addInternalFrame(yusraWindowInstance);
		return yusraWindowInstance;
	}


}