import java.util.Arrays;

public class Main {
    public static void main(String[] args) {System.out.println("Все задания сделала в одном модуле");
        // Задание 1

       System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        String a =Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        int sumArr = 0;

        for (int i : arr) {
            sumArr += i;

        }
        System.out.println("Сумма трат за месяц составила: "
                + sumArr + " рублей");

        // Задание 2

        System.out.println("Задание 2");
        int maxArr = Integer.MIN_VALUE;
        int minArr = Integer.MAX_VALUE;

        for (int i : arr){
            if (maxArr < i) {
                maxArr = i;
            }
            if (minArr > i) {
                minArr = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: "
                + minArr + " рублей");
        System.out.println("Максимальная сумма трат за день составила: "
                + maxArr + " рублей");

        // Задание 3

        System.out.println("Задание 3");
        float midArr = 0f;

        midArr = (float) sumArr / arr.length;

        System.out.println("Средняя сумма трат за день составила: "
                + midArr + " рублей");

        // Задание 4

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


        }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

