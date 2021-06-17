package cn.sylen.utils;


import java.util.Collection;
import java.util.LinkedList;

/**
 * 1. Complete below function
 * 2. Complete unit test
 * 3. Both plain Java project,Spring project are acceptable
 * 4.The simpler the better,but It's welcome to have more complex implementation
 *      but reasonable for special scenario and consideration
 * 5.Developer should make code checked into github or e.coding.net public repository
 *      and return me by mail so that l can access directly from HSBC network
 */
public class LinkedListSortUtils {

//    private LinkedList<Integer> sortedList = new LinkedList<>();

    public static Collection<Integer> addElement(int element, Collection<Integer> targetList) {
        // Insert element and make sure sortedList is always sorted.
        if (null == targetList || targetList.isEmpty()) {
            targetList = new LinkedList<>();
            targetList.add(element);
            return targetList;
        }
        LinkedList<Integer> sortedList = new LinkedList<>(targetList);
        sortedList.addFirst(element);
        fixSort(sortedList);
        return sortedList;
    }

    private static void fixSort(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i ++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (null == list.get(j) || null == list.get(j + 1)) {
                    if (null != list.get(j)) {
                        Integer temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                } else if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
