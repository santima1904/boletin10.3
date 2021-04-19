package ejercicio1.clases;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
  private List<Alquiler> alquileres = new ArrayList<Alquiler>();


  /**
   *Metodo para anhadir elementos a la lista
   */
  public void anhadirElemento(List alquileres, Alquiler a){
      alquileres.add(a);
  }


}
