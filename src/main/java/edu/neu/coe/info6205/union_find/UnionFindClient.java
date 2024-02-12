package edu.neu.coe.info6205.union_find;
import java.util.Random;

public class UnionFindClient {
    public static void main(String[] args) {
        int n = 100;
        while (n < 10000007) {
            System.out.println("No.of sites " + n + " No. of pairs created " + count(n));
            n = n * 4;
        }
    }

    public static int count(int n) {
        UF_HWQUPC uf = new UF_HWQUPC(n);
        Random rand = new Random();
        int count = 0;
        while (uf.components() != 1) {
            int i = rand.nextInt(n);
            int j = rand.nextInt(n);
            count++;
            if (!uf.isConnected(i, j)) {
                uf.union(i, j);
            }
        }
        return count;
    }

}
