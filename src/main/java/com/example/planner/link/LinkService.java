package com.example.planner.link;

import com.example.planner.activity.Activity;
import com.example.planner.activity.ActivityData;
import com.example.planner.activity.ActivityRequestPayload;
import com.example.planner.activity.ActivityResponse;
import com.example.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip){
        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    public List<ActivityData> getAllActivitiesFromId(UUID tripId){
        return new ArrayList<>();
    }
}
