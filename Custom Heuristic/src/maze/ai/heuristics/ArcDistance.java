package maze.ai.heuristics;

import maze.ai.core.BestFirstHeuristic;
import maze.core.MazeExplorer;

public class ArcDistance implements BestFirstHeuristic<MazeExplorer> {

	// Uses the arc length between the goal node and the current node.
	// The Euclidean Distance is first calculated, which tells us the
	//non-obstructed distance between the current node and goal node.
	//We then imagine a circle running through each point and find the length
	//of the arc between the two points.
	//The Arc Length uses the angle between the two points divided by 360.
	//Because we always find the distance between x and y between the current and goal nodes,
	//and then apply the pythagorem theorem, we always end up with a hypoteneuse.
	//If we draw a circle between the ends of the hypotenuse we get double the radius,
	//running in a straight line meaning the angle between the two of them is 180.
	//the formula for finding the arc length is always  theta/360 multiplied by 2*pi*radius.
	//2*radius is the same as hypoteneuse h and 180/360 is 0.5 therefore
	// we can use the formula 0.5*3.14*sqrt(x^2+ y^2). This will find the arc distance between
	//the current node and the goal node.
	@Override
	public int getHeuristic(MazeExplorer node, MazeExplorer goal) {

		double x = node.getLocation().X() - goal.getLocation().X();
		double y = node.getLocation().Y() - goal.getLocation().Y();

		double z = Math.sqrt(x * x + y * y);
		return (int) (0.5 * Math.PI * z);
	}
}
