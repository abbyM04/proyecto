package parcial.veterinaria.service;

import parcial.veterinaria.entities.ClienteEntity;
import parcial.veterinaria.entities.ConsultorioEntity;

import java.util.List;

public interface ICliente {

    List<ClienteEntity> findAll();

    ClienteEntity save(ClienteEntity cliente);
}
