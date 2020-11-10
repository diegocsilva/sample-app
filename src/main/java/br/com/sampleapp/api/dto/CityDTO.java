package br.com.sampleapp.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {

    private Long id;

    @NotBlank(message = "O nome da cidade deve ser preenchido!")
    private String name;

    @NotBlank(message = "O nome do estado deve ser preenchido!")
    private String province;

}
