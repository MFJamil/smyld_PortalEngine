package org.smyld.gui.portal.engine.sources;

import org.smyld.db.SQL;

public interface SQLStatements extends SQL, DBPortalConstants {
	public static final String SEL_APPLICATION = SELA + TABLE_PRT_APPLICATIONS
			+ WHR + COL_PRT_APPLICATIONS_ID + EQM;
	public static final String SEL_APP_IMAGES = SEL + TABLE_PRT_IMAGES + DOT
			+ COL_PRT_IMAGES_IMG_SRC + COM + TABLE_PRT_IMAGES + DOT
			+ COL_PRT_IMAGES_IMG_TYPE + FRM + TABLE_PRT_IMAGES + COM
			+ TABLE_PRT_APP_IMAGES + WHR + TABLE_PRT_IMAGES + DOT
			+ COL_PRT_IMAGES_IMG_SRC + EQ + TABLE_PRT_APP_IMAGES + DOT
			+ COL_PRT_APP_IMAGES_IMG_SRC + AND + COL_PRT_APP_IMAGES_APP_ID
			+ EQM;
	public static final String SEL_APP_LIBRARIES = SEL + COL_PRT_LIBRARY_ID
			+ COM + COL_PRT_LIBRARY_SRC + FRM + TABLE_PRT_LIBRARY + COM
			+ TABLE_PRT_APP_LIBRARY + WHR + TABLE_PRT_LIBRARY + DOT
			+ COL_PRT_LIBRARY_ID + EQ + TABLE_PRT_APP_LIBRARY + DOT
			+ COL_PRT_APP_LIBRARY_LIB_ID + AND + COL_PRT_APP_LIBRARY_APP_ID
			+ EQM;
	public static final String SEL_APP_RESOURCES = SEL + COL_PRT_RESOURCES_ID
			+ COM + COL_PRT_RESOURCES_SRC + FRM + TABLE_PRT_RESOURCES + COM
			+ TABLE_PRT_APP_RESOURCES + WHR + TABLE_PRT_RESOURCES + DOT
			+ COL_PRT_RESOURCES_ID + EQ + TABLE_PRT_APP_RESOURCES + DOT
			+ COL_PRT_APP_RESOURCES_RES_ID + AND + COL_PRT_APP_RESOURCES_APP_ID
			+ EQM;
	public static final String SEL_APP_LANGS = SEL + TABLE_PRT_LANG + DOT
			+ COL_PRT_LANG_NAME + COM + TABLE_PRT_LANG + DOT + COL_PRT_LANG_SRC
			+ COM + TABLE_PRT_LANG + DOT + COL_PRT_LANG_TARGET + FRM
			+ TABLE_PRT_LANG + COM + TABLE_PRT_APP_LANG + WHR + TABLE_PRT_LANG
			+ DOT + COL_PRT_LANG_NAME + EQ + TABLE_PRT_APP_LANG + DOT
			+ COL_PRT_LANG_NAME + AND + TABLE_PRT_LANG + DOT + COL_PRT_LANG_SRC
			+ EQ + TABLE_PRT_APP_LANG + DOT + COL_PRT_LANG_SRC + AND
			+ TABLE_PRT_APP_LANG + DOT + COL_PRT_APP_LANG_ID + EQM;
	public static final String SEL_APP_MENU_BARS = SELA + TABLE_PRT_MENU + WHR
			+ COL_PRT_MENU_APP_ID + EQM + AND + COL_PRT_MENU_PARENT_ID + ISNULL;
	public static final String SEL_APP_MENU_BAR = SELA + TABLE_PRT_MENU + WHR
			+ COL_PRT_MENU_APP_ID + EQM + AND + COL_PRT_MENU_BAR_ID + EQM;
	public static final String SEL_APP_MENU_CHILDREN = SELA + TABLE_PRT_MENU
			+ WHR + COL_PRT_MENU_APP_ID + EQM + AND + COL_PRT_MENU_BAR_ID + EQM
			+ AND + COL_PRT_MENU_PARENT_ID + EQM + ORD + COL_PRT_MENU_MNU_ORDER;
	public static final String SEL_APP_ACTIONS = SELA + TABLE_PRT_ACTIONS + WHR
			+ COL_PRT_ACTIONS_APP_ID + EQM;

	public static final String SEL_APP_WINDOWS = SELA + TABLE_PRT_WINDOWS + WHR
			+ COL_PRT_WINDOWS_APP_ID + EQM;
	public static final String SEL_APP_PANELS = SELA + TABLE_PRT_PANELS + WHR
			+ COL_PRT_PANELS_APP_ID + EQM;

