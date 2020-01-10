package mypractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationRemoval {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        Iterator<String> iterator = arrayList.iterator();
        String e = iterator.next();
        if (e.startsWith("A")) {
            iterator.remove();
            System.out.println(e);
        }

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }


    }
}

