import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=1030 lang=java
 *
 * [1030] Matrix Cells in Distance Order
 */
class Solution {
    static boolean[][] bool;

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        bool = new boolean[R][C];
        int[][] result = new int[R * C][2];
        int rLimit = R - 1;
        int cLimit = C - 1;
        int idx = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(r0, c0));
        bool[r0][c0] = true;
        while (!q.isEmpty()) {
            Node current = q.poll();
            int rIdx = current.rIdx;
            int cIdx = current.cIdx;
            int[] add = { rIdx, cIdx };
            result[idx++] = add;
            ArrayList<Node> neighbors = getNeighbors(current, rLimit, cLimit);
            if (!neighbors.isEmpty()) {
                q.addAll(neighbors);
            }
        }
        return result;
    }

    public ArrayList<Node> getNeighbors(Node node, int rLimit, int cLimit) {
        ArrayList<Node> neighbors = new ArrayList<>();
        int r = node.rIdx;
        int c = node.cIdx;
        if (r - 1 >= 0 && !bool[r - 1][c]) {
            neighbors.add(new Node(r - 1, c));
            bool[r - 1][c] = true;
        }
        if (r + 1 <= rLimit && !bool[r + 1][c]) {
            neighbors.add(new Node(r + 1, c));
            bool[r + 1][c] = true;
        }
        if (c - 1 >= 0 && !bool[r][c - 1]) {
            neighbors.add(new Node(r, c - 1));
            bool[r][c - 1] = true;
        }
        if (c + 1 <= cLimit && !bool[r][c + 1]) {
            neighbors.add(new Node(r, c + 1));
            bool[r][c + 1] = true;
        }
        return neighbors;
    }
}

class Node {
    int rIdx;
    int cIdx;

    public Node(int rIdx, int cIdx) {
        this.rIdx = rIdx;
        this.cIdx = cIdx;
    }
}
