package main;

import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;

public class ShapeConfig
{
	private Vertex activePointsPressed;
	private Vertex activePointReleased;
	private ShapeType activeShapeType;
	private ShapeColor activePrimaryColor;
	private ShapeColor activeSecondaryColor;
	private ShapeShadingType activeShadingType;
	
	public ShapeConfig(ShapeType currentShape,
			ShapeColor currentPrimaryColor,
			ShapeColor currentSecondaryColor,
			ShapeShadingType currentShadingType)
	{
		this.activeShapeType = currentShape;
		this.activePrimaryColor = currentPrimaryColor;
		this.activeSecondaryColor = currentSecondaryColor;
	}

	public Vertex getCurrentPointPressed()
	{
		return activePointsPressed;
	}

	public void setCurrentPointPressed(Vertex currentPointPressed)
	{
		this.activePointsPressed = currentPointPressed;
	}

	public Vertex getCurrentPointReleased()
	{
		return activePointReleased;
	}

	public void setCurrentPointReleased(Vertex currentPointReleased)
	{
		this.activePointReleased = currentPointReleased;
	}

	public ShapeType getCurrentShape()
	{
		return activeShapeType;
	}

	public void setCurrentShape(ShapeType currentShape)
	{
		this.activeShapeType = currentShape;
	}

	public ShapeColor getCurrentPrimaryColor()
	{
		return activePrimaryColor;
	}

	public void setCurrentPrimaryColor(ShapeColor currentPrimaryColor)
	{
		this.activePrimaryColor = currentPrimaryColor;
	}

	public ShapeColor getCurrentSecondaryColor()
	{
		return activeSecondaryColor;
	}

	public void setCurrentSecondaryColor(ShapeColor currentSecondaryColor)
	{
		this.activeSecondaryColor = currentSecondaryColor;
	}

	public ShapeShadingType getCurrentShadingType()
	{
		return activeShadingType;
	}

	public void setCurrentShadingType(ShapeShadingType currentShadingType)
	{
		this.activeShadingType = currentShadingType;
	}
	
}
