package Evaluation;

//import java.util.ArrayList;

public class MinTurnNode {
	public int value;
	//ArrayList<MinTurnNode> children;
	public MinTurnNode north;
	public MinTurnNode south;
	public MinTurnNode west;
	public MinTurnNode east;
	public int r,c;
	public int minpath = -1;
	
	public MinTurnNode(){
		
	}
	public MinTurnNode( int r, int c,int num) {
		this.value = num;
		this.r = r;
		this.c = c;
	}
	
	/*
	public void setParent(MinTurnNode c, MinTurnNode p) {
		c.parent = p;
	}
	
	public void setChildren(MinTurnNode par, MinTurnNode child) {
		
			par.children.add(child);
		
	}
	*/

}
