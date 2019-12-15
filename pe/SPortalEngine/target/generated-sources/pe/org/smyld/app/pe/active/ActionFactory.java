package org.smyld.app.pe.active;

import org.smyld.app.AppActionFactory;
import org.smyld.app.pe.model.gui.PEAction;
import org.smyld.app.pe.model.user.UserConstraint;
import org.smyld.gui.event.ActionHandler;

public class ActionFactory extends AppActionFactory {


	public ActionFactory(ActionHandler srcActionHandler){
		super(srcActionHandler);
	}


	public void creatActions(){
		PEAction insertAccount   = new PEAction();
		insertAccount.setID("insertAccount");
		insertAccount.setLabel(PEGuiMainClass.translate("pactions","insertAccount","Insert new Account"));
		insertAccount.setTarget("OpenFileWindow");
		insertAccount.setCommand("assingToApplication");
		pactions.put("insertAccount",insertAccount);
		PEAction runGameMine     = new PEAction();
		runGameMine.setID("runGameMine");
		runGameMine.setLabel(PEGuiMainClass.translate("pactions","runGameMine","Mine Sweeper"));
		runGameMine.setParameters("c:/windows/system32/winmine");
		runGameMine.setCommand("runApplication");
		pactions.put("runGameMine",runGameMine);
		PEAction openFile        = new PEAction();
		openFile.setID("openFile");
		openFile.setLabel(PEGuiMainClass.translate("pactions","openFile","Open File"));
		openFile.setTarget("OpenFileWindow");
		openFile.setCommand("openWindow");
		pactions.put("openFile",openFile);
		PEAction runNotepad      = new PEAction();
		runNotepad.setID("runNotepad");
		runNotepad.setLabel(PEGuiMainClass.translate("pactions","runNotepad","Notepad"));
		runNotepad.setParameters("notepad");
		runNotepad.setCommand("runApplication");
		pactions.put("runNotepad",runNotepad);
		PEAction logoutSystem    = new PEAction();
		logoutSystem.setID("logoutSystem");
		logoutSystem.setLabel(PEGuiMainClass.translate("pactions","logoutSystem","Log out computer"));
		logoutSystem.setParameters("c:/windows/System32/logoff");
		logoutSystem.setCommand("runApplication");
		pactions.put("logoutSystem",logoutSystem);
		PEAction exitWindows     = new PEAction();
		exitWindows.setID("exitWindows");
		exitWindows.setLabel(PEGuiMainClass.translate("pactions","exitWindows","Shut down computer"));
		exitWindows.setParameters("c:/windows/System32/shutdown");
		exitWindows.setCommand("runApplication");
		pactions.put("exitWindows",exitWindows);
		PEAction openHelp        = new PEAction();
		openHelp.setID("openHelp");
		openHelp.setLabel(PEGuiMainClass.translate("pactions","openHelp","Help ...."));
		openHelp.setTarget("HelpWindow");
		openHelp.setCommand("openWindow");
		pactions.put("openHelp",openHelp);
		PEAction runCalculator   = new PEAction();
		runCalculator.setID("runCalculator");
		runCalculator.setLabel(PEGuiMainClass.translate("pactions","runCalculator","Calculator"));
		runCalculator.setParameters("c:/windows/system32/calc");
		runCalculator.setCommand("runApplication");
		pactions.put("runCalculator",runCalculator);
		PEAction runGameSpider   = new PEAction();
		runGameSpider.setID("runGameSpider");
		runGameSpider.setLabel(PEGuiMainClass.translate("pactions","runGameSpider","Spider Soliter"));
		runGameSpider.setParameters("c:/windows/system32/spider");
		runGameSpider.setCommand("runApplication");
		pactions.put("runGameSpider",runGameSpider);
		PEAction runGameFreeCell = new PEAction();
		runGameFreeCell.setID("runGameFreeCell");
		runGameFreeCell.setLabel(PEGuiMainClass.translate("pactions","runGameFreeCell","Free Cell"));
		runGameFreeCell.setParameters("c:/windows/system32/freecell");
		runGameFreeCell.setCommand("runApplication");
		pactions.put("runGameFreeCell",runGameFreeCell);
		PEAction exitApp         = new PEAction();
		exitApp.setID("exitApp");
		exitApp.setLabel(PEGuiMainClass.translate("pactions","exitApp","End Application"));
		exitApp.setParameters("c:/windows/System32/services.msc");
		exitApp.setCommand("runApplication");
		pactions.put("exitApp",exitApp);
		PEAction deleteAccount   = new PEAction();
		deleteAccount.setID("deleteAccount");
		deleteAccount.setLabel(PEGuiMainClass.translate("pactions","deleteAccount","Delete an Account"));
		deleteAccount.setTarget("OpenFileWindow");
		deleteAccount.setCommand("assingToApplication");
		pactions.put("deleteAccount",deleteAccount);
		PEAction openAbout       = new PEAction();
		openAbout.setID("openAbout");
		openAbout.setLabel(PEGuiMainClass.translate("pactions","openAbout","About Portal Engine"));
		openAbout.setParameters("\"C:/Programme/Internet Explorer/iexplore\" \"www.mohammedfj.java-fan.com\"");
		openAbout.setCommand("runApplication");
		pactions.put("openAbout",openAbout);
	}


}