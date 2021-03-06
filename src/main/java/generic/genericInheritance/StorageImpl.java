package generic.genericInheritance;

// 제네릭 구현 클래스
public class StorageImpl<T> implements Storage<T>{

    private T[] array;

    public StorageImpl(int capacity){
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
