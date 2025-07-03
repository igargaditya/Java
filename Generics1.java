// Bounded type paramters
interface printable {
    void print();
}

class myNumber extends Number implements printable {
    private final int number;

    public myNumber(int number) {
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public int intValue() {
        return number;
    }

    @Override
    public long longValue() {

        return number;
    }

    @Override
    public float floatValue() {
        return number;
    }

    @Override
    public double doubleValue() {
        return number;
    }

}

// T can be only replaced by myNumber class
class boundedType<T extends Number & printable> {
    private T item;

    public boundedType(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// INTERFACE AND GENERIC CLASS WITH 2 GENERICS
interface container<K, V> {
    K getKey();

    V getValue();
}

class GenericClass<K, V> implements container<K, V> {

    private K key;
    private V value;

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

// ONE GENERIC
class Box<T> {
    private T value;

    public T getvalue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

// 2 GENERICS CLASS
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

}

public class Generics1 {
    public static void main(String[] args) {
        // int[] arr = new int[5]; // Predefined sized
        // ArrayList is not Type safe and we could get Class Cast Exception
        // List arr1 = new ArrayList() ;

        // Making a box which stores integer
        Box<Integer> box = new Box<>();
        box.setValue(10);
        int result = box.getvalue();
        System.out.println(result);

        // Making a Pair which stores A key value Pair using class generic
        Pair<String, Integer> pair = new Pair<>("Age", 22);
        System.out.println(pair.getKey() + "->" + pair.getValue());

        // Making a pair which stores A key value pair using interface generics
        container<String, Integer> container = new GenericClass<>("Age", 23);
        System.out.println(container.getKey() + "->" + container.getValue());

        myNumber number = new myNumber(10);
        boundedType<myNumber> item = new boundedType<>(number);
        item.getItem().print();
    }
}
