/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina1.persitencia;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import peluqueriacanina1.logica.Dueño;
import peluqueriacanina1.logica.Mascota;
import peluqueriacanina1.persitencia.exceptions.NonexistentEntityException;



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

    public List<Mascota> traerMascota() {
     return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente)   {
                   
             try{
          mascotaJpa.destroy(num_cliente);
     }catch(NonexistentEntityException ex ){
        Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     } 
              
      
         }

    public Mascota traerMascota(int num_cliente) {
        
             return mascotaJpa.findMascota(num_cliente);

    }

    public void mdificarMascota(Mascota masco) {
         try {
        mascotaJpa.edit(masco);
 } catch(Exception ex){
           Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE,null,ex);
}
    }

    public Dueño traerDueño(int id_dueño) {
        return  dueñoJpa.findDueño(id_dueño);
    }

    public void modificarDueño(Dueño dueño) {
                 try {
            dueñoJpa.edit(dueño);
        } catch(Exception ex){
           Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE,null,ex);
}
    }
              }
