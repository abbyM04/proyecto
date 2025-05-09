package parcial.veterinaria.service.impl;

import parcial.veterinaria.entities.ConsultorioEntity;
import parcial.veterinaria.repository.ConsultorioRepository;
import parcial.veterinaria.service.IConsultorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultorioImpl implements IConsultorio {


        @Autowired
        private ConsultorioRepository consultorioRepository;

        @Override
        public List<ConsultorioEntity> findAll() {
            return consultorioRepository.findAll();
        }

        @Override
        public ConsultorioEntity save(ConsultorioEntity consultorio) {
            return consultorioRepository.save(consultorio);
        }

        @Override
        public Optional<ConsultorioEntity> findById(Long id) {
            return consultorioRepository.findById(id);
        }

        @Override
        public void deleteById(Long id) {
            consultorioRepository.deleteById(id);
        }

}


