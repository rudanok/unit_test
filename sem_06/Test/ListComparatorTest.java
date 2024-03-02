import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListComparatorTest {

    @Test
    public void testCompareLists_FirstListGreater() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0);
        ListComparator comparator = new ListComparator();
        assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_SecondListGreater() {
        List<Double> list1 = Arrays.asList(1.0, 2.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
        ListComparator comparator = new ListComparator();
        assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_ListsEqual() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
        ListComparator comparator = new ListComparator();
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_EmptyLists() {
        List<Double> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        ListComparator comparator = new ListComparator();
        assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_OneEmptyList() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = new ArrayList<>();
        ListComparator comparator = new ListComparator();
        assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }
}