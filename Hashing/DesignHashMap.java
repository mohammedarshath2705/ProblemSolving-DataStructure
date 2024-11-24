package Hashing;

import java.util.Arrays;

public class DesignHashMap {
    private int[] data = new int[1000001];

    public DesignHashMap() {
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }

    public static void main(String[] args) {
        DesignHashMap myHashMap = new DesignHashMap();
        myHashMap.put(1, 10);
        myHashMap.put(2, 20);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(3));
        myHashMap.put(2, 25);
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2));
    }
}
