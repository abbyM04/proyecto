package parcial.veterinaria.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import parcial.veterinaria.entities.ConsultaEntity;
import parcial.veterinaria.entities.ConsultorioEntity;
import parcial.veterinaria.service.IConsulta;

import java.util.List;
@RestController
@RequestMapping("/process")

public class ConsultaController {

    @Autowired
    private IConsulta iconsulta;

    @Transactional(readOnly = true)
    @GetMapping("/consultas")
    public List<ConsultaEntity> getProductos() {
        return iconsulta.findAll();
    }

    @Transactional
    @PostMapping("/consultas")
    public ConsultaEntity saveConsulta(@RequestBody ConsultaEntity consulta) {
        return iconsulta.save(consulta);
    }
}
