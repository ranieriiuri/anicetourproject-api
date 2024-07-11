package com.ranieriiuriprojects.anicetour.participant;

import java.util.UUID;

public record ParticipantData (UUID id, String name, String email, Boolean isConfirmed){
}
