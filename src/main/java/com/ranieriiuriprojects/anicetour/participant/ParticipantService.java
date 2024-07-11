package com.ranieriiuriprojects.anicetour.participant;

import ch.qos.logback.core.net.SyslogOutputStream;
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
        //Recebe uma lista de participantes p convidar(emails) e informações  de uma nova viagem...
        //Faz uma seapração(stream) mapeando cada um deles, com cada email cria um novo partic com email e infos da trip(usando o constructor q permite isso...
        //...Junta-os e os converte p uma lista que irá ser salva na var 'participants'.
        List<Participant> participants = participantsToInvite.stream().map(email -> new Participant(email, trip)).toList();

        //Salva no repo de participantes
        this.repository.saveAll(participants);

        //Logando um partic. para teste
        System.out.println(participants.get(0).getId());
    }

    public ParticipantCreateResponse registerParticipantToEvent(String email, Trip trip) {
        Participant newParticipant = new Participant(email, trip);
        this.repository.save(newParticipant);

        return new ParticipantCreateResponse(newParticipant.getId());
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId) {};

    public void triggerConfirmationEmailToParticipant(String email) {};

    public List<ParticipantData> getAllParticipantsFromEvent(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(participant -> new ParticipantData(participant.getId(), participant.getName(), participant.getEmail(), participant.getIsConfirmed())).toList();
    };
}
