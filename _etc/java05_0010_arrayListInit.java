package _etc;

import java.util.ArrayList;

public class java05_0010_arrayListInit {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("가나다");
        arrayList.add("마바사");
        System.out.println(arrayList.get(0));
        arrayList.add(0, "abc");
        System.out.println(arrayList.get(0));
    }
}
