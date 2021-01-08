package orangetalents.bank.orangebank.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.*;
import org.apache.tomcat.jni.Local;
import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
 public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "Digite seu nome completo com pelo menos 5 catactéres.")
    @Size(min = 5)
    private String nome;
    @Column(unique = true)
    @NotNull
    @Email(message = "Digite um e-mail válido")
    private String email;
    @Column(unique = true)
    @NotNull
    @CPF(message = "Digite um número de CPF válido.")
    private String cpf;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;


}
