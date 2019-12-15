package com.rs2.app.bw.mgui.panels;

public interface WindowPanelListener {


	public abstract void accountNoLostFocus();
	public abstract void accountNameFocus();
	public abstract void checkBox();
	public abstract void radioButton();
	public abstract void okPressed();
	public abstract void cancelPressed();
	public abstract void addItem();
	public abstract void activePanelHandle(WindowPanel panelHandle);

}