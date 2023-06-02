package Task.T31;


import java.util.*;

public class Collection {
    public static void main(String[] args) {
        int number = 0;
        int contain = 9;
        System.out.println("----------------LIST-----------------");
        System.out.println("");
        System.out.println(".............ARRAYLIST...............");
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("ADDING NUMBERS IN ARRAYLIST:");
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }

        System.out.println(num);
        System.out.println();
        num.remove(number);
        System.out.println("AFTER REMOVED " + number + " INDEX:");
        System.out.println(num);
        System.out.println();
        Boolean flag = num.contains(contain);
        System.out.println("Value " + contain + " is contain:- " + flag);
        num.set(0, 1);
        System.out.println("AFTER SET METHOD:");
        System.out.println(num);
        System.out.println("AFTER REVERSING: ");
        java.util.Collections.reverse(num);
        System.out.println(num);
        System.out.println("AFTER SORTING: ");
        java.util.Collections.sort(num);
        System.out.println(num);
//        System.out.println("");
//        System.out.println();
        System.out.println("...............LINKEDLIST.............");
        LinkedList<Integer> variable = new LinkedList<>();
        System.out.println("ADDING NUMBERS IN ARRAYLIST:");
        for (int i = 1; i <= 10; i++) {
            variable.add(i);
        }
        System.out.println(variable);
        System.out.println();
        variable.remove(number);
        System.out.println("AFTER REMOVED " + number + " INDEX:");
        System.out.println(variable);
        System.out.println();
        Boolean flag1 = variable.contains(contain);
        System.out.println("Value " + contain + " is contain:- " + flag1);
        variable.set(0, 1);
        System.out.println("AFTER SETTING:");
        System.out.println(variable);
        System.out.println("");
        System.out.println();
        System.out.println();
        System.out.println("--------------------SET----------------");
        System.out.println();
        System.out.println("..................HASHSET..............");
        HashSet<String> set = new HashSet<>();
        set.add("DHAYAA");
        set.add("TAMIL");
        set.add("BHUVANA");
        set.add("SURIYA");
        System.out.println(set);
        System.out.println("AFTER REMOVING:");
        set.remove("DHAYAA");
        System.out.println(set);
        System.out.println("DHAYAA CONTAINS IN THE SET:- " + set.contains("DHAYAA"));
//        System.out.println();
        System.out.println("..............LINKEDHASHSET..............");
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("DHAYAA");
        set1.add("TAMIL");
        set1.add("BHUVANA");
        set1.add("SURIYA");
        System.out.println(set1);
        System.out.println("AFTER REMOVING:");
        set1.remove("DHAYAA");
        System.out.println(set1);
        System.out.println("DHAYAA CONTAINS IN THE SET:- " + set1.contains("DHAYAA"));
        System.out.println();
        System.out.println();
        System.out.println("--------------------QUEUE----------------");
        System.out.println();
        System.out.println(".................PRIORITYQUEUE...........");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("DHAYAA");
        queue.add("TAMIL");
        queue.add("BHUVANA");
        queue.add("SURIYA");
        queue.add("UDHAYAA");
        System.out.println("HEAD:" + queue.element());
//        System.out.println("HEAD:"+queue.peek());
        System.out.println("ITERATED ELEMENTS:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
//        System.out.println();
        System.out.println(".................DEQUEUE...........");
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("UDHAYA");
        deque.offer("DHAYAA");
        deque.offer("SURIYA");

        deque.offerFirst("DEVAN");
        System.out.println("AFTER OFFERFIRST...");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("AFTER POLLLAST...");
        for(String s:deque){
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------MAP----------------");
        System.out.println();
        System.out.println("..................HASHMAP..............");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Dhaayaa");
        map.put(2, "TAMIL");
        map.put(3, "BHUVANA");
        map.put(4, "SURIYA");
        map.put(1, "Dhayaa");
        System.out.println(map);
        map.putIfAbsent(5, "DEVAN");
        System.out.println("AFTER INVOKING PutIfAbsent Method");
        System.out.println(map);
        map.remove(1);
        System.out.println("AFTER REMOVING KEY 1");
        System.out.println(map);
        map.replace(5, "NITHYASRI");
        System.out.println("AFTER REPLACING ");
        System.out.println(map);
//        System.out.println();
        System.out.println("..............LINKED HASHMAP............");
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
        map1.put(1, "DHAYAA");
        map1.put(2, "DEVAN");
        map1.put(3, "VIJAY");
        System.out.println("Keys: " + map1.keySet());
        System.out.println("Values: " + map1.values());
        System.out.println("Key-Value pairs: " + map1.entrySet());
        System.out.println("BEFORE REMOVING " + map1);
        map1.remove(2);
        System.out.println("AFTER REMOVING " + map1);
        System.out.println(map1);
        System.out.println("MAP IS EMPTY..?:- " + map1.isEmpty());
        map1.clear();
        System.out.println("MAP IS EMPTY..?:- " + map1.isEmpty());
    }
}
