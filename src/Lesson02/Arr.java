import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Arr {

    private String[][] stringArr;

    public Arr(String[][] stringArr) {
        this.stringArr = stringArr;
    }

    public int getResult() throws MyArraySizeException, MyArrayDataException {

        if (stringArr.length != 4)
            throw new MyArraySizeException("An array of a different size than 4", stringArr.length);
        int index = 0;
        int result = 0;
        for (String[] strings : stringArr) {
            if (strings.length != 4) throw new MyArraySizeException("Each array must be 4 in length!", strings.length);
            for (String e : strings) {
                index++;
                try {
                    result += Integer.parseInt(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                    System.out.println(e + " is not an integer in a cell " + index);
                }
            }
        }
        return result;
    }
}
