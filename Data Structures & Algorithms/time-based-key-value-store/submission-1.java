class TimeMap {
    class Pair{
        int time;
        String val;
        Pair(int time, String val){
            this.time = time;
            this.val = val;
        }
    }
    HashMap<String,ArrayList<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        ArrayList<Pair> list = map.get(key);
        int left = 0;
        int right = list.size() - 1;
        String str = "";
        while(left <= right){
            int mid = left + (right - left)/2;
            if(list.get(mid).time <= timestamp){
                str = list.get(mid).val;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return str;
    }
}
