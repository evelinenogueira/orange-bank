package orangetalents.bank.orangebank.Repository;

import orangetalents.bank.orangebank.Domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {


}
