package org.smyld.app.pe.active;

import com.rs2.app.bw.mgui.panels.WindowPanel;
import org.smyld.app.AppManager;
import org.smyld.app.AppPanelFactory;
import org.smyld.gui.SMYLDPanel;

public class PanelsFactory extends AppPanelFactory {


	public SMYLDPanel getPanel(String targetPanel,Object manager){
		ApplicationManager appManager = (ApplicationManager)manager;
		if (targetPanel.equals("WindowPanel")){
			WindowPanel itemWindowPanel = null;
			if(appManager!=null){
				itemWindowPanel               = new WindowPanel(appManager.getWindowPanelListener());
			}
			else{
				itemWindowPanel               = new WindowPanel(null);
			}
			itemWindowPanel.init();
			return itemWindowPanel;
		}
		return null;
	}


}