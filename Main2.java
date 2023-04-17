import java.io.IOException;
import java.util.Scanner;

import Name_sort.sorter;
import Phone_numbers_book.book;
import Phone_numbers_book.unn;
public class Main2 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите номер желаемого задания. Введите 0 для выхода.");
    int e = (Integer.parseInt(in.nextLine()));
    while(e != 0) {
    switch (e) {
        case 1:
            book.addBook();
            System.out.println("Книга создана");
            unn.controls(in.nextLine());
            break;
        case 2:
            sorter.function();
            break;
    }
    System.out.println("Введите номер желаемого задания. Введите 0 для выхода.");
    e = in.nextInt();
    }
    }
    
}