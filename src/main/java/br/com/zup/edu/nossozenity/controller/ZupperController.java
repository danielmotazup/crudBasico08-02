package br.com.zup.edu.nossozenity.controller;

import br.com.zup.edu.nossozenity.repository.ZupperRepository;
import br.com.zup.edu.nossozenity.zupper.Zupper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/zuppers")
public class ZupperController {

    private final ZupperRepository zupperRepository;

    public ZupperController(ZupperRepository zupperRepository) {
        this.zupperRepository = zupperRepository;
    }

    @PatchMapping("/{idZupper")
    public ResponseEntity<Void> atualizaZupper(@PathVariable Long idZupper, @RequestBody @Valid ZupperResponse zupperResponse) {

        Zupper zupper = zupperRepository.findById(idZupper).orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "zupper não localizado"));


        return ResponseEntity.noContent().build();


    }
}
