package br.com.zup.edu.nossozenity.controller;

import br.com.zup.edu.nossozenity.controller.ZupperResponse;
import br.com.zup.edu.nossozenity.repository.ZupperRepository;
import br.com.zup.edu.nossozenity.zupper.Zupper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequestMapping("/detalhaZupper")
@RestController
public class DetalhaZupperController {

    private final ZupperRepository zupperRepository;

    public DetalhaZupperController(ZupperRepository zupperRepository) {
        this.zupperRepository = zupperRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZupperResponse> detalhar(@PathVariable Long id) {

        Zupper zupper = zupperRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "Zupper não encontrado"));

        return ResponseEntity.ok(new ZupperResponse(zupper));


    }
}
