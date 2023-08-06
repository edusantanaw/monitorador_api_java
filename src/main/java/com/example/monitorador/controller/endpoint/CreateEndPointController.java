package com.example.monitorador.controller.endpoint;

import com.example.monitorador.dto.endpoint.EndPointDTO;
import com.example.monitorador.infra.entities.EndPoint;
import com.example.monitorador.services.endpoint.EndPointService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/endpoint")
@AllArgsConstructor
public class CreateEndPointController {

    private final EndPointService endPointService;

    @PostMapping()
    public ResponseEntity create(@Valid @RequestBody EndPointDTO data){
    EndPoint endPoint = this.endPointService.create(data);
    return new ResponseEntity(endPoint, HttpStatus.CREATED);
    }
}
