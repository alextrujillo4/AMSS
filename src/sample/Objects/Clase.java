package sample.Objects;

import java.awt.*;
import java.util.ArrayList;

public class Clase {

    private int id;
    private String name;
    private String imageUrl;
    private ArrayList<String> temas;


    public Clase(){

    }

    public Clase(String name,String imageUrl, ArrayList<String>  temas){
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Clase(String name, ArrayList<String>  temas){
        this.name = name;
        this.temas = temas;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImage(String  imageUrl) {
        this.imageUrl = imageUrl;
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
