package programming.chapter10.recursion;

import java.util.Arrays;

public class Exercise10p9 {
    public static void main(String[] args) {
        Moor8 m = new Moor8(5, 5, 0.5);
        Traversal8 t = new Traversal8(m);
        t.search();
        System.out.println(t);
    }
}

class Moor8 {

    private boolean[][] moor;

    public Moor8(int rows, int columns, double probLand) {
        moor = new boolean[rows][columns];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < columns; c++)
                moor[r][c] = (Math.random() < probLand);
    }

    public int getNumRows() {
        return moor.length;
    }

    public int getNumColumns() {
        return moor[0].length;
    }

    public boolean land(int r, int c) {
        return (r >= 0) && (r < moor.length) &&
                (c >= 0) && (c < moor[0].length) &&
                moor[r][c];
    }

    public String toString() {
        String res = "";
        for (int r = 0; r < moor.length; r++) {
            for (int c = 0; c < moor[0].length; c++)
                res = res + (moor[r][c] ? "*" : "o");
            res = res + "\n";
        }
        return res;
    }
}


class Traversal8 {

    private int[] traversal;
    private Moor8 moor;
    private boolean found;
    private boolean[][] visited;

    public Traversal8(Moor8 m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        Arrays.fill(traversal, -1);
        visited = new boolean[moor.getNumRows()][moor.getNumColumns()];
        found = traverseMoor(moor, traversal, visited);
    }

    public Moor8 moor() {
        return moor;
    }

    public boolean existsTraversal() {
        return found;
    }

    public int length() {
        if (found)
            return traversal.length;
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public int step(int i) {
        if (found)
            return traversal[i];
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor().getNumColumns(); j++) {
                if (moor.land(i, j)) {
                    if (traversal[j] == i) str.append("# ");
                    else str.append("* ");
                } else str.append("O ");
            }
            str.append("\n");
        }
        str.append("===================== \n");
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor().getNumColumns(); j++) {
                if (moor.land(i, j)) {
                    str.append("* ");
                } else str.append("O ");
            }
            str.append("\n");
        }
        return String.valueOf(str);
    }


    // auxiliary methods

    private static boolean traverseMoor(Moor8 m, int[] path) {

        if (searchTraversal(m, m.getNumRows() / 2, m.getNumColumns() / 2, path)) return true;

        return false;
    }
    private static boolean traverseMoor(Moor8 m, int[] path, boolean[][] visited) {

        if (searchTraversal(m, m.getNumRows() / 2, m.getNumColumns() / 2, path, visited)) return true;

        return false;
    }

    private static boolean searchTraversal(Moor8 m, int r, int c, int[] path) {
        if (!m.land(r, c))
            return false;
        else {
            path[c] = r;
            if (c == m.getNumColumns() - 1)
                return true;
            else
                return searchTraversal(m, r - 1, c + 1, path) ||
                        searchTraversal(m, r, c + 1, path) ||
                        searchTraversal(m, r + 1, c + 1, path);
        }
    }

    private static boolean searchTraversal(Moor8 m, int r, int c, int[] path, boolean[][] visited) {
        if (!m.land(r, c) || visited[r][c])
            return false;

        visited[r][c] = true;
        path[c] = r;

        if (c == m.getNumColumns() - 1 || c == 0 || r == 0 || r == m.getNumRows())
            return true;

        return searchTraversal(m, r + 1, c - 1, path, visited) ||
                searchTraversal(m, r + 0, c - 1, path, visited) ||
                searchTraversal(m, r - 1, c - 1, path, visited) ||
                searchTraversal(m, r - 1, c + 0, path, visited) ||
                searchTraversal(m, r + 1, c + 0, path, visited) ||
                searchTraversal(m, r - 1, c + 1, path, visited) ||
                searchTraversal(m, r + 0, c + 1, path, visited) ||
                searchTraversal(m, r + 1, c + 1, path, visited)
                ;
    }

    public void search() {
        traverseMoor(moor, traversal);
    }
}
