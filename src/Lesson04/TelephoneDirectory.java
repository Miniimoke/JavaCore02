import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneNumberList = new ArrayList<>();
        if (phoneBook.containsKey(lastName)) {
            phoneNumberList = phoneBook.get(lastName);
            phoneNumberList.add(phoneNumber);
            System.out.println("Абоненту " + lastName + " добавлен номер: " + phoneNumber);
        } else {
            phoneNumberList.add(phoneNumber);
            phoneBook.put(lastName, phoneNumberList);
            System.out.println("В список добавлен новый абонент. " + lastName + ": " + phoneNumber);
        }
    }

    public String get(String lastName) {
        return "Абоненту " + lastName + " в справочнике принадлежит номер: " + phoneBook.get(lastName);
    }
}

