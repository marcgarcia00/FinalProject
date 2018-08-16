package main;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

import controller.IJPaintController;
import controller.JPaintController;
import model.persistence.ApplicationState;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.interfaces.IGuiWindow;
import view.interfaces.IUiModule;

public class Main
{
	public static void main(String[] args)
	{
		PaintCanvas canvas = new PaintCanvas();
		IGuiWindow guiWindow = new GuiWindow(canvas);
		IUiModule uiModule = new Gui(guiWindow);
		ApplicationState appState = new ApplicationState(uiModule);
		IJPaintController controller = new JPaintController(uiModule, appState);
		controller.setup();
	}

}
