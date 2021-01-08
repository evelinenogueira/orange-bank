package orangetalents.bank.orangebank.Controller;

import orangetalents.bank.orangebank.DTO.CadastroDTO;
import orangetalents.bank.orangebank.Domain.Cadastro;
import orangetalents.bank.orangebank.Service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    CadastroService cadastroService;


 @GetMapping("/{id}")
 public ResponseEntity<Optional<Cadastro>> Cadastro (@Valid @PathVariable Integer id){
    try {
        return new ResponseEntity<>(cadastroService.findById(id), HttpStatus.OK);
    }catch (NullPointerException e){

        return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
 }
 @PostMapping

 public ResponseEntity<Cadastro> save(@Valid @RequestBody Cadastro cadastro){

     try{
         return new ResponseEntity<>(cadastroService.save(cadastro),HttpStatus.CREATED);

     }catch (Exception e){
         return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
     }
 }
    @GetMapping
    public List<CadastroDTO> findAll() {

        return CadastroDTO.convert(cadastroService.findAll());
    }
}
