package HashTable.DesignHashSet;

import java.util.ArrayList;

public class _705_Design_HashSet {

    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];

    _705_Design_HashSet(){
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    // return hashValue
    public int hashFunction(int key){
        return key % SIZE;
    }

    public void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        if (bucket.indexOf(key) < 0){
            bucket.add(key);
        }
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >=0 ){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        _705_Design_HashSet myHashSet = new _705_Design_HashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(1);
        System.out.println("myHashSet.contains(1): " + myHashSet.contains(1));
        myHashSet.remove(1);
        System.out.println("myHashSet.contains(1): " + myHashSet.contains(1));
    }
}
