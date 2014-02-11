import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength,line;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
	line = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
	if (line ==0){
	    turn();
	    turn();
	    line ++;
	}
        else if (steps < sideLength && canMove())
	    {
		move();
		steps++;
	    }
        else if ((getDirection() == 90) && line < 3){
	    turn();
	    turn();
	    turn();
	    steps = 0;
	    line ++;
	}
	else if (getDirection() == 225){
	    turn();
	    turn();
	    turn();
	    turn();
	    turn();
	    steps =0;
	    line ++;
	}
	else {
	    sideLength = 0;
	}

    }
}

