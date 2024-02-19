package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1636_Sort_Array_by_Increasing_Frequency {


    static class Node implements Comparable{
        int freq;
        int value;

        public Node(int freq, int value) {
            this.freq = freq;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Node){
                Node other = (Node)o;
                if(this.freq == other.freq){
                    return -Integer.compare(this.value, other.value);
                }
                return Integer.compare(this.freq, other.freq);
            }
            return 0;
        }
    }

    public static int[] frequencySort(int[] a){
        int[] counts = new int[200 + 1];

        for (int i = 0; i < a.length; i++) {
            counts[a[i]+100]++;
        }


        List<Node> mList = new ArrayList<>();
        // Thêm vào tập Node lưu trữ
        for (int i = 0; i <= 200; i++) {
            if(counts[i] > 0){
                Node newNode = new Node(counts[i], i-100);
                mList.add(newNode);
            }
        }

        Collections.sort(mList);

        int[] result = new int[a.length];
        int index = 0;
        for(Node node : mList) {
            int freq = node.freq;
            int value = node.value;
            for (int i = 0; i < freq; i++) {
                result[index++] = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        arr = frequencySort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
