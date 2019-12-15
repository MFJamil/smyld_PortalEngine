package com.rs2.app.bw.mgui.windows;

import com.rs2.app.bw.mgui.panels.WindowPanelListener;
import org.smyld.app.event.WindowListener;
import org.smyld.gui.GUIAction;
import org.smyld.gui.event.ActionHandler;

public interface OpenFileWindowListener extends WindowListener,ActionHandler,WindowPanelListener {


	public abstract void activeWindowHandle(OpenFileWindow activeWindow);

}