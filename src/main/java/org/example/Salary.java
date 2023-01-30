package org.example;

import java.util.*;
import java.io.*;
/*
В отделе работают 3 сотрудника, которые получают заработную плату в
рублях. Требуется определить: на сколько зарплата самого
высокооплачиваемого из них отличается от самого низкооплачиваемого.
* */

public class Salary {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int differenc;
        int count;
        String str;
        FileReader file = new FileReader("input.txt");
        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
            list.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(list);
        count = list.size();
        differenc = list.get(count-1) - list.get(0);

        FileWriter fileOut = new FileWriter(("output.txt"));
        fileOut.write(String.valueOf(differenc));
        fileOut.close();
    }
}