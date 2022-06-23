package kgk.main.java.oop.concepts.interfaceconcept;

public interface Drawable {
    int DEFAULT_COUNT = 1;
    void draw();

    default void color(){
        System.out.println("Default color");
    }

    static int cube(int x){return x*x*x;}
}
