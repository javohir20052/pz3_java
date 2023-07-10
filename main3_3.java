//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой
// планеты и количество его повторений в списке. Collections.frequency(list, item)


import java.util.*;

public class main3_3 {

    public static void main(String[] args) {
        List<String> listPlanet = listPlanetAdd(300);
        System.out.println(listPlanet);
        System.out.println("Меркурий: " + Collections.frequency(listPlanet, "Меркурий"));
        System.out.println("Венера: " + Collections.frequency(listPlanet, "Венера"));
        System.out.println("Земля: " + Collections.frequency(listPlanet, "Земля"));
        System.out.println("Марс: " + Collections.frequency(listPlanet, "Марс"));
        System.out.println("Юпитер: " + Collections.frequency(listPlanet, "Юпитер"));
        System.out.println("Сатурн: " + Collections.frequency(listPlanet, "Сатурн"));
        System.out.println("Уран: " + Collections.frequency(listPlanet, "Уран"));
        System.out.println("Нептун: " + Collections.frequency(listPlanet, "Нептун"));
        System.out.println("Плутон: " + Collections.frequency(listPlanet, "Плутон"));
    }

    static List<String> listPlanetAdd(int count) {
        Map<Integer, String> dict = new HashMap<Integer, String>();
        dict.put(1, "Меркурий");
        dict.put(2, "Венера");
        dict.put(3, "Земля");
        dict.put(4, "Марс");
        dict.put(5, "Юпитер");
        dict.put(6, "Сатурн");
        dict.put(7, "Уран");
        dict.put(8, "Нептун");
        dict.put(9, "Плутон");
        List<Integer> keyList = new ArrayList<Integer>(dict.keySet());
        Random random = new Random();
        List list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomKey = keyList.get(random.nextInt(keyList.size()));
            list.add(dict.get(randomKey));
        }
        return list;
    }
}

