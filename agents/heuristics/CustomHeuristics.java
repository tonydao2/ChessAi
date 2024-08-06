package hw2.agents.heuristics;

import hw2.chess.search.DFSTreeNode;

public class CustomHeuristics
{

	/**
	 * TODO: implement me! The heuristics that I wrote are useful, but not very good for a good chessbot.
	 * Please use this class to add your heuristics here! I recommend taking a look at the ones I provided for you
	 * in DefaultHeuristics.java (which is in the same directory as this file)
	 */
	public static double getHeuristicValue(DFSTreeNode node)
	{
		// please replace this!
		return DefaultHeuristics.getHeuristicValue(node);
	}

}
