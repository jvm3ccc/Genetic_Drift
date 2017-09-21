package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    static String input = "9 3 1 6 5 -2 4 -7 8 9";
    static String numbers[] = input.split(" ");

    static ArrayList<Integer> allInput = new ArrayList<>();
    //static ArrayList<Integer> negInput = new ArrayList<>();
    //static ArrayList<Integer> posInput = new ArrayList<>();

    static ArrayList<Integer> orientiertesPaar = new ArrayList<>();

    public static void main(String[] args) {

        for (String s : numbers) {
            int n = Integer.parseInt(s);
            allInput.add(n);
	        /*if (n < 0){
	            negInput.add(n);
            } else {
	            posInput.add(n);
            }
        }

        posInput.remove(0);
*/
            allInput.remove(0);

            level1();
        }
    }

    public static void level1() {

        for (int i = 0; i < allInput.size(); i++){
           // int j = i;
          //while (j < allInput.size()){

            for (int j = i; j < allInput.size(); j++){

                if((allInput.get(i) > 0 && allInput.get(j) < 0) || (allInput.get(i) < 0 && allInput.get(j) > 0)) {

                    int x = allInput.get(i);
                    int y = allInput.get(j);

                    int xi = Math.abs(x);
                    int xj = Math.abs(y);

                    int ergebnis = xi - xj;

                    if (ergebnis == 1 || ergebnis == -1) {
                        ArrayList<Integer> pair = new ArrayList<>();

                        orientiertesPaar.add(xi);
                        orientiertesPaar.add(xj);
                    }

                }


//              if (allInput.get(i) > 0 && allInput.get(j) < 0
//                      && (Math.abs(allInput.get(i)) - Math.abs(allInput.get(j)) == 1)
//                    ||
//                      allInput.get(i) > 0 && allInput.get(j) < 0
//                              && (Math.abs(allInput.get(i)) - Math.abs(allInput.get(j)) == -1)
//                ){
//                  orientiertesPaar.add(allInput.get(i));
//                  orientiertesPaar.add(allInput.get(j));
//              }

          }
        }


        // Sortieren oida
        /*Collections.sort(posInput);

        for(Integer i : posInput) {
            for(Integer j : negInput) {

                int xi = Math.abs(i);
                int xj = Math.abs(j);

                int ergebnis = xi - xj;

                if (ergebnis == 1 || ergebnis == -1) {
                    ArrayList<Integer> pair = new ArrayList<>();

                    orientiertesPaar.add(i);
                    orientiertesPaar.add(j);
                }
            }
        }
        */

        int anzahlPaare = orientiertesPaar.size() / 2;
        System.out.print(anzahlPaare + " ");

        for(Integer i : orientiertesPaar) {
            System.out.print(i + " ");
        }

    }

    private class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
