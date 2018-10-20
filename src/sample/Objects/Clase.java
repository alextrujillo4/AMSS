package sample.Objects;

import java.awt.*;
import java.util.ArrayList;

public class Clase {

    private int id;
    private String name;
    private String grupo;
    private Image image;
    private ArrayList<String> temas;


    public Clase(){

    }

    public Clase(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ArrayList<String> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<String> temas) {
        this.temas = temas;
    }
    public void addTema(String tema) {
        temas.add(tema);
    }
}
