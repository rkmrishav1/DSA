class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num))
                map.put(num, 1);
            else 
                map.put(num, map.get(num) + 1);
        }

        //returning anonymous comaparator object to form max Heap using priority queue
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b) - map.get(a);
            }
        });

        for (int num : map.keySet()){
            heap.add(num);
        }

        int []arr = new int[k];
        for (int i = 0; i < k; i++){
            arr[i] = heap.poll();
        }
        return arr;
    }
}