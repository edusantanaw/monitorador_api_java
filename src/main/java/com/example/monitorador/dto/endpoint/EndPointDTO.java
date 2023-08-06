package com.example.monitorador.dto.endpoint;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EndPointDTO {
    @NotBlank()
    public String route;
    @NotBlank()
    public String userId;
    public String headers;
}
