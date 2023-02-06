import java.util.Random;
import java.util.ArrayList;
public class task {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i=0; i<10; i++){
            int val =random.nextInt(20);
            list.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list);
        for (int i=0; i<list.size(); i++){
            if (list.get(i)%2==0){
                list.remove(i);
                i--;
            }
            
        }
        System.out.print("Массив нечетных чисел: "+ list);
    }
}
