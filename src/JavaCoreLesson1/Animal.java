package JavaCoreLesson1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Animal {

    public int age;
    public int weight;

    public void breathe() {
        System.out.println("*Breathing*");
    }

    public void swim(){}
    public void walk(){}
    public void speak(){
        System.out.println("Издать звук");
    }
}
