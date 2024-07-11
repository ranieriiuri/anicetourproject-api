package com.ranieriiuriprojects.anicetour.participant;

import com.ranieriiuriprojects.anicetour.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "participants")
//Abaixo já insere getters e setters por baixo dos panos...
@Getter
@Setter
//Os 2 @ abaixo criam permissões p construir com todos os argumentos e sem nenhum
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    //Constructor q permite criar apenas com email e a própria viagem (trip)
    public Participant(String email, Trip trip){
        this.email = email;
        this.trip = trip;
        this.isConfirmed = false;
        this.name = "";
    }
}
