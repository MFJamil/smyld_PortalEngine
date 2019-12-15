package com.rs2.app.bw.mgui.panels;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import org.smyld.app.pe.active.PEGuiMainClass;
import org.smyld.gui.SMYLDButton;
import org.smyld.gui.SMYLDCheckBox;
import org.smyld.gui.SMYLDLabeledTextField;
import org.smyld.gui.SMYLDList;
import org.smyld.gui.SMYLDRCLayout;
import org.smyld.gui.portal.engine.PEPanel;

public class WindowPanel extends PEPanel {

	public  WindowPanelListener   windowInterface; 
	private BorderLayout          WindowPanel_BR;  
	public  JSplitPane            mainSplitter;    
	public  PEPanel               pnlExplorer;     
	private SMYLDRCLayout         pnlExplorer_RC;  
	public  SMYLDLabeledTextField AccountNo1;      
	public  SMYLDLabeledTextField AccountName1;    
	private SMYLDList             AccountType1;    
	public  JScrollPane           scrlPane1;       
	public  PEPanel               pnlAccount;      
	private SMYLDRCLayout         pnlAccount_RC;   
	public  SMYLDLabeledTextField AccountNo;       
	public  SMYLDLabeledTextField AccountName;     
	private SMYLDList             AccountType;     
	public  SMYLDList             accountCategory; 
	public  SMYLDCheckBox         print;           
	public  JRadioButton          single;          
	public  SMYLDButton           SendInfo;        
	public  SMYLDButton           Cancel;          
	public  SMYLDButton           addItemBtn;      


