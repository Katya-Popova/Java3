import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i=0; i<10; i++){
            int val =random.nextInt(20);
            list.add(val);
        }
        double sum=0;
        System.out.printf("Список %s\n", list);
        System.out.println("Максимальное число " + Collections.max(list));
        System.out.println("Минимальное число " + Collections.min(list));
        for (int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Среднее арифметическое:" + sum/list.size());
    }
}