package collectionFramework.map.binaryTree.comporableComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("z", 45));
        treeSet.add(new Person("a", 25));
        treeSet.add(new Person("c", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + "  " + person.age);
        }
    }
}
