package collectionFramework.map.binaryTree.comporableComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String[] args) {
        /*
        class collectionFramework.map.binaryTree.comporableComparator.Fruit cannot be cast to class java.lang.Comparable
        TreeSet<Fruit> treeSet = new TreeSet<>();
        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("watermelon", 10000));
        treeSet.add(new Fruit("strawberry", 6000));*/

        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
        treeSet.add(new Fruit("grape", 3000));
        treeSet.add(new Fruit("watermelon", 10000));
        treeSet.add(new Fruit("strawberry", 6000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + "   " + fruit.price);
        }

    }
}
