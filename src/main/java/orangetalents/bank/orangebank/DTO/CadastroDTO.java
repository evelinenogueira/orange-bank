package orangetalents.bank.orangebank.DTO;

import lombok.Getter;
import orangetalents.bank.orangebank.Domain.Cadastro;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
public class CadastroDTO {

    private Integer id;
    private String nome;
    private String email;

    public CadastroDTO(Cadastro cadastro){

        this.id = cadastro.getId();
        this.nome = cadastro.getNome();
        this.email = cadastro.getEmail();
    }


    public static List<CadastroDTO> convert(List<Cadastro> cadastro) {

        return cadastro.stream().map(CadastroDTO:: new).collect(Collectors.toList());
    }


}
