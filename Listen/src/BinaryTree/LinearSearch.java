package BinaryTree;

import java.util.LinkedList;
import java.util.List;

/*
 * Definition: Lineare Suche:
 * Man fängt beim ersten Element der linearen Datenstruktur an zu suchen
 * und macht so lange weiter, bis man entweder die gesuchten Daten gefunden hat oder
 * am Ende der Datenstruktur angekommen ist und nichts gefunden hat.
 * 
 * Source: http://u-helmich.de/inf/kursQ1/folge12/folge12-1.html
 */

public class LinearSearch implements SearchAlgorithms {

    int[] arr = null;
    List<Integer> list = new LinkedList<Integer>();

    public LinearSearch(int[] arr) {
        this.arr = arr;
    }

    public LinearSearch(List<Integer> list) {
        /*
        arr = new int[(list.size()) - 1];
        for (int i = 0; i < list.size() - 1; i++) {
            arr[i] = list.get(i);
        }
        */

        this.list = list;
    }

    public String findAnyValue(int val) {
        int lSerResu = search(val);

        boolean running = true;
        while (running) {

            if (lSerResu != 404) {
                running = false;
                if(arr == null) {
                    return "Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + list.get(lSerResu);
                }else {
                    return "Searched: " + val + " | found i: " + lSerResu + " | lol[i] :" + arr[lSerResu];    
                }
                
            } else {
                System.out.println("findAnyvalue: looking for val: " + val);
                lSerResu = search(val);
                val = val + 1;
            }
        }

        return "however you got here...";

    }

    public int search(int val) {
        if (arr == null) {
            for (int i = list.size() - 1; i > 0; i--) {
                if (val == list.get(i)) {
                    return i;
                }
            }
        } else {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == val) {
                    return i;
                }
            }
        }
        return 404;
    }

}
