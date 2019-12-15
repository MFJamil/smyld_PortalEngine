package org.smyld.app.pe.active;

import com.rs2.app.bw.mgui.panels.WindowPanelListener;
import com.rs2.app.bw.mgui.windows.AboutWindowListener;
import com.rs2.app.bw.mgui.windows.HelpWindowListener;
import com.rs2.app.bw.mgui.windows.MdiWindowListener;
import com.rs2.app.bw.mgui.windows.OpenFileWindowListener;
import com.rs2.app.bw.mgui.windows.yusraWindowListener;
import org.smyld.app.AppManager;

public interface ApplicationManager extends AppManager {


	public abstract MdiWindowListener getMdiWindowListener();
	public abstract AboutWindowListener getAboutWindowListener();
	public abstract yusraWindowListener getyusraWindowListener();
	public abstract OpenFileWindowListener getOpenFileWindowListener();
	public abstract WindowPanelListener getWindowPanelListener();
	public abstract HelpWindowListener getHelpWindowListener();
	public abstract void applicationExit();

}