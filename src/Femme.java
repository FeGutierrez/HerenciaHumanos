/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Femme extends Humain{

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    public int ageDifferente(Humain humano){
        return Math.abs(this.age - humano.getAge());
    }
    
    
}
