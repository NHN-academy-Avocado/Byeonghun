package programming.chapter10.recursion;

public class Exercise10p7 {
    public static void main(String[] args) {
        Moor m = new Moor(5, 8, 0.7);
        Traversal t = new Traversal(m);
        t.search();
        System.out.println(t);
    }
}

class Moor {

    private boolean[][] moor;

    public Moor(int rows, int columns, double probLand) {
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


class Traversal {

    private int[] traversal;
    private Moor moor;
    private boolean found;
    private boolean[][] visited;

    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        visited = new boolean[moor.getNumRows()][moor.getNumColumns()];
        found = traverseMoor(moor, traversal);
    }

    public Moor moor() {
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
        for (int j = 0; j < moor.getNumRows(); j++) {
            for (int i = 0; i < moor().getNumColumns(); i++) {
                if (traversal[i] == j) str.append("# ");
                else if (moor.land(i, j)) str.append("* ");
                else str.append("O ");
            }
            str.append("\n");
        }
        str.append("===================== \n");
        return String.valueOf(str);
    }


    // auxiliary methods

    private static boolean traverseMoor(Moor m, int[] path) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal(m, row, 0, path)) return true;
        }

        return false;
    }

        private static boolean searchTraversal(Moor m, int r, int c, int[] path) {
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
    private static boolean searchTraversal(Moor m, int r, int c, int[] path, boolean[][] visited) {
        if (!m.land(r, c) || visited[r][c])
            return false;

        visited[r][c] = true;
        path[c] = r;

        if (c == m.getNumColumns() - 1)
            return true;

        return searchTraversal(m, r - 1, c + 1, path, visited) ||
                searchTraversal(m, r, c + 1, path, visited) ||
                searchTraversal(m, r + 1, c + 1, path, visited);
    }

    public void search() {
        traverseMoor(moor, traversal);
    }
}
