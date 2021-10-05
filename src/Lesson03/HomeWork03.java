import java.util.Arrays;

public class HomeWork03 {

    public static void main(String[] args) {

//      Задача 1
        System.out.println("====== Задание 1 ======");

        Integer[] intArr = new Integer[2];

        intArr[0] = 8;
        intArr[1] = 3;

        System.out.println("Элементы массива: " + Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println("Результат замены: " + Arrays.deepToString(intArr));

//      Задача 2
        System.out.println("====== Задание 2 ======");

        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();

        System.out.println("Кладу фрукты в корзину:");

        apple1.addFruit(new Apple(),1);
        apple2.addFruit(new Apple(),2);
        orange1.addFruit(new Orange(),3);
        orange2.addFruit(new Orange(),4);

        System.out.println("Box 1: " + orange1.getWeight() + "f");
        System.out.println("Box 2: " + orange2.getWeight() + "f");
        System.out.println("Box 3: " + apple1.getWeight() + "f");
        System.out.println("Box 4: " + apple2.getWeight() + "f");

        System.out.println("Сравниваю корзины:");

        System.out.println("Box 1 = box 3: " + orange1.compare(apple1));
        System.out.println("Box 2 = box 4: " + orange2.compare(apple2));

        System.out.println("Высчитываю вес корзину");

        System.out.println("Box 1: " + orange1.getWeight() + "f");
        System.out.println("Box 2: " + orange2.getWeight() + "f");
        System.out.println("Box 3: " + apple1.getWeight() + "f");
        System.out.println("Box 4: " + apple2.getWeight() + "f");

        System.out.println("Пересыпаю фрукты из корзины в корзину");

        orange1.pour(orange2);
        apple1.pour(apple2);

        System.out.println("Конец");
    }

    public static void swap(Object[] arr, int index1, int index2) {

        Object swp = arr [index1];
        arr[index1] = arr[index2];
        arr[index2] = swp;
    }
}