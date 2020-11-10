package br.com.sampleapp.api.dto;

import br.com.sampleapp.enums.Sex;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long id;

    @NotBlank(message = "O nome do cliente deve ser preenchido!")
    private String name;

    @NotNull(message = "O sexo deve ser preenchido!")
    private Sex sex;

    @ApiParam(value = "birthAt", defaultValue = "2000-01-01")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "A data de nascimento deve ser preenchida!")
    private LocalDate birthAt;

    @NotNull(message = "A idade deve ser preenchido!")
    private Integer age;

    @NotNull(message = "O cidade onde mora deve ser preenchida!")
    private CityDTO livesAt;

}
