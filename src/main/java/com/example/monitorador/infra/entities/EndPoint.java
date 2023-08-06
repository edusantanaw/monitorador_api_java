package com.example.monitorador.infra.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name="endpoint")
@Entity()
@Data()
@Builder()
@AllArgsConstructor()
@NoArgsConstructor()
public class EndPoint {

    @Column()
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column()
    private String route;
    @Column(name = "user_id")
    private String userId;
    @Column(nullable = true)
    private String headers;
}
