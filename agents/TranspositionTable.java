import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.cwru.sepia.util.Direction;

import java.util.*;

import hw2.agents.heuristics.DefaultHeuristics.DefensiveHeuristics;
import hw2.agents.heuristics.DefaultHeuristics.OffensiveHeuristics;
import hw2.chess.game.history.History;
import hw2.chess.game.Board;
import hw2.chess.game.Game;
import hw2.chess.game.move.CaptureMove;
import hw2.chess.game.move.Move;
import hw2.chess.game.move.MoveType;
import hw2.chess.game.move.MovementMove;
import hw2.chess.game.move.PromotePawnMove;
import hw2.chess.game.piece.Pawn;
import hw2.chess.game.piece.Piece;
import hw2.chess.game.piece.PieceType;
import hw2.chess.game.piece.Queen;
import hw2.chess.game.planning.Planner;
import hw2.chess.search.DFSTreeNode;
import hw2.chess.utils.Coordinate;
import hw2.chess.utils.Pair;
import hw2.chess.game.player.Player;
import hw2.chess.game.player.PlayerType;

public class TranspositionTable {
    private final Map<Double, Game> table;

    public TranspositionTable() {
        this.table = new HashMap<>();
    }

}
