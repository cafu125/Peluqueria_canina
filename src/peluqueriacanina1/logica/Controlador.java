package peluqueriacanina1.logica;

import java.util.List;
import peluqueriacanina1.persitencia.ControladorPersistencia;

/**
 *
 * @author cafu1
 */
public class Controlador {
    
ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String alergico, String aespecial, String nombreDue, String celularDue, String oserbaciones) {
        
         //creamos y asignamos valores en dueño
        Dueño dueño = new Dueño();
dueño.setNombre(nombreDue);
dueño.setCelDueño(celularDue);

         //creamos y asignamos valores masocta
         Mascota masco = new Mascota();
         masco.setNombre_mascota(nombreMasco);
         masco.setColor(color);
         masco.setRaza(raza);
         masco.setAlergico(alergico);
         masco.setAtencion_especial(aespecial);
         masco.setObservaciones(oserbaciones);
         masco.setUnDueño(dueño);

              
           controlPersis.guardar(dueño,masco);


    }

    public List<Mascota> traerMascota() {
         return controlPersis.traerMascota();
    }

    public void borrarMascota(int num_cliente) {
      
                   controlPersis.borrarMascota( num_cliente);

    }

    public Mascota traerMascota(int num_cliente) {
            
       return controlPersis.traerMascota(num_cliente);

        
    }

    public void mdificarMascota(Mascota masco, String nombreMasco, String raza, String color, String alergico, String aespecial, String nombreDue, String celularDue, String oserbaciones) {
                   //seteo valores mascota
                masco.setNombre_mascota(nombreMasco);
                masco.setRaza(raza);
                masco.setColor(color);
                masco.setAlergico(alergico);
                masco.setAtencion_especial(aespecial);
                                 
                //modifica mascota
                 controlPersis.mdificarMascota(masco);
                              // seteo valores dueño
                    Dueño dueño = this.buscarDueño(masco.getUnDueño().getId_dueño());
                      dueño.setNombre(nombreDue);
                      dueño.setCelDueño(celularDue);
                   //llamar al modifico dueño
                this.modificarDueño(dueño);
                  
    }

    private Dueño buscarDueño(int id_dueño) {
            
          return controlPersis.traerDueño(id_dueño);       

    }

    private void modificarDueño(Dueño dueño) {
        controlPersis.modificarDueño(dueño);
    }

    

}
