package cn.sylen.test;

import cn.sylen.utils.LinkedListSortUtils;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListTest extends TestCase {

    @Test
    public void testLinkedList1() {

        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(null);
        list.add(null);
        list.add(1);
        list.add(-991);
        list = (List<Integer>) LinkedListSortUtils.addElement(3, list);
        assertTrue(printList(list));

    }

    @Test
    public void testLinkedList2() {

        List<Integer> list = null;
        list = (List<Integer>) LinkedListSortUtils.addElement(3, list);
        assertTrue(printList(list));

    }

    @Test
    public void testLinkedList3() {

        List<Integer> list = new Vector<>();
        list = (List<Integer>) LinkedListSortUtils.addElement(3, list);
        list.addAll(new ArrayList<>());
        list = (List<Integer>) LinkedListSortUtils.addElement(5, list);
        list = (List<Integer>) LinkedListSortUtils.addElement(3, list);
        list.add(-19);
        list = (List<Integer>) LinkedListSortUtils.addElement(6, list);
        list = (List<Integer>) LinkedListSortUtils.addElement(3, list);
        list.add(2, 800);
        list = (List<Integer>) LinkedListSortUtils.addElement(8, list);
        assertTrue(printList(list));

    }

    @Test
    public void testLinkedList4() {

        Integer[] arr = {-2, 9, 29, -12, 9, 0, -2, 763, -1, 0};
        List<Integer> list = Arrays.asList(arr);
        list = (List<Integer>) LinkedListSortUtils.addElement(6, list);
        assertTrue(printList(list));

    }

    @Test
    public void testLinkedList5() {

        List<Integer> list = new ArrayList<>();
        assertTrue(printList(list));

    }

    @Test
    public void testLinkedList6() {

        Integer[] arr = {-2, 9, 29, -12, 9, 0, -2, 763, -1, 0};
        List<Integer> list = Arrays.asList(arr);
        assertTrue(printList(list));

    }

    private boolean printList(List<? extends Integer> list) {
        if (null == list || list.isEmpty()) {
            System.out.println("list is empty");
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
            if (list.size() > (i + 1)) {
                if (null == list.get(i) || null == list.get(i + 1)) {
                    if (null != list.get(i)) {
                        return false;
                    }
                } else if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }

        }
        return flag;
    }
}
