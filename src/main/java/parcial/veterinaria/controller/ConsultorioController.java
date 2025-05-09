package parcial.veterinaria.controller;

import parcial.veterinaria.entities.ConsultorioEntity;
import parcial.veterinaria.service.IConsultorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/process")
public class ConsultorioController {

    @Autowired
    private IConsultorio iConsultorio;

    // Obtener todos los consultorios
    @Transactional(readOnly = true)
    @GetMapping("/consultorios")
    public List<ConsultorioEntity> getConsultorios() {
        return iConsultorio.findAll();
    }

    // Guardar un nuevo consultorio
    @Transactional
    @PostMapping("/consultorios")
    public ConsultorioEntity saveConsultorio(@RequestBody ConsultorioEntity consultorio) {
        return iConsultorio.save(consultorio);
    }

    // Obtener un consultorio por ID
    @Transactional(readOnly = true)
    @GetMapping("/consultorios/{id}")
    public ConsultorioEntity getConsultorioById(@PathVariable Long id) {
        return iConsultorio.findById(id).orElse(null);
    }

    // Actualizar un consultorio por ID
    @Transactional
    @PutMapping("/consultorios/{id}")
    public ResponseEntity<ConsultorioEntity> actualizarConsultorio(@PathVariable Long id, @RequestBody ConsultorioEntity consultorio) {
        Optional<ConsultorioEntity> consultorioExistente = iConsultorio.findById(id);

        if (consultorioExistente.isPresent()) {
            consultorio.setId(id); // Asegurar que el ID sea correcto
            ConsultorioEntity consultorioActualizado = iConsultorio.save(consultorio);
            return ResponseEntity.ok(consultorioActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un consultorio por ID
    @Transactional
    @DeleteMapping("/consultorios/{id}")
    public ResponseEntity<Void> eliminarConsultorio(@PathVariable Long id) {
        Optional<ConsultorioEntity> consultorioExistente = iConsultorio.findById(id);

        if (consultorioExistente.isPresent()) {
            iConsultorio.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}