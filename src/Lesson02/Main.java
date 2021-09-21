import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Main {

    public static void main (String[] args) {

        Arr arr = new Arr(new String[][] {{"1", "2", "3", "4"}, {"&", "6", "7", "8"}, {"Q", "10", "11", "12"}, {"13", "14", "15", "16", "17"}});
        try {
            System.out.println(arr.getResult());
        } catch (MyArraySizeException | MyArrayDataException sizeException) {
            sizeException.printStackTrace();
        }
    }
}
