/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author PHOTON
 */
public class Move {
    private final String name;
	private Move strongAgainst;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return this.name;
	}
	public Move getStrongAgainst(){
		return this.strongAgainst;
	}
	public void setStrongAgainst(Move strongAgainst){
		this.strongAgainst = strongAgainst;
	}
    public static int compareMoves(Move m1, Move m2){
		// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
		if(m1.getStrongAgainst() ==  m2) return 0;
		else if (m2.getStrongAgainst() == m1) return 1;
		else return 2;
	}
}
