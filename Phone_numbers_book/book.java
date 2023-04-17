package Phone_numbers_book;
import java.util.HashMap;
import java.util.Scanner;

public class book {
    static HashMap<Integer, String> PN;
    static HashMap<Integer, String> Gone;
    static Scanner in = new Scanner(System.in);

    public static void addBook() {
        PN = new HashMap<Integer, String>();
        Gone = new HashMap<Integer, String>();
    }
    
    public static void addPos(int num, String man) {
        PN.put(num, man);
        Check(in.nextLine());
    }

    public static void Check(String check) {
        if(!check.equals("Stop")) {
            try { addPos(Integer.parseInt(check.split(" ")[0]), check.split(" ")[1] + check.split(" ")[2]); }
            catch (Exception e) { System.out.println("Неправильный формат ввода, попробуйте вновь"); Check(in.nextLine()); }
        }
    }

    public static String getMan(int num) {
        if(PN.containsKey(num)) {
            return PN.get(num);
        } else { return "Такого номера нет в списке \n"; }
    }

    public static String deletePos(int num) {
        if(PN.containsKey(num)) {
            Gone.put(num, PN.get(num));
            return (String)PN.remove(num) + " был удалён \n";
        } else { return "Такого номера нет в списке \n"; }
    }

    public static void restorePos(int num) {
        if (Gone.containsKey(num) && !PN.containsKey(num)) {
            PN.put(num, Gone.get(num));
            Gone.remove(num);
        } else if (PN.containsKey(num)) { System.out.println("Этот номер уже есть в списке"); } else { System.out.println("Такого номера нет в мусорке"); }
    }

    public static void clearCache() {
        Gone.clear();
        System.out.println("Очищено");
    }
}