	public static final String SEL_APP_TOOL_BARS = SEL + DIST + PO
			+ COL_PRT_TOOLBARS_TLB_ID + PC + FRM + TABLE_PRT_TOOLBARS + WHR
			+ COL_PRT_TOOLBARS_APP_ID + EQM;
	public static final String SEL_APP_TOOL_BAR = SELA + TABLE_PRT_TOOLBARS
			+ WHR + COL_PRT_TOOLBARS_APP_ID + EQM + AND
			+ COL_PRT_TOOLBARS_TLB_ID + EQM + ORD + COL_PRT_TOOLBARS_ITEM_ORDER;

	public static final String INS_NEW_APP = INS + TABLE_PRT_APPLICATIONS + PO
			+ COL_PRT_APPLICATIONS_ID + COM + COL_PRT_APPLICATIONS_HOME + COM
			+ COL_PRT_APPLICATIONS_NAME + COM + COL_PRT_APPLICATIONS_TYPE + COM
			+ COL_PRT_APPLICATIONS_SRC + COM + COL_PRT_APPLICATIONS_CLASSES
			+ COM + COL_PRT_APPLICATIONS_COMPONENT_TYPE + COM
			+ COL_PRT_APPLICATIONS_APPEARANCE + COM
			+ COL_PRT_APPLICATIONS_MAINCLASS + COM
			+ COL_PRT_APPLICATIONS_SETTINGS_NAME + COM
			+ COL_PRT_APPLICATIONS_SETTINGS_PATH + COM
			+ COL_PRT_APPLICATIONS_JAR_NAME + COM
			+ COL_PRT_APPLICATIONS_JAR_PATH + COM
			+ COL_PRT_APPLICATIONS_LOG_NAME + COM
			+ COL_PRT_APPLICATIONS_LOG_PATH + PC + VAO + QUM + COM + QUM + COM
			+ QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM
			+ COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM
			+ QUM + COM + QUM + PC;
	public static final String INS_NEW_APP_WINDOW = INS + TABLE_PRT_WINDOWS
			+ PO + COL_PRT_WINDOWS_APP_ID + COM + COL_PRT_WINDOWS_ID + COM
			+ COL_PRT_WINDOWS_BODY + PC + VAO + QUM + COM + QUM + COM + QUM
			+ PC;
	public static final String INS_NEW_APP_PANEL = INS + TABLE_PRT_PANELS + PO
			+ COL_PRT_PANELS_APP_ID + COM + COL_PRT_PANELS_ID + COM
			+ COL_PRT_PANELS_BODY + PC + VAO + QUM + COM + QUM + COM + QUM + PC;
	public static final String INS_NEW_ACTION = INS + TABLE_PRT_ACTIONS + PO
			+ COL_PRT_ACTIONS_APP_ID + COM + COL_PRT_ACTIONS_ACTION_ID + COM
			+ COL_PRT_ACTIONS_ACT_COM + COM + COL_PRT_ACTIONS_ACT_LABEL + COM
			+ COL_PRT_ACTIONS_ACT_PARAM + COM + COL_PRT_ACTIONS_ACT_TARGET + PC
			+ VAO + QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM
			+ QUM + PC;
	public static final String INS_NEW_MENU = INS + TABLE_PRT_MENU + PO
			+ COL_PRT_MENU_APP_ID + COM + COL_PRT_MENU_BAR_ID + COM
			+ COL_PRT_MENU_MNU_ID + COM + COL_PRT_MENU_PARENT_ID + COM
			+ COL_PRT_MENU_MNU_ICON + COM + COL_PRT_MENU_ACTION_ID + COM
			+ COL_PRT_MENU_MNU_TYPE + COM + COL_PRT_MENU_MNU_ORDER + PC + VAO
			+ QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM
			+ COM + QUM + COM + QUM + PC;

