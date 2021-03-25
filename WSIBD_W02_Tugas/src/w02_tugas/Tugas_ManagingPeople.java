/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w02_tugas;

/**
 *
 * @author dania
 */
public class Tugas_ManagingPeople {
    public static void main(String[] args) {
        Tugas_ManagingPeople_Person p1 = new Tugas_ManagingPeople_Person ("Arial", 37);
        Tugas_ManagingPeople_Person p2 = new Tugas_ManagingPeople_Person ("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
