import java.util.Random;
import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task1 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> random_list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            random_list.add(random.nextInt(1, 100));
        }
        System.out.println("Дан список: " + random_list);

        int i = 0;
        while (i < random_list.size()) {
            if (random_list.get(i) % 2 == 0) {
                random_list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println("Список результат: " + random_list);
    }
}