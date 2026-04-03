//package HashSet;
//
//import java.util.LinkedList;
//
//public class HashMapImplementation {
//    static class MYHashMap<K, V>{
//        public static final int DEFAULT_CAPACITY= 4;
//        public static final float DEAFULT_LOAD_FACTOR= 0.75f;
//        private class Node{
//           K key;
//           V value;
//           Node(K key, V value){
//               this.key= key;
//               this.value= value;
//           }
//
//           private int n;
//           LinkedList<Node>[] buckets;
//
//           private void initBuckets(int N){
//               buckets= new LinkedList[N];
//               for(int i= 0; i< buckets.length; i++){
//                   buckets[i]= new LinkedList<>();
//               }
//           }
//
//           private int HashFunc(K key){
//               int hc= key.hashCode();
//           }
//
//           public void MYHashMap(){
//               initBuckets(DEFAULT_CAPACITY);
//           }
//
//           public int size(){
//               return n;
//           }
//
//           public void put(){
//               int bi=
//           }
//
//           public V get(){}
//
//           public V remove(){}
//        }
//    }
//
//    public static void main(String[] args){
//        MYHashMap<String, Integer> obj= new MYHashMap<>();
//    }
//}
