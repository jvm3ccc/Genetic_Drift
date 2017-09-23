import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main2 {

    public static void main(String[] args) {

        String input = "6 3 1 6 5 -2 4 1 1 -2 4";

        String[] splitInput = input.split(" ");

        //LEVEL 1
        SortedMap<Integer, Integer> sortedInput = new TreeMap<>();


        // LEVEL 1
        for (int j = 1; j < splitInput.length - 1; j++){
            for (int i = j + 1; i < splitInput.length; i++) {
                Integer x = Integer.parseInt(splitInput[j]);
                Integer y = Integer.parseInt(splitInput[i]);

                //one number must be positive, other negative
                if (x >= 0 && y < 0 || x < 0 && y >= 0) {
                    //formula as given by instruction
                    if (Math.abs(x) - Math.abs(y) == -1 || Math.abs(x) - Math.abs(y) == 1) {
                        sortedInput.put(x, y);
                    }
                }
            }
        }


        System.out.print(sortedInput.size() + " ");

        boolean first = true;
        for (Map.Entry<Integer, Integer> entry : sortedInput.entrySet()) {
            if (!first) {
                System.out.print(' ');
            }
            System.out.print(entry.getKey() + " " + entry.getValue());
            first = false;
        }
    }

}
