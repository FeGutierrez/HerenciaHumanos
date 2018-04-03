/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) {
        
        Humain mujer1 = new Femme("Andrea", "Dias", 25);
        Humain mujer2 = new Femme("Daniela", "Sanin", 22);
        
        Humain hombre1 = new Homme("Gonzalo", "Gonzales", 24);
        
        hombre1.setCasadoCon(mujer1);
        
        
        String informacion = hombre1.estaCasado();
        System.out.println(informacion);
        
        System.out.println("MUJER1");
        System.out.println(mujer1.estaCasado());
        
        String informacion2 = mujer2.estaCasado();
        System.out.println(informacion2);
        
        System.out.println("genero pareja");
        System.out.println(hombre1.generoPareja());
//        
//        String informacion2 = mujer1.estaCasado();
//        System.out.println(informacion2);
        
    }
    
}
