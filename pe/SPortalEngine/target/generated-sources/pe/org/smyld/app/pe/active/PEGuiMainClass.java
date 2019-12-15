package org.smyld.app.pe.active;

import com.rs2.app.bw.mgui.windows.MdiWindow;
import javax.swing.SwingUtilities;
import org.smyld.app.AppBusinessMode;
import org.smyld.app.AppMainClass;
import org.smyld.gui.GUIAction;
import org.smyld.gui.event.ActionHandler;

public class PEGuiMainClass extends AppMainClass implements ActionHandler{

	public static             WindowsFactory  childWindowsFactory;
	public ApplicationManager childManager;  
	public MdiWindow          appMainWindow; 
	public static             MenuFactory     childMenuFactory;
	public static             ActionFactory   childActionsFactory;
	public static             ToolbarFactory  childToolbarsFactory;
	public static             PanelsFactory   childPanelsFactory;
	public static             PEGuiMainClass  instance;


	public PEGuiMainClass(String[] args){
		this.args = args;
		SwingUtilities.invokeLater(new Runnable(){public void run(){
			init();
			}});;
		}


	public static void main(String[] args){
		System.out.println("This is the starting class for the application ....");
		final String[] fargs = args;
		 instance            = new PEGuiMainClass(fargs);
	}

	public String getSettingsFile(){
		return "target/deploy/appSettings.xml";
	}

	public String readAppMgrClassName(){
		return "com.client.app.TestAppMainClass";
	}

	private void init(){
		super.initApplication();
		childWindowsFactory   = new WindowsFactory();
		setWindowsFactory(childWindowsFactory);
		if (businessMode == AppBusinessMode.Interfaces){
			String appMgrClsName = readAppMgrClassName();
			if (appMgrClsName != null){
				try {
					childManager = (ApplicationManager)Class.forName(appMgrClsName).newInstance();
					setApplicationManager( childManager);
					childManager.applicationInit(args);
				}
				catch (Exception e) {
					System.out.println("Error instantiating the application manager class (" + appMgrClsName + ")");
					e.printStackTrace();
				}
			}
		}
		else if (businessMode == AppBusinessMode.Annotations){
			doInitiateAnnotations();;
		}
		super.postAppManagerInit();
		childActionsFactory   = new ActionFactory (this);
		setAppActionsFactory(childActionsFactory);
		childToolbarsFactory  = new ToolbarFactory(childActionsFactory);
		setAppToolbarsFactory(childToolbarsFactory);
		childMenuFactory      = new MenuFactory   (childActionsFactory);
		setAppMenuFactory(childMenuFactory);
		childPanelsFactory    = new PanelsFactory ();
		setAppPanelsFactory(childPanelsFactory);
		if (childManager != null){
			appMainWindow         = new MdiWindow     (childManager.getMdiWindowListener(),null);
		}
		else{
			System.out.println("Warning : The porting application manager class is not available");
			appMainWindow         = new MdiWindow     (null,null);
		}
		appMainWindow.setComponentOrientation(PEGuiMainClass.getOrientation());
		childWindowsFactory.setActiveMDI(appMainWindow);
		childWindowsFactory.addWindow("MdiWindow",appMainWindow);
		appMainWindow.setVisible(true);
		if(childManager!=null){
				childManager.interfaceCreated();
		}
	}

	public void openWindow(String windowName,GUIAction incomingAction){
		childWindowsFactory.openWindow(windowName,childManager,incomingAction);
	}

	public void sendWindow(String windowName,GUIAction incomingAction){
		childWindowsFactory.sendWindow(windowName,incomingAction);
	}

	public void applicationExit(){
		if (childManager!=null){
			childManager.applicationExit();
		}
		else{
			super.applicationExit();
		}
	}


}