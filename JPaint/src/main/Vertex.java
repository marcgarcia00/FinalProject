package main;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
	//Keep track of position of mouse's coordinate location
	private int x;
	private int y;
	private List<Integer> vertices = new ArrayList<Integer>();
	
	public Vertex(int x, int y)
	{
		this.x = x;
		this.y = y;
		vertices.add(x);
		vertices.add(y);
	}
	//Return list of vertices that have been added to List
	public List<Integer> getVertices()
	{
		return vertices;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}
