import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
/**
 * This class runs a world that contains dancing bugs.
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
	ActorWorld world = new ActorWorld();
	BoxBug alice = new DancingBug([6, 10, 12]);
	alice.setColor(Color.ORANGE);
	BoxBug bob = new DancingBug([3, 4, 5]);
	world.add(new Location(7, 8), alice);
	world.add(new Location(5, 5), bob);
	world.show();
    }
}
