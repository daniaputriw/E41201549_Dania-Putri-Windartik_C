/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w02_tugas;

/**
 *
 * @author ASUS
 */
public class Tugas_ManagingPeople_Person {
    
    String name;
    int age;
    
    public Tugas_ManagingPeople_Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName () {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }
    
}
