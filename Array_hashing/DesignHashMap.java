package Array_hashing;

import java.util.Arrays;

class DesignHashMap {
     int size = (int)Math.pow(10,6)+1;
    int[] flag;
    public DesignHashMap() {
        flag = new int[size];
        Arrays.fill(flag,-1);
    }
    
    public void put(int key, int value) {
        flag[key] = value;
    }
    
    public int get(int key) {
        return flag[key];
    }
    
    public void remove(int key) {
        flag[key]=-1;
    }
}
