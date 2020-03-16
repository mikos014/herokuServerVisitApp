package wat.edu.pl.herokuservervisitapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wat.edu.pl.herokuservervisitapp.dto.Visit;
import wat.edu.pl.herokuservervisitapp.service.VisitService;

import java.util.HashMap;
import java.util.List;

@RestController
public class VisitController
{
    private final VisitService visitService;

    @Autowired
    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping("/api/searchUnoccupied/{visitId}")
    public ResponseEntity<HashMap> getDatesOfVisit(@PathVariable("visitId") int visitId)
    {
        return new ResponseEntity<>(visitService.getDatesOfVisits(visitId) , HttpStatus.OK);
    }

    @PostMapping("/api/historyV/opinion/{visitId}/{userId}/{opinion}")
    public ResponseEntity addOpinion(@PathVariable("visitId") int visitId, @PathVariable("userId") int userId, @PathVariable("opinion") int numberOfStars)
    {
        if (visitService.addOpinion(visitId, userId, numberOfStars))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.CONFLICT);
    }

    @GetMapping("/api/historyV/{userId}")
    public ResponseEntity<List<Visit>> getHistoryVisits(@PathVariable("userId") int userId)
    {
        return new ResponseEntity<>(visitService.getHistoryList(userId), HttpStatus.OK);
    }

    @GetMapping("/api/currentV/{userId}")
    public ResponseEntity<List<Visit>> getCurrentVisits(@PathVariable("userId") int userId)
    {
        return new ResponseEntity<>(visitService.getCurrentVisitList(userId), HttpStatus.OK);
    }

    @GetMapping("/api/searchByQuery/{query}")
    public ResponseEntity<List<Visit>> getVisitsLimitByQuery(@PathVariable("query") String query)
    {
        return new ResponseEntity<>(visitService.getVisitsLimitByQuery(query), HttpStatus.OK);
    }

    @GetMapping("/api/search")
    public ResponseEntity<List<Visit>> getVisits()
    {
        return new ResponseEntity<>(visitService.getVisits(), HttpStatus.OK);
    }

    @GetMapping("/api/currentV/cancel/{visitId}/{userId}")
    public ResponseEntity cancelTheVisit(@PathVariable("visitId") int visitId, @PathVariable("userId") int userId)
    {
        if (visitService.cancelTheVisit(visitId, userId))
            return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PostMapping("/api/book")
    public ResponseEntity bookTheVisit(@RequestBody Visit visit)
    {
        if (visitService.bookTheVisit(visit))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.CONFLICT);
    }
}
