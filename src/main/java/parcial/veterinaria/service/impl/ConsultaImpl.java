package parcial.veterinaria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial.veterinaria.entities.ConsultaEntity;
import parcial.veterinaria.entities.ConsultorioEntity;
import parcial.veterinaria.repository.ConsultaRepository;
import parcial.veterinaria.service.IConsulta;

import java.util.List;
@Service

public class ConsultaImpl implements IConsulta {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public List<ConsultaEntity> findAll() {
        return consultaRepository.findAll();
    }

    @Override
    public ConsultaEntity save(ConsultaEntity consulta) {
        return consultaRepository.save(consulta);
    }

}
