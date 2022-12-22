import java.util.LinkedList;

// Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список.

public class Zadacha_1 {
    public static void main(String[] args) {
        LinkedList<Integer> my_links = new LinkedList<Integer>();
        my_links.add(5);
        my_links.add(2);
        my_links.add(1);
        my_links.add(4);
        my_links.add(3);
        System.out.println(my_links);
        LinkedList<Integer> newLinks = new LinkedList<Integer>();
        for (int j = my_links.size() - 1; j >= 0; j--)
            newLinks.add(my_links.get(j));
        System.out.println(newLinks);
    }
}
