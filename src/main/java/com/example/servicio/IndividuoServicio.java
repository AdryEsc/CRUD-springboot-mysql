
package com.example.servicio;

import com.example.entity.Individuo;
import java.util.List;

public interface IndividuoServicio {
    //Metodo para listar todos los individuos de la base de datos
    public List<Individuo> listarIndividuos();
    
    //Metodo para insertar un individuo en la base de datos
    public void guardarIndividuo(Individuo individuo);
    
    //Metodo para eliminar un individuo de la base de datos
    public void eliminarIndividuo(Individuo individuo);
    
    //Metodo para actualizar indivisuo
    public Individuo actualizarIndividuo(Individuo individuo);
    
}
