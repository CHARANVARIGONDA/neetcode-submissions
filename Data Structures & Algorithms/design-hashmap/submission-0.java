class MyHashMap {
int []array1;
int [] array2;
    public MyHashMap() {
        array1=new int[1000001];
        array2=new int[1000001];
    }
    
    public void put(int key, int value) {
        array1[key]=1;
        array2[key]=value;
    }
    
    public int get(int key) {
        if(array1[key]==1){
            return array2[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        array1[key]=0;
        array2[key]=0;
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */