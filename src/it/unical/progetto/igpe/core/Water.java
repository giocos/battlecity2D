package it.unical.progetto.igpe.core;

public class Water extends TmpWall {

	public Water(int x, int y, World world) {
		super(x, y, world, true, false);
	}

	@Override
	public String toString() {
		return " ~~ ";
	}

}
