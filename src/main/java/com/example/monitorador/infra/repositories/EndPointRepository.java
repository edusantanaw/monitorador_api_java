package com.example.monitorador.infra.repositories;

import com.example.monitorador.infra.entities.EndPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service()
public interface EndPointRepository extends CrudRepository<EndPoint, UUID> {
    EndPoint findByRoute(String route);
}
