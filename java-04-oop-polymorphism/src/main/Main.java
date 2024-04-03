package main;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("T là động vật");
    }

    protected String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String dogTail;
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu gâu, T là " + getName());
    }
}

class Cat extends Animal {
    String catTail;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Eo Eo, T là " + getName());
    }

    public void climb(){
        System.out.println("Trèo tường");
    }
}

class Main {
    public static void main(String[] args) {
        // Đa hình
        //Upcasting
        Dog temp = new Dog("Rô béo");
        Animal dog = (Animal) temp;
        //Upcasting
        Animal cat = new Cat("Mòe béo");
        System.out.println(dog.getClass());
        System.out.println(cat.getClass());
        //Lúc này biến dog và cat sẽ chỉ sử dụng được các hàm có ở class cha do đã được ép kiểu về Animal
        dog.makeSound();
        cat.makeSound();


        Animal cat2 = new Cat("Rô béo");
        //cat2.climb(); => Không được
        ((Cat)cat2).climb();
    }
}





























