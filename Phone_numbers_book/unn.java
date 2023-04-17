package Phone_numbers_book;

import java.util.Scanner;

public class unn {
    static Scanner in = new Scanner(System.in);
    public static void controls(String control) {
        while(control != "End") {
            switch(control) {
                case "Open":
                    System.out.println(book.PN);
                    break;
                case "Write":
                    book.Check(in.nextLine());
                    break;
                case "Person":
                    System.out.print("Number: ");
                    System.out.println(book.getMan(in.nextInt()));
                    break;
                case "Delete":
                    System.out.print("Number: ");
                    System.out.print(book.deletePos(in.nextInt()));
                    break;
                case "Restore":
                    System.out.print("Number: ");
                    book.restorePos(in.nextInt());
                    break;
                case "Clear cache":
                    book.clearCache();
                    break;
            }
            control = in.nextLine();
        }
    }
}
