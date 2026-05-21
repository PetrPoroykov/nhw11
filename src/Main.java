import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.addAll(firstClients);

//            customerQueue.offer("Petya");
//            customerQueue.offer("Olya");
//            customerQueue.offer("Tanya");

//            customerQueue.poll();

        while (!customerQueue.isEmpty()) {
            String currentСlient = customerQueue.poll();
            System.out.println(currentСlient + " сделал новый маникюр");
            if (Math.random() < 0.5) {
// друг записался
                customerQueue.offer("a friend of " + currentСlient);
                System.out.println("Плюс новый клиент!!!");
//            } else {
// друг не записался
            }
            System.out.println(customerQueue);
        }
    }
}
