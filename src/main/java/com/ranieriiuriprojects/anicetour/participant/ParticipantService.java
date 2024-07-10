package com.ranieriiuriprojects.anicetour.participant;

import com.ranieriiuriprojects.anicetour.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;

    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip) {
        List<Participant> participants = participantsToInvite.stream().map(email -> new Participant(email, trip)).toList();
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId) {};
}
