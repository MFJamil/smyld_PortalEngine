package org.smyld.app.pe.active;

import org.smyld.app.AppMenuFactory;
import org.smyld.app.pe.model.user.UserConstraint;
import org.smyld.gui.SMYLDMenu;
import org.smyld.gui.SMYLDMenuBar;
import org.smyld.gui.SMYLDMenuClass;
import org.smyld.gui.SMYLDMenuItem;
import org.smyld.gui.SMYLDPopupMenu;
import org.smyld.gui.SMYLDTree;
import org.smyld.gui.event.ActionHandler;
import org.smyld.gui.tree.SMYLDTreeNode;

public class MenuFactory extends AppMenuFactory {


	public MenuFactory(ActionFactory childActionsFactory){
		super(childActionsFactory);
		init();
	}


	public SMYLDMenuBar generateacctMenuAsBar(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDMenuBar baracctMenu  = new SMYLDMenuBar(appActionsFactory.getHandler());
		baracctMenu.applyComponentOrientation(PEGuiMainClass.getOrientation());
		SMYLDMenuClass Accounts = createMenuItem("SMYLDMenu",null,"Accounts","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass newAccount = createMenuItem("SMYLDMenuItem","insertAccount","newAccount","null",null,srcActionHandler,null,null,null);
		if ((newAccount!=null)&&(Accounts!=null)){
			((SMYLDMenu)Accounts).add((SMYLDMenuItem)newAccount);
		}
		SMYLDMenuClass delAccount = createMenuItem("SMYLDMenuItem","deleteAccount","delAccount","null",null,srcActionHandler,null,null,null);
		if ((delAccount!=null)&&(Accounts!=null)){
			((SMYLDMenu)Accounts).add((SMYLDMenuItem)delAccount);
		}
		if ((Accounts!=null)&&(baracctMenu!=null)){
			((SMYLDMenuBar)baracctMenu).add((SMYLDMenu)Accounts);
		}
		return baracctMenu;
	}

	public SMYLDTree generateacctMenuAsTree(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDTreeNode baracctMenu = new SMYLDTreeNode("rootID","root");
		SMYLDMenuClass Accounts = createMenuItem("SMYLDTreeNode",null,"Accounts","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass newAccount = createMenuItem("SMYLDTreeNode","insertAccount","newAccount","null",null,srcActionHandler,null,null,null);
		if ((newAccount!=null)&&(Accounts!=null)){
			((SMYLDTreeNode)Accounts).add(newAccount);
		}
		SMYLDMenuClass delAccount = createMenuItem("SMYLDTreeNode","deleteAccount","delAccount","null",null,srcActionHandler,null,null,null);
		if ((delAccount!=null)&&(Accounts!=null)){
			((SMYLDTreeNode)Accounts).add(delAccount);
		}
		if ((Accounts!=null)&&(baracctMenu!=null)){
			((SMYLDTreeNode)baracctMenu).add(Accounts);
		}
		SMYLDTree targetTree      = new SMYLDTree    (baracctMenu,srcActionHandler);
		targetTree.applyComponentOrientation(PEGuiMainClass.getOrientation());
		return targetTree;
	}

	public SMYLDPopupMenu generateacctMenuAsPopup(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDPopupMenu baracctMenu = new SMYLDPopupMenu();
		baracctMenu.applyComponentOrientation(PEGuiMainClass.getOrientation());
		SMYLDMenuClass Accounts = createMenuItem("SMYLDMenu",null,"Accounts","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass newAccount = createMenuItem("SMYLDMenuItem","insertAccount","newAccount","null",null,srcActionHandler,null,null,null);
		if ((newAccount!=null)&&(Accounts!=null)){
			((SMYLDMenu)Accounts).add((SMYLDMenuItem)newAccount,"newAccount");
		}
		SMYLDMenuClass delAccount = createMenuItem("SMYLDMenuItem","deleteAccount","delAccount","null",null,srcActionHandler,null,null,null);
		if ((delAccount!=null)&&(Accounts!=null)){
			((SMYLDMenu)Accounts).add((SMYLDMenuItem)delAccount,"delAccount");
		}
		if ((Accounts!=null)&&(baracctMenu!=null)){
			((SMYLDPopupMenu)baracctMenu).add((SMYLDMenu)Accounts,"Accounts");
		}
		return baracctMenu;
	}

	public SMYLDMenuBar generatemainMenuAsBar(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDMenuBar barmainMenu   = new SMYLDMenuBar(appActionsFactory.getHandler());
		barmainMenu.applyComponentOrientation(PEGuiMainClass.getOrientation());
		SMYLDMenuClass files = createMenuItem("SMYLDMenu",null,"files","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass fileMenu = createMenuItem("SMYLDMenuItem","openFile","fileMenu","null",null,srcActionHandler,null,null,null);
		if ((fileMenu!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)fileMenu);
		}
		SMYLDMenuClass exitMenu = createMenuItem("SMYLDMenuItem","exitApp","exitMenu","item_mnu.jpg",null,srcActionHandler,null,null,null);
		if ((exitMenu!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)exitMenu);
		}
		if(files!=null){
			((SMYLDMenu)files).addSeparator();
		}
		SMYLDMenuClass logoff = createMenuItem("SMYLDMenuItem","logoutSystem","logoff","null",null,srcActionHandler,null,null,null);
		if ((logoff!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)logoff);
		}
		SMYLDMenuClass exitSystem = createMenuItem("SMYLDMenuItem","exitWindows","exitSystem","null",null,srcActionHandler,null,null,null);
		if ((exitSystem!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)exitSystem);
		}
		if ((files!=null)&&(barmainMenu!=null)){
			((SMYLDMenuBar)barmainMenu).add((SMYLDMenu)files);
		}
		SMYLDMenuClass Games = createMenuItem("SMYLDMenu",null,"Games","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass spider = createMenuItem("SMYLDMenuItem","runGameSpider","spider","null",null,srcActionHandler,null,null,null);
		if ((spider!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)spider);
		}
		SMYLDMenuClass mine = createMenuItem("SMYLDMenuItem","runGameMine","mine","null",null,srcActionHandler,null,null,null);
		if ((mine!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)mine);
		}
		SMYLDMenuClass freecell = createMenuItem("SMYLDMenuItem","runGameFreeCell","freecell","null",null,srcActionHandler,null,null,null);
		if ((freecell!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)freecell);
		}
		if ((Games!=null)&&(barmainMenu!=null)){
			((SMYLDMenuBar)barmainMenu).add((SMYLDMenu)Games);
		}
		SMYLDMenuClass Accessories = createMenuItem("SMYLDMenu",null,"Accessories","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass calc = createMenuItem("SMYLDMenuItem","runCalculator","calc","null",null,srcActionHandler,null,null,null);
		if ((calc!=null)&&(Accessories!=null)){
			((SMYLDMenu)Accessories).add((SMYLDMenuItem)calc);
		}
		SMYLDMenuClass notepad = createMenuItem("SMYLDMenuItem","runNotepad","notepad","null",null,srcActionHandler,null,null,null);
		if ((notepad!=null)&&(Accessories!=null)){
			((SMYLDMenu)Accessories).add((SMYLDMenuItem)notepad);
		}
		if ((Accessories!=null)&&(barmainMenu!=null)){
			((SMYLDMenuBar)barmainMenu).add((SMYLDMenu)Accessories);
		}
		SMYLDMenuClass window = createMenuItem("SMYLDMenu",null,"window","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass helpMenu = createMenuItem("SMYLDMenuItem","openHelp","helpMenu","item_exe.jpg",null,srcActionHandler,null,null,null);
		if ((helpMenu!=null)&&(window!=null)){
			((SMYLDMenu)window).add((SMYLDMenuItem)helpMenu);
		}
		SMYLDMenuClass aboutMenu = createMenuItem("SMYLDMenuItem","openAbout","aboutMenu","null",null,srcActionHandler,null,null,null);
		if ((aboutMenu!=null)&&(window!=null)){
			((SMYLDMenu)window).add((SMYLDMenuItem)aboutMenu);
		}
		if ((window!=null)&&(barmainMenu!=null)){
			((SMYLDMenuBar)barmainMenu).add((SMYLDMenu)window);
		}
		return barmainMenu;
	}

	public SMYLDTree generatemainMenuAsTree(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDTreeNode barmainMenu  = new SMYLDTreeNode("rootID","root");
		SMYLDMenuClass files = createMenuItem("SMYLDTreeNode",null,"files","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass fileMenu = createMenuItem("SMYLDTreeNode","openFile","fileMenu","null",null,srcActionHandler,null,null,null);
		if ((fileMenu!=null)&&(files!=null)){
			((SMYLDTreeNode)files).add(fileMenu);
		}
		SMYLDMenuClass exitMenu = createMenuItem("SMYLDTreeNode","exitApp","exitMenu","item_mnu.jpg",null,srcActionHandler,null,null,null);
		if ((exitMenu!=null)&&(files!=null)){
			((SMYLDTreeNode)files).add(exitMenu);
		}
		SMYLDMenuClass logoff = createMenuItem("SMYLDTreeNode","logoutSystem","logoff","null",null,srcActionHandler,null,null,null);
		if ((logoff!=null)&&(files!=null)){
			((SMYLDTreeNode)files).add(logoff);
		}
		SMYLDMenuClass exitSystem = createMenuItem("SMYLDTreeNode","exitWindows","exitSystem","null",null,srcActionHandler,null,null,null);
		if ((exitSystem!=null)&&(files!=null)){
			((SMYLDTreeNode)files).add(exitSystem);
		}
		if ((files!=null)&&(barmainMenu!=null)){
			((SMYLDTreeNode)barmainMenu).add(files);
		}
		SMYLDMenuClass Games = createMenuItem("SMYLDTreeNode",null,"Games","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass spider = createMenuItem("SMYLDTreeNode","runGameSpider","spider","null",null,srcActionHandler,null,null,null);
		if ((spider!=null)&&(Games!=null)){
			((SMYLDTreeNode)Games).add(spider);
		}
		SMYLDMenuClass mine = createMenuItem("SMYLDTreeNode","runGameMine","mine","null",null,srcActionHandler,null,null,null);
		if ((mine!=null)&&(Games!=null)){
			((SMYLDTreeNode)Games).add(mine);
		}
		SMYLDMenuClass freecell = createMenuItem("SMYLDTreeNode","runGameFreeCell","freecell","null",null,srcActionHandler,null,null,null);
		if ((freecell!=null)&&(Games!=null)){
			((SMYLDTreeNode)Games).add(freecell);
		}
		if ((Games!=null)&&(barmainMenu!=null)){
			((SMYLDTreeNode)barmainMenu).add(Games);
		}
		SMYLDMenuClass Accessories = createMenuItem("SMYLDTreeNode",null,"Accessories","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass calc = createMenuItem("SMYLDTreeNode","runCalculator","calc","null",null,srcActionHandler,null,null,null);
		if ((calc!=null)&&(Accessories!=null)){
			((SMYLDTreeNode)Accessories).add(calc);
		}
		SMYLDMenuClass notepad = createMenuItem("SMYLDTreeNode","runNotepad","notepad","null",null,srcActionHandler,null,null,null);
		if ((notepad!=null)&&(Accessories!=null)){
			((SMYLDTreeNode)Accessories).add(notepad);
		}
		if ((Accessories!=null)&&(barmainMenu!=null)){
			((SMYLDTreeNode)barmainMenu).add(Accessories);
		}
		SMYLDMenuClass window = createMenuItem("SMYLDTreeNode",null,"window","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass helpMenu = createMenuItem("SMYLDTreeNode","openHelp","helpMenu","item_exe.jpg",null,srcActionHandler,null,null,null);
		if ((helpMenu!=null)&&(window!=null)){
			((SMYLDTreeNode)window).add(helpMenu);
		}
		SMYLDMenuClass aboutMenu = createMenuItem("SMYLDTreeNode","openAbout","aboutMenu","null",null,srcActionHandler,null,null,null);
		if ((aboutMenu!=null)&&(window!=null)){
			((SMYLDTreeNode)window).add(aboutMenu);
		}
		if ((window!=null)&&(barmainMenu!=null)){
			((SMYLDTreeNode)barmainMenu).add(window);
		}
		SMYLDTree targetTree       = new SMYLDTree    (barmainMenu,srcActionHandler);
		targetTree.applyComponentOrientation(PEGuiMainClass.getOrientation());
		return targetTree;
	}

	public SMYLDPopupMenu generatemainMenuAsPopup(ActionHandler srcActionHandler){
		if (srcActionHandler==null){
			srcActionHandler = appActionsFactory.getHandler();
		}
		SMYLDPopupMenu barmainMenu = new SMYLDPopupMenu();
		barmainMenu.applyComponentOrientation(PEGuiMainClass.getOrientation());
		SMYLDMenuClass files = createMenuItem("SMYLDMenu",null,"files","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass fileMenu = createMenuItem("SMYLDMenuItem","openFile","fileMenu","null",null,srcActionHandler,null,null,null);
		if ((fileMenu!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)fileMenu,"fileMenu");
		}
		SMYLDMenuClass exitMenu = createMenuItem("SMYLDMenuItem","exitApp","exitMenu","item_mnu.jpg",null,srcActionHandler,null,null,null);
		if ((exitMenu!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)exitMenu,"exitMenu");
		}
		if(files!=null){
			((SMYLDPopupMenu)files).addSeparator();
		}
		SMYLDMenuClass logoff = createMenuItem("SMYLDMenuItem","logoutSystem","logoff","null",null,srcActionHandler,null,null,null);
		if ((logoff!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)logoff,"logoff");
		}
		SMYLDMenuClass exitSystem = createMenuItem("SMYLDMenuItem","exitWindows","exitSystem","null",null,srcActionHandler,null,null,null);
		if ((exitSystem!=null)&&(files!=null)){
			((SMYLDMenu)files).add((SMYLDMenuItem)exitSystem,"exitSystem");
		}
		if ((files!=null)&&(barmainMenu!=null)){
			((SMYLDPopupMenu)barmainMenu).add((SMYLDMenu)files,"files");
		}
		SMYLDMenuClass Games = createMenuItem("SMYLDMenu",null,"Games","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass spider = createMenuItem("SMYLDMenuItem","runGameSpider","spider","null",null,srcActionHandler,null,null,null);
		if ((spider!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)spider,"spider");
		}
		SMYLDMenuClass mine = createMenuItem("SMYLDMenuItem","runGameMine","mine","null",null,srcActionHandler,null,null,null);
		if ((mine!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)mine,"mine");
		}
		SMYLDMenuClass freecell = createMenuItem("SMYLDMenuItem","runGameFreeCell","freecell","null",null,srcActionHandler,null,null,null);
		if ((freecell!=null)&&(Games!=null)){
			((SMYLDMenu)Games).add((SMYLDMenuItem)freecell,"freecell");
		}
		if ((Games!=null)&&(barmainMenu!=null)){
			((SMYLDPopupMenu)barmainMenu).add((SMYLDMenu)Games,"Games");
		}
		SMYLDMenuClass Accessories = createMenuItem("SMYLDMenu",null,"Accessories","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass calc = createMenuItem("SMYLDMenuItem","runCalculator","calc","null",null,srcActionHandler,null,null,null);
		if ((calc!=null)&&(Accessories!=null)){
			((SMYLDMenu)Accessories).add((SMYLDMenuItem)calc,"calc");
		}
		SMYLDMenuClass notepad = createMenuItem("SMYLDMenuItem","runNotepad","notepad","null",null,srcActionHandler,null,null,null);
		if ((notepad!=null)&&(Accessories!=null)){
			((SMYLDMenu)Accessories).add((SMYLDMenuItem)notepad,"notepad");
		}
		if ((Accessories!=null)&&(barmainMenu!=null)){
			((SMYLDPopupMenu)barmainMenu).add((SMYLDMenu)Accessories,"Accessories");
		}
		SMYLDMenuClass window = createMenuItem("SMYLDMenu",null,"window","null",null,srcActionHandler,null,null,null);
		SMYLDMenuClass helpMenu = createMenuItem("SMYLDMenuItem","openHelp","helpMenu","item_exe.jpg",null,srcActionHandler,null,null,null);
		if ((helpMenu!=null)&&(window!=null)){
			((SMYLDMenu)window).add((SMYLDMenuItem)helpMenu,"helpMenu");
		}
		SMYLDMenuClass aboutMenu = createMenuItem("SMYLDMenuItem","openAbout","aboutMenu","null",null,srcActionHandler,null,null,null);
		if ((aboutMenu!=null)&&(window!=null)){
			((SMYLDMenu)window).add((SMYLDMenuItem)aboutMenu,"aboutMenu");
		}
		if ((window!=null)&&(barmainMenu!=null)){
			((SMYLDPopupMenu)barmainMenu).add((SMYLDMenu)window,"window");
		}
		return barmainMenu;
	}

	public Object getMenu(String menuMethName,ActionHandler srcActionHandler){
		if (menuMethName.equals("generateacctMenuAsBar")) return generateacctMenuAsBar(srcActionHandler);
		if (menuMethName.equals("generateacctMenuAsTree")) return generateacctMenuAsTree(srcActionHandler);
		if (menuMethName.equals("generateacctMenuAsPopup")) return generateacctMenuAsPopup(srcActionHandler);
		if (menuMethName.equals("generatemainMenuAsBar")) return generatemainMenuAsBar(srcActionHandler);
		if (menuMethName.equals("generatemainMenuAsTree")) return generatemainMenuAsTree(srcActionHandler);
		if (menuMethName.equals("generatemainMenuAsPopup")) return generatemainMenuAsPopup(srcActionHandler);
		return null;
	}

	private void init(){
	}


}