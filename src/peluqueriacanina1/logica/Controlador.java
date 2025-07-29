package peluqueriacanina1.logica;

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

}
