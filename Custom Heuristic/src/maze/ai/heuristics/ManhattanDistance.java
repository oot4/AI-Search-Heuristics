package maze.ai.heuristics;

import maze.ai.core.BestFirstHeuristic;
import maze.core.MazeExplorer;

//Using the current node and the goal node, the manhattan distance finds the sum
//of the distance between the two points along the axes X and Y.
//
//ie the sum of, the difference between the x coordinate of the current and goal node, and, the y coordinate
//of the current and goal node.
public class ManhattanDistance implements BestFirstHeuristic<MazeExplorer> {

	@Override
	public int getHeuristic(MazeExplorer node, MazeExplorer goal) {

		double x = node.getLocation().X() - goal.getLocation().X();
		double y = node.getLocation().Y() - goal.getLocation().Y();

		return (int) (x + y);
	}
}
