package by.academy.lesson11.set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Минск");
        treeSet.add("Брест");
        treeSet.add("Могилев");
        treeSet.add("Гродно");
        treeSet.add("Гомель");
        treeSet.add("Минск");

        System.out.println(treeSet);
    }
}