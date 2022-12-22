// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый 
// элемент из очереди и удаляет его, first() - возвращает первый элемент из 
// очереди, не удаляя.

public class Zadacha_2 {    
    public static void main(String[] args) {
        Last<Integer> new_links = new Last<Integer>();
        new_links.enqueue(1);
        new_links.enqueue(2);   
        new_links.enqueue(3);        
        System.out.println(new_links.getEn());
        System.out.println(new_links.dequeue());
        System.out.println(new_links.getEn());
        System.out.println(new_links.first());
        System.out.println(new_links.getEn());
    }
}