	public static final String INS_NEW_TOOLBAR = INS + TABLE_PRT_TOOLBARS + PO
			+ COL_PRT_TOOLBARS_APP_ID + COM + COL_PRT_TOOLBARS_TLB_ID + COM
			+ COL_PRT_TOOLBARS_ITEM_ID + COM + COL_PRT_TOOLBARS_ACTION_ID + COM
			+ COL_PRT_TOOLBARS_ITEM_ICON + COM + COL_PRT_TOOLBARS_ITEM_ORDER
			+ COM + COL_PRT_TOOLBARS_ITEM_TYPE + PC + VAO + QUM + COM + QUM
			+ COM + QUM + COM + QUM + COM + QUM + COM + QUM + COM + QUM + PC;
	public static final String INS_NEW_LIBRARY = INS + TABLE_PRT_LIBRARY + PO
			+ COL_PRT_LIBRARY_ID + COM + COL_PRT_LIBRARY_SRC + PC + VAO + QUM
			+ COM + QUM + PC;
	public static final String INS_NEW_APP_LIBRARY = INS
			+ TABLE_PRT_APP_LIBRARY + PO + COL_PRT_APP_LIBRARY_APP_ID + COM
			+ COL_PRT_APP_LIBRARY_LIB_ID + PC + VAO + QUM + COM + QUM + PC;
	public static final String INS_NEW_RES = INS + TABLE_PRT_RESOURCES + PO
			+ COL_PRT_RESOURCES_ID + COM + COL_PRT_RESOURCES_SRC + PC + VAO
			+ QUM + COM + QUM + PC;
	public static final String INS_NEW_APP_RES = INS + TABLE_PRT_APP_RESOURCES
			+ PO + COL_PRT_APP_RESOURCES_APP_ID + COM
			+ COL_PRT_APP_RESOURCES_RES_ID + PC + VAO + QUM + COM + QUM + PC;
	public static final String INS_NEW_LANG = INS + TABLE_PRT_LANG + PO
			+ COL_PRT_LANG_NAME + COM + COL_PRT_LANG_SRC + COM
			+ COL_PRT_LANG_TARGET + PC + VAO + QUM + COM + QUM + COM + QUM + PC;
	public static final String INS_NEW_APP_LANG = INS + TABLE_PRT_APP_LANG + PO
			+ COL_PRT_APP_LANG_ID + COM + COL_PRT_APP_LANG_NAME + COM
			+ COL_PRT_APP_LANG_SRC + PC + VAO + QUM + COM + QUM + COM + QUM
			+ PC;
	public static final String INS_NEW_IMG = INS + TABLE_PRT_IMAGES + PO
			+ COL_PRT_IMAGES_IMG_SRC + COM + COL_PRT_IMAGES_IMG_TYPE + PC + VAO
			+ QUM + COM + QUM + PC;
	public static final String INS_NEW_APP_IMG = INS + TABLE_PRT_APP_IMAGES
			+ PO + COL_PRT_APP_IMAGES_APP_ID + COM + COL_PRT_APP_IMAGES_IMG_SRC
			+ PC + VAO + QUM + COM + QUM + PC;

	public static final String DEL_APP = DEL + TABLE_PRT_APPLICATIONS + WHR
			+ COL_PRT_APPLICATIONS_ID + EQM;
	public static final String DEL_APP_WINDOWS = DEL + TABLE_PRT_WINDOWS + WHR
			+ COL_PRT_WINDOWS_APP_ID + EQM;
	public static final String DEL_APP_PANELS = DEL + TABLE_PRT_PANELS + WHR
			+ COL_PRT_PANELS_APP_ID + EQM;
	public static final String DEL_APP_MENUS = DEL + TABLE_PRT_MENU + WHR
			+ COL_PRT_MENU_APP_ID + EQM;
	public static final String DEL_APP_TOOLBARS = DEL + TABLE_PRT_TOOLBARS
			+ WHR + COL_PRT_TOOLBARS_APP_ID + EQM;
	public static final String DEL_APP_ACTIONS = DEL + TABLE_PRT_ACTIONS + WHR
			+ COL_PRT_ACTIONS_APP_ID + EQM;
	public static final String DEL_APP_IMAGES = DEL + TABLE_PRT_APP_IMAGES
			+ WHR + COL_PRT_APP_IMAGES_APP_ID + EQM;
	public static final String DEL_APP_LIBRARIES = DEL + TABLE_PRT_APP_LIBRARY
			+ WHR + COL_PRT_APP_LIBRARY_APP_ID + EQM;
	public static final String DEL_APP_RESOURCES = DEL
			+ TABLE_PRT_APP_RESOURCES + WHR + COL_PRT_APP_RESOURCES_APP_ID
			+ EQM;
	public static final String DEL_APP_LANGS = DEL + TABLE_PRT_APP_LANG + WHR
			+ COL_PRT_APP_LANG_ID + EQM;

}
