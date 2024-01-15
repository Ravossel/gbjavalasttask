class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String toString() {
        return "Orange";
    }
}

public class fruits {
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> box = new Box<>();
        box.put(new Apple());
        box.put(new Orange());
        return box;
    }

    public static void printBox(Box<? extends Fruit> box) {
        System.out.println("Box contains: " + box.get().toString());
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
}
