package org.smyld.app.pe.active;

import org.smyld.app.AppActionFactory;
import org.smyld.app.AppToolbarsFactory;
import org.smyld.app.pe.model.gui.PEAction;
import org.smyld.app.pe.model.user.UserConstraint;
import org.smyld.gui.SMYLDButton;
import org.smyld.gui.SMYLDToolbar;
import org.smyld.gui.event.ActionHandler;

public class ToolbarFactory extends AppToolbarsFactory {


	public ToolbarFactory(AppActionFactory childActionsFactory){
		super(childActionsFactory);
	}


	public SMYLDToolbar generatemainToolbarToolBar(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = srcActionHandler;
		}
		SMYLDToolbar tlbmainToolbar = new SMYLDToolbar();
		tlbmainToolbar.applyComponentOrientation(PEGuiMainClass.getOrientation());
		SMYLDButton null =  createButton(null,"null","openFile.gif","");
		if (null!=null){
			null.applyComponentOrientation(PEGuiMainClass.getOrientation());
			tlbmainToolbar.add(null,"null");
		}
		SMYLDButton tlbExitSystem =  createButton("exitWindows","tlbExitSystem","exit.gif","");
		if (tlbExitSystem!=null){
			tlbExitSystem.applyComponentOrientation(PEGuiMainClass.getOrientation());
			tlbmainToolbar.add(tlbExitSystem,"tlbExitSystem");
		}
		return tlbmainToolbar;
	}


}