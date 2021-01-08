package orangetalents.bank.orangebank.Service;

import orangetalents.bank.orangebank.Domain.Cadastro;
import orangetalents.bank.orangebank.Repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

    @Autowired
    CadastroRepository cadastroRepository;

    public  Optional<Cadastro> findById(Integer id){
        return cadastroRepository.findById(id);
    }
    public Cadastro save(Cadastro cadastro) {

        return cadastroRepository.save(cadastro);

    }
    public List<Cadastro> findAll(){
        return cadastroRepository.findAll();
    }
}
