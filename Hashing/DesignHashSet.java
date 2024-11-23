package Hashing;

class MyHashSet {
    private boolean[] data = new boolean[1000001];

    public MyHashSet() {
    }

    public void add(int key) {
        data[key] = true;
    }

    public void remove(int key) {
        data[key] = false;
    }

    public boolean contains(int key) {
        return data[key];
    }
}

public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj.contains(10));  // true
        System.out.println(obj.contains(15));  // false
        obj.remove(10);
        System.out.println(obj.contains(10));  // false
    }
}
