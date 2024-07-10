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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;
    @Column(name = "name", nullable = false)
    private String participantName;
    @Column(name = "email", nullable = false)
    private String participantEmail;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;
}
