package HashTable.DesignHashMap;

import java.util.ArrayList;

public class _706_Design_HashMap {

    private class Data{
        int key;
        int value;
        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data){
                return this.key == ((Data)obj).key;
            }
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBucket[];

    _706_Design_HashMap(){
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key){
        return key % 1000;
    }

    public void put(int key, int value){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >=0 ){
            bucket.get(keyIndex).value = value;
        }else{
            bucket.add(newData);
        }
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data myDelData = new Data(key, 0);
        int keyIndex = bucket.indexOf(myDelData);
        if(keyIndex >=0 ){
            bucket.remove(myDelData);
        }
    }

    public int get(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);

        if (keyIndex>=0){
            return bucket.get(keyIndex).value;
        }

        return -1;
    }

    public static void main(String[] args) {
        _706_Design_HashMap myHashMap = new _706_Design_HashMap();
        myHashMap.put(1,1);
        System.out.println("myHashMap.get(1): " + myHashMap.get(1));
        myHashMap.put(1,2);
        System.out.println("myHashMap.get(1): " + myHashMap.get(1));
        myHashMap.put(2,10);
        myHashMap.remove(1);
        System.out.println("myHashMap.get(1): " + myHashMap.get(1));
    }
}
