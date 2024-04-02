package main;

class DongVat {
    private String name;

    public DongVat(String name) {
        this.name = name;
    }

    public void tiengKeu() {
        System.out.println("Animal sound");
    }

    protected String getName() {
        return name;
    }
}

class Cho extends DongVat {
    public Cho(String name) {
        super(name);
    }

    @Override
    public void tiengKeu(){
        System.out.println("Gâu gâu, T là " + getName());
    }
}

class Main {
    public static void main(String[] args) {
        Cho roBeo = new Cho("Rô béo");
        roBeo.tiengKeu();
        ((DongVat)roBeo).tiengKeu();
    }
}





























