/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author cafu1
 */
@Entity
public class Dueño implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE )
private int id_dueño;
private String nombre;
private String celDueño;

    public Dueño() {
    }

    public Dueño(int id_dueño, String nombre, String celDueño) {
        this.id_dueño = id_dueño;
        this.nombre = nombre;
        this.celDueño = celDueño;
    }

    public int getId_dueño() {
        return id_dueño;
    }

    public void setId_dueño(int id_dueño) {
        this.id_dueño = id_dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDueño() {
        return celDueño;
    }

    public void setCelDueño(String celDueño) {
        this.celDueño = celDueño;
    }
    





}
