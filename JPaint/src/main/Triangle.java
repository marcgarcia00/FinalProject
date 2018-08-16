package main;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import model.ShapeType;
import view.gui.PaintCanvas;

public class Triangle implements IShape
{
	private ShapeConfig currentShape;
	Graphics2D graphics;
	int x, y;
	int height, width;
	Rectangle rectangle;
	int[] xVertices, yVertices;

	public Triangle(int x, int y, int height, int width, 
			PaintCanvas canvas, ShapeConfig currentShape)
	{
		this.currentShape = currentShape;
		this.graphics = canvas.getGraphics2D();
		this.x = currentShape.getCurrentPointPressed().getX();
		this.y = currentShape.getCurrentPointPressed().getY();
		this.height = height;
		this.width = width;
		this.rectangle = new Rectangle(x, y, height, width);
		this.xVertices = new int[] { currentShape.getCurrentPointPressed().getX(),
				currentShape.getCurrentPointReleased().getX(), currentShape.getCurrentPointReleased().getX() };
		this.yVertices = new int[] { currentShape.getCurrentPointPressed().getY(),
				currentShape.getCurrentPointReleased().getY(), currentShape.getCurrentPointReleased().getX() };
	}

	@Override
	public void draw() {
		switch(currentShape.getCurrentShadingType())
		{
			case FILLED_IN:
				
				graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
				graphics.fillPolygon(xVertices, yVertices, 3);
				break;
				
			case OUTLINE:
				
				graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
				graphics.setStroke(new BasicStroke(5));
				graphics.drawPolygon(xVertices, yVertices, 3);
				break;
			case OUTLINE_AND_FILLED_IN:
		
				graphics.setColor(ShapeColorMap.get(currentShape.getCurrentPrimaryColor()));
				graphics.fillPolygon(xVertices, yVertices, 3);
				graphics.setStroke(new BasicStroke(5));
				graphics.setColor(ShapeColorMap.get(currentShape.getCurrentSecondaryColor()));
				graphics.drawPolygon(xVertices, yVertices, 3);
			default: 
				break;
		}
	}

	@Override
	public Graphics2D getGraphics()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setX(int x)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ShapeType getActiveShape()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setXArr(int index, int newValue)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setYArr(int index, int newValue)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getXIndex(int index)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYIndex(int index)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
