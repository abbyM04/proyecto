package parcial.veterinaria.service;

import parcial.veterinaria.entities.ConsultorioEntity;
import java.util.List;
import java.util.Optional;

public interface IConsultorio {
    List<ConsultorioEntity> findAll();

    ConsultorioEntity save(ConsultorioEntity consultorio);

    // Obtener por ID
    Optional<ConsultorioEntity> findById(Long id);

    // Eliminar por ID
    void deleteById(Long id);
}