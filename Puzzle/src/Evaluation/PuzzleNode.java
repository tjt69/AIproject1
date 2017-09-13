package Evaluation;
/*	Contains value of a single grid box and points to the grid boxes reachable in each direction*/
public class PuzzleNode {
	int val = -1;
	PuzzleNode up = null;
	PuzzleNode down = null;
	PuzzleNode left = null;
	PuzzleNode right = null;
	
	public PuzzleNode(int val, PuzzleNode up,PuzzleNode down,PuzzleNode left,PuzzleNode right){
		this.val = val;
		this.up = up;
		this.down = down;
		this.left =left;
		this.right = right;

	}
	public PuzzleNode(){
		
	}
}
