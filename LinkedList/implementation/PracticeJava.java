import java.util.LinkedList;

public class PracticeJava {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);

        LinkedList<Integer> mergedList = merge(list1, list);
        System.out.println(mergedList);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> list,
                                            LinkedList<Integer> list1) {
        int count1 = 0, count2 = 0;
        LinkedList<Integer> mergedList = new LinkedList<>();
        while (count1 != list.size() && count2 != list1.size()) {
            if (list.get(count1) < list1.get(count2)) {
                mergedList.add(list.get(count1));
                count1++;
            } else {
                mergedList.add(list1.get(count2));
                count2++;
            }
        }
        if (count1 != list.size()) {
            for (int i = count1; i < list.size(); i++) {
                mergedList.add(list.get(i));
            }
        } else if (count2 != list1.size()) {
            for (int i = count2; i < list1.size(); i++) {
                mergedList.add(list1.get(i));
            }
        }
        return mergedList;
    }
}
