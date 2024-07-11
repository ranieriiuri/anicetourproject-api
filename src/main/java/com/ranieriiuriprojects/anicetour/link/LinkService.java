package com.ranieriiuriprojects.anicetour.link;

import com.ranieriiuriprojects.anicetour.activity.Activity;
import com.ranieriiuriprojects.anicetour.activity.ActivityData;
import com.ranieriiuriprojects.anicetour.activity.ActivityRequestPayload;
import com.ranieriiuriprojects.anicetour.activity.ActivityResponse;
import com.ranieriiuriprojects.anicetour.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LinkService {
    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip) {
        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    public List<LinkData> getAllLinksFromId(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(link -> new LinkData(link.getId(),link.getTitle(), link.getUrl())).toList();
    }
}
