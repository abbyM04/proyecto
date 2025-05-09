package parcial.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import parcial.veterinaria.entities.VeterinarioEntity;
import parcial.veterinaria.service.IVeterinario;

import java.util.List;

@RestController
@RequestMapping("/process")

public class VeterinarioController {

    @Autowired
    private IVeterinario iveterinario;

    @Transactional (readOnly = true)
    @GetMapping("/veterinarios")
    public List<VeterinarioEntity> getVeterinarios() {
        return iveterinario.findAll();
    }
}