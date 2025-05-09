package parcial.veterinaria.service;

import parcial.veterinaria.entities.ConsultaEntity;
import parcial.veterinaria.entities.ConsultorioEntity;

import java.util.List;

public interface IConsulta {

    List<ConsultaEntity> findAll();

    ConsultaEntity save(ConsultaEntity consulta);
}

