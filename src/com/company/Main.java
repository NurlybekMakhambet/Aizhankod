package com.company;

import java. util.ArrayList;

public class Main {

    public static void main (String[] args) {

        ArrayList<String> people = new ArrayList<String> ();
        // тізімге бірқатар элементтерді қосыңыз
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // 1 индексі бойынша элементті қосыңыз

        System.out.println(people.get(1));// біз 2-ші нысанды аламыз
        people.set(1, "Robert"); // 2-ші объект үшін жаңа мәнді орнату

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // элементтің болуын тексеріңіз
        if(people.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }

        // бірнеше нысанды жойыңыз
        // нақты элементті жою
        people.remove("Robert");
        // индекс бойынша жою
        people.remove(0);
        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }
    }
}   // алгоритм күрделілігі О(1)
