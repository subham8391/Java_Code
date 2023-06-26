package Array_hashing;

 class DesignHashSet {
     int size = (int)Math.pow(10,6)+1;
    boolean[] flag;
    public DesignHashSet() {
        flag = new boolean[size];
    }
    
    public void add(int key) {
        flag[key] = true;
    }
    
    public void remove(int key) {
        flag[key]=false;
    }
    
    public boolean contains(int key) {
        return flag[key];
    }
}
