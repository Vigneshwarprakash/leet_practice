class Solution {
public List<List<String>> suggestedProducts(String[] products, String searchWord) {
  PriorityQueue<String> pq = new PriorityQueue<>(3, (s1,s2) -> s1.compareTo(s2)); 
  List<List<String>> list = new ArrayList<>();
  
  for(int i = 1; i<=searchWord.length(); i++){
    String temp = searchWord.substring(0, i);
    for(String s : products){
      if(s.startsWith(temp)){
        pq.offer(s);
      }
    }
    List<String> temp_list = new ArrayList<>();
    for(int j = 0; j<3; j++){
      if(pq.peek() != null){
        temp_list.add(pq.poll());
      }
    }
    pq.clear();
    list.add(temp_list);
  }
  return list;
  }
}