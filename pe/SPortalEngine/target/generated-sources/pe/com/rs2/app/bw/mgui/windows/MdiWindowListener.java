package com.rs2.app.bw.mgui.windows;

import org.smyld.app.event.WindowListener;
import org.smyld.gui.GUIAction;

public interface MdiWindowListener extends WindowListener {


	public abstract void init();
	public abstract void activeWindowHandle(MdiWindow activeWindow);

}