package eetac.ea;

public class User {
    String num;
    String Nombre;
    public User() {

    }
    public User(String num, String Nombre) {
        this.num = num;
        this.Nombre=Nombre;
    }


    public String getNom() {
        return Nombre;
    }
    public void setNom(String title) {
        this.Nombre = Nombre;
    }
    public String getID() {
        return num;
    }
    public void setID(String title) {
        this.num = num;
    }
}
