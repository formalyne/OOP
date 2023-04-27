public class Methods {

    static Integer sum(int k, int a) {
        int sum = 0;
        if (k > a) {
            System.out.println("Numerele sunt introduse în ordinea greșită");
            return sum;
        } else if (k == a) {
            return k;
        }

        for (int i = k; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static void sum(int j) {

        if (j > 0) {
            int sum = 0;
            int i = 0;
            while (j >= i) {
                sum = sum + i;
                i++;
            }
            System.out.println(sum);
        }


    }

}
