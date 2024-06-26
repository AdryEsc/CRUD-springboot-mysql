
package com.example.servicio;

import com.example.dao.IndividuoDao;
import com.example.entity.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IndividuoServicioImp implements IndividuoServicio{
    
    @Autowired
    private IndividuoDao individuoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Individuo> listarIndividuos() {
        return (List<Individuo>) individuoDao.findAll();
    }

    @Override
    @Transactional
    public void guardarIndividuo(Individuo individuo) {
        individuoDao.save(individuo);
    }

    @Override
    @Transactional
    public void eliminarIndividuo(Individuo individuo) {
        individuoDao.delete(individuo);
    }

    @Override
    @Transactional(readOnly = true)
    public Individuo actualizarIndividuo(Individuo individuo) {
        return individuoDao.findById(individuo.getId_individuo()).orElse(null);
    }
    
}
