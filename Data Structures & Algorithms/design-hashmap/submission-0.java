class MyHashMap {

    class Node{
        int key;
        int value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int size = 1000;
    private LinkedList<Node>[] list;

    public MyHashMap() {
        list = new LinkedList[size];
    }
    
    public int hash(int key){
        return key % size;
    }

    public void put(int key, int value) {
        int index = hash(key);

        if(list[index] == null){
            list[index] = new LinkedList();
        }

        for(Node node : list[index]){
            if(node.key == key){
                node.value = value;
                return;
            }
        }
        list[index].add(new Node(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);

        if(list[index] != null){
            for(Node node : list[index]){
                if(node.key == key){
                    return node.value;
                }
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);

        if(list[index] != null){
            list[index].removeIf(node -> node.key == key);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */