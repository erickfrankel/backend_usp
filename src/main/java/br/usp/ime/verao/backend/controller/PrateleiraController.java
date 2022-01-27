package br.usp.ime.verao.backend.controller;

import br.usp.ime.verao.backend.entity.PrateleiraEntity;
import br.usp.ime.verao.backend.repository.PrateleiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PrateleiraController {

    @Autowired
    PrateleiraRepository prateleiraRepository;

    @GetMapping("/memes")
    public List<PrateleiraEntity> listaMemes(){
        return prateleiraRepository.findAll();
    }

    @GetMapping("/memes/{id}")
    public PrateleiraEntity listaMemesUnico(@PathVariable(value="id") long id){
        return prateleiraRepository.findById(id);
    }

    @PostMapping("/memes")
    public PrateleiraEntity salvaMeme(@RequestBody PrateleiraEntity prateleiraEntity){
        return prateleiraRepository.save(prateleiraEntity);
    }

    @DeleteMapping("/memes/{id}")
    public void deletaMemeUnico(@PathVariable(value="id") long id){
        prateleiraRepository.deleteById(id);
    }

    @PutMapping("/memes")
    public PrateleiraEntity atualizaMeme(@RequestBody PrateleiraEntity prateleiraEntity) {
        return prateleiraRepository.save(prateleiraEntity);
    }
}
