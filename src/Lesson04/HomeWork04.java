import java.util.*;

public class HomeWork04 {
    public static void main(String[] args) {

        String[] teams = {"NaVi", "Gambit", "Vitality", "G2", "FaZe", "Gambit", "Heroic",
                "NaVi", "Vitality", "NaVi", "Vitality", "G2", "Gambit", "G2", "NIP"};
        System.out.println("Начальный массив: " + Arrays.asList(teams));

        Set<String> teamsUnique = new HashSet<>(Arrays.asList(teams));
        System.out.println("Список уникальных слов: " + teamsUnique);

        Map<String, Integer> teamsRepeat = new HashMap<>();
        for (String team : teams) {
            if (teamsRepeat.containsKey(team)) {
                teamsRepeat.put(team, teamsRepeat.get(team) + 1);
            } else {
                teamsRepeat.put(team, 1);
            }
        }
        System.out.println("Список повторяющихся слов: " + teamsRepeat);

        System.out.println("=====================");

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Юмиян", "+995543223351");
        telephoneDirectory.add("Дюран", "+995554723351");
        telephoneDirectory.add("Кауэр", "+995545433351");
        telephoneDirectory.add("Дюран", "+9955438763351");
        telephoneDirectory.add("Кауэр", "+995549873351");

        System.out.println(telephoneDirectory.get("Дюран"));
        System.out.println(telephoneDirectory.get("Юмиян"));
        System.out.println(telephoneDirectory.get("Кауэр"));
    }
}