import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите номер желаемого задания. Введите 0 для выхода.");
    int e = (Integer.parseInt(in.nextLine()));
    while(e != 0) {
    switch (e) {
        case 1:
            LinkedList<String> s = new LinkedList<>(Arrays.asList(in.nextLine().split(" ")));
            LinkedList<String> st = new LinkedList<>();
            for(int i = 0; i < s.size(); i ++) {
                st.add(s.get(s.size()-i-1));
            }
            System.out.println(st);
            break;
        case 2:
            System.out.println("Мануал по контролю очереди: \n Использовать \"Add \" вместе с нужным объектом для добавления \n Использовать \"Next\" для избавления от первого в очереди \n Использовать \"First\" для отображения первого в очереди \n Использовать \"Queue\" для просмотра очереди");
            LinkedList<String> queue = new LinkedList<>();
            String ord = in.nextLine();
            while(ord != "end") {
                if (ord.contains("Add")) {
                    enqueue(queue, ord.replaceAll("Add ", ""));
                }
                else if (ord.contains("Next")) {
                    System.out.println(dequeue(queue));
                }
                else if (ord.contains("First")) {
                    System.out.println(first(queue));
                }
                else if (ord.contains("Queue")) {
                    System.out.println(queue);
                }
                else { System.out.println("Команда не распознана"); }
            ord = in.nextLine();
            }
            break;
    }
    System.out.println("Введите номер желаемого задания. Введите 0 для выхода.");
    e = in.nextInt();
    }
    }
    static void enqueue(LinkedList<String> list, String o) {
        list.addLast(o);
        System.out.println(o.replaceAll("Add ", "") + " присоединился к очереди");
    }
    static String dequeue(LinkedList<String> list) {
        try {
        String t = list.getFirst();
        list.removeFirst();
        return t + " покидает очередь"; } catch (Exception e) {
            return "В очереди пусто";
        }
    }
    static String first(LinkedList<String> list) {
        try {
        return list.getFirst() + " первый в очереди"; } catch (Exception e) {
            return "В очереди пусто";
        }
    }
}