	public void init(){
		// Initialization Lines;
		final WindowPanel instance = this;;
		WindowPanel_BR             = new BorderLayout         ();
		mainSplitter               = new JSplitPane           ();
		mainSplitter.setComponentOrientation(PEGuiMainClass.getOrientation());
		pnlExplorer                = new PEPanel              (userManager);
		pnlExplorer.setComponentOrientation(PEGuiMainClass.getOrientation());
		pnlExplorer_RC             = new SMYLDRCLayout        ();
		pnlExplorer_RC.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountNo1                 = new SMYLDLabeledTextField(PEGuiMainClass.translate("WindowPanel","AccountNo1",""),"Hi From Generator",1,0);
		AccountNo1.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountName1               = new SMYLDLabeledTextField(PEGuiMainClass.translate("WindowPanel","AccountName1",""),"",1,0);
		AccountName1.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountType1               = new SMYLDList            ();
		AccountType1.setComponentOrientation(PEGuiMainClass.getOrientation());
		scrlPane1                  = new JScrollPane          ();
		scrlPane1.setComponentOrientation(PEGuiMainClass.getOrientation());
		pnlAccount                 = new PEPanel              (userManager);
		pnlAccount.setComponentOrientation(PEGuiMainClass.getOrientation());
		pnlAccount_RC              = new SMYLDRCLayout        ();
		pnlAccount_RC.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountNo                  = new SMYLDLabeledTextField(PEGuiMainClass.translate("WindowPanel","AccountNo",""),"Hi From Generator",1,0);
		AccountNo.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountName                = new SMYLDLabeledTextField(PEGuiMainClass.translate("WindowPanel","AccountName",""),"",1,0);
		AccountName.setComponentOrientation(PEGuiMainClass.getOrientation());
		AccountType                = new SMYLDList            ();
		AccountType.setComponentOrientation(PEGuiMainClass.getOrientation());
		accountCategory            = new SMYLDList            ();
		accountCategory.setComponentOrientation(PEGuiMainClass.getOrientation());
		print                      = new SMYLDCheckBox        (PEGuiMainClass.translate("WindowPanel","print","Print"),true);
		print.setComponentOrientation(PEGuiMainClass.getOrientation());
		single                     = new JRadioButton         (PEGuiMainClass.translate("WindowPanel","single","Single"),false);
		single.setComponentOrientation(PEGuiMainClass.getOrientation());
		SendInfo                   = new SMYLDButton          (PEGuiMainClass.translate("WindowPanel","SendInfo","Send"));
		SendInfo.setComponentOrientation(PEGuiMainClass.getOrientation());
		Cancel                     = new SMYLDButton          (PEGuiMainClass.translate("WindowPanel","Cancel","Cancel"));
		Cancel.setComponentOrientation(PEGuiMainClass.getOrientation());
		addItemBtn                 = new SMYLDButton          (PEGuiMainClass.translate("WindowPanel","addItemBtn","AddItem"));
		addItemBtn.setComponentOrientation(PEGuiMainClass.getOrientation());
		// Extra Lines;
		mainSplitter.setOrientation(JSplitPane.VERTICAL_SPLIT);
		// Layout Lines;
		this.setLayout(WindowPanel_BR);
		pnlExplorer.setLayout(pnlExplorer_RC);
		pnlAccount.setLayout(pnlAccount_RC);
		// Structure Lines;
		this.add("mainSplitter",mainSplitter,"Center");
		mainSplitter.setLeftComponent(pnlExplorer);
		pnlExplorer.addComponent("AccountNo1",AccountNo1,10,1,20,1);
		pnlExplorer.addComponent("AccountName1",AccountName1,10,2,20,1);
		pnlExplorer.addComponent("AccountType1",AccountType1,10,3,20,1);
		mainSplitter.setRightComponent(scrlPane1);
		scrlPane1.getViewport().add(pnlAccount);
		pnlAccount.addComponent("AccountNo",AccountNo,10,1,20,1);
		pnlAccount.addComponent("AccountName",AccountName,10,2,20,1);
		pnlAccount.addComponent("AccountType",AccountType,10,3,20,1);
		pnlAccount.addComponent("accountCategory",accountCategory,10,4,20,1);
		pnlAccount.addComponent("print",print,10,5,20,1);
		pnlAccount.addComponent("single",single,10,6,10,1);
		pnlAccount.addComponent("SendInfo",SendInfo,10,7,8,1);
		pnlAccount.addComponent("Cancel",Cancel,22,7,8,1);
		pnlAccount.addComponent("addItemBtn",addItemBtn,22,6,8,1);
		// Listeners Lines;
		AccountNo1.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent evt){
				if (windowInterface!=null){
					windowInterface.accountNoLostFocus();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","accountNoLostFocus",instance);
				}
			}
		});
		AccountName1.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent evt){
				if (windowInterface!=null){
					windowInterface.accountNameFocus();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","accountNameFocus",instance);
				}
			}
		});
		AccountNo.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent evt){
				if (windowInterface!=null){
					windowInterface.accountNoLostFocus();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","accountNoLostFocus",instance);
				}
			}
		});
		AccountName.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent evt){
				if (windowInterface!=null){
					windowInterface.accountNameFocus();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","accountNameFocus",instance);
				}
			}
		});
		print.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (windowInterface!=null){
					windowInterface.checkBox();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","checkBox",instance);
				}
			}
		});
		single.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (windowInterface!=null){
					windowInterface.radioButton();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","radioButton",instance);
				}
			}
		});
		SendInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (windowInterface!=null){
					windowInterface.okPressed();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","okPressed",instance);
				}
			}
		});
		Cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (windowInterface!=null){
					windowInterface.cancelPressed();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","cancelPressed",instance);
				}
			}
		});
		addItemBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (windowInterface!=null){
					windowInterface.addItem();
				}
				else{
					PEGuiMainClass.instance.handleAction("WindowPanel","addItem",instance);
				}
			}
		});
		if (windowInterface!=null){
			windowInterface.activePanelHandle(this);
		}
	}

	public WindowPanel(WindowPanelListener windowListener){
		windowInterface= windowListener;
		applyComponentOrientation(PEGuiMainClass.getOrientation());
	}

	public JComponent getMainComponent(){
		return this;
	}


}