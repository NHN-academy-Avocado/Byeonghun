package programming.chapter7.arrays_and_matrices;

public class Exercise07p12 {
    public static void main(String[] args) {
        Apartment test = new Apartment(2, 5, "s");
        System.out.println(test.countReg());
        test.input("a");
        test.input("b");
        test.input("h");
        System.out.println(test.getAddress());
        System.out.println(test.apartmentSize());
        System.out.println(test.countReg());
        System.out.println(test.getName(3));
        test.remove(4);
        System.out.println(test.toString());
    }
}

class Apartment {
    int[][] id;
    String[][] name;
    String address;
    int x;
    int y;

    public Apartment(int x, int y, String address) {
        this.id = new int[x][y];
        this.name = new String[x][y];
        this.address = address;
        this.x = x;
        this.y = y;
    }


    public int apartmentSize() {
        return x * y;
    }

    public String getAddress() {
        return this.address;
    }

    public int countReg() {
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (name[i][j] != null) count++;
            }
        }
        return count;
    }

    public void input(String name) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (this.id[i][j] == 0) {
                    this.name[i][j] = name;
                    this.id[i][j] = 1;
                    return;
                }
            }
        }
        System.out.println("정원 초과");
    }

    public String getName(int n) {
        int index = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (index == n) return this.name[i][j];
                index++;
            }
        }
        return null;
    }

    public void remove(int n) {
        int index = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (index == n) {
                    this.name[i][j] = null;
                    this.id[i][j] = 0;
                }
                index++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sb.append((i + 1) + " " + (j + 1) + " (" + this.id[i][j] + "\t" + this.name[i][j] + ")\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
