import multiplicationarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 6};
        int product = 1, flag = 0;

        for (int i = 0; i < 4; i++) {
            if (arr[i] != 0) {
                product = product * arr[i];
            } else {
                flag = 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            if ((arr[i] != 0) && (flag == 1)) {
                System.out.print(0 + " ");
            } else if ((arr[i] != 0) && (flag == 0)) {
                System.out.print(product / arr[i] + " ");
            } else if ((arr[i] == 0) && (flag == 1)) {
                System.out.print(product + " ");
            }
        }
    }
}

