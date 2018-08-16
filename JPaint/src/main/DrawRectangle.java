package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import model.ShapeType;
import view.gui.PaintCanvas;

public class DrawRectangle implements IShape
{
	private int height, width;
	private int x, y;
	Graphics2D graphics;
	Color color;
	private ShapeConfig currentShape;
	Rectangle rectangle;
	private PaintCanvas canvas;
	
	public DrawRectangle(int x, int y, int height, int width,
			PaintCanvas canvas, ShapeConfig currentShape)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.currentShape = currentShape;
		this.canvas = canvas;
		this.graphics = canvas.getGraphics2D();
		rectangle = new Rectangle(x, y, height, width);
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public Color getColor()
	{
		return color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public Rectangle getRectangle()
	{
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle)
	{
		this.rectangle = rectangle;
	}

	public PaintCanvas getCanvas()
	{
		return canvas;
	}

	public void setCanvas(PaintCanvas canvas)
	{
		this.canvas = canvas;
	}
    public void setXArr(int index, int newValue) {

    }

    public void setYArr(int index, int newValue) {

    }

    public int getXIndex(int index) {
        return 0;
    }
    public int getYIndex(int index) {
        return 0;
    }
	
	public void drawRectangle()
	{
		switch(currentShape.getCurrentShadingType())
		{
		case FILLED_IN:
			graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
			graphics.fillRect(x, y, height, width);
			graphics.drawRect(x, y, height, width);
			break;
			
		case OUTLINE:
			graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
			graphics.setStroke(new BasicStroke(5));
			graphics.drawRect(x, y, height, width);
			break;
			
		case OUTLINE_AND_FILLED_IN:
			graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
			graphics.fillRect(x, y, height, width);
			graphics.setStroke(new BasicStroke(5));
			graphics.setColor(ShapeColorMap.get(currentShape.getCurrentSecondaryColor()));
			graphics.drawRect(x, y, height, width);
			break;
			
		default : 
			break;
		}
	}

	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Graphics2D getGraphics()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShapeType getActiveShape()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
