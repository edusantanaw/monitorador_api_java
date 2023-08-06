package com.example.monitorador.services.endpoint;

import com.example.monitorador.dto.endpoint.EndPointDTO;
import com.example.monitorador.infra.entities.EndPoint;
import com.example.monitorador.infra.repositories.EndPointRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EndPointService {

    @Autowired
    private final EndPointRepository endPointRepository;

    public EndPoint create(EndPointDTO data) throws Error {
        EndPoint endPointAlreadyRegister = this.endPointRepository.findByRoute(data.route);
        if(endPointAlreadyRegister != null){
            throw  new Error("Rota já registrada!");
        }
        EndPoint endPoint = EndPoint.builder()
                .route(data.route)
                .userId(data.userId)
                .headers(data.getHeaders())
                .build();
         this.endPointRepository.save(endPoint);
        return endPoint;

    }
}
