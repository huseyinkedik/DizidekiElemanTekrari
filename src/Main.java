import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            int sayi = list[i];
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] == sayi) {
                    count++;
                }
            }
            if (i == 0 && list[i + 1] == list[i]) {
                System.out.printf(list[i] + " sayısı " + count + " kere tekrar edildi.\n");
            }

            if (i == 0 && list[i + 1] != list[i]) {
                System.out.printf(list[i] + " sayısı " + count + " kere tekrar edildi.\n");
            }

            if (i != 0 && list[i - 1] != list[i]) {
                System.out.printf(list[i] + " sayısı " + count + " kere tekrar edildi.\n");
            }

        }

    }
}

