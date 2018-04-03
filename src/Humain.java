/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Humain {
    
    protected String nom ;
    protected String prenom;
    protected int age;
    private Humain casadoCon;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Humain getCasadoCon() {
        return casadoCon;
    }

    //epouser
    public void setCasadoCon(Humain casadoCon) {
        this.casadoCon = casadoCon;
        this.casadoCon.casadoCon=this;
    }
    
    public void Matrimonio(Humain casadoCon){
        this.casadoCon = casadoCon;
        
    }
    //Atributo estatico
    //Servicio estático
    public static int ageDifferente(Humain humano1, Humain humano2){
        int ageDiff;
        ageDiff = Math.abs(humano1.getAge()-humano2.getAge());
        return ageDiff;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String mostrarInformacion(){
        return "Nombre: "+ this.getNom() + "\tApellido: "+ this.getPrenom() + "\tEdad: "+ getAge();
    }
    
    public String generoPareja(){
        String cadena="0";
        if (this.getCasadoCon().getClass().getName().equals("Homme")) {
            cadena = "Hombre";
        }
        if (this.getCasadoCon().getClass().getName().equals("Femme")) {
            cadena = "Mujer";
        }
        return cadena;
    }
    
    public String estaCasado(){
        if(this.casadoCon == null){
            return mostrarInformacion()+ " no esta casado/a \n";
        }
        return mostrarInformacion() + "\tCasado/a con: " +this.casadoCon.mostrarInformacion() + "\t su pareja es de genero: "+ this.generoPareja() +"\n";
    }
    
}
