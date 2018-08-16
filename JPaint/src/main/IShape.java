package main;

import java.awt.Graphics2D;
import model.ShapeType;

public interface IShape
{
	void draw();
	public Graphics2D getGraphics();
	void setX(int x);
	void setY(int y);
	public int getX();
	public int getY();
	public ShapeType getActiveShape();
	public void setXArr(int index, int newValue);
	public void setYArr(int index, int newValue);
	public int getXIndex(int index);
	public int getYIndex(int index);
}
