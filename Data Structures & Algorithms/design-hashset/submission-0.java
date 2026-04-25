class MyHashSet {
    private int size = 1000;
    private LinkedList<Integer>[] list;

    public MyHashSet() {
        list = new LinkedList[size];
    }
    
    public int hash(int key){
        return key % size;
    }

    public void add(int key) {
        int index = hash(key);

        if(list[index] == null){
            list[index] = new LinkedList<>();
        }

        if(!list[index].contains(key)){
            list[index].add(key);
        }
        
    }
    
    public void remove(int key) {
        int index = hash(key);

        if(list[index] != null){
            list[index].remove((Integer) key);
            return;
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);

        if(list[index] != null){
            return list[index].contains(key);
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */