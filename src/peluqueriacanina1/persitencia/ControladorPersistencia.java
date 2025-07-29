/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina1.persitencia;

import peluqueriacanina1.logica.Dueño;
import peluqueriacanina1.logica.Mascota;

/**
 *
 * @author cafu1
 */
public class ControladorPersistencia {

  DueñoJpaController dueñoJpa = new DueñoJpaController();
  MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Dueño dueño, Mascota masco) {
        // crear en la bd el dueño
      dueñoJpa.create(dueño);

//crear en al bd mascota
      mascotaJpa.create(masco);



    }




}
