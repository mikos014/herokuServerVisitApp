package wat.edu.pl.herokuservervisitapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wat.edu.pl.herokuservervisitapp.dto.Refferal;
import wat.edu.pl.herokuservervisitapp.service.RefferalService;

import java.util.List;

@RestController
public class RefferalController
{
    private final RefferalService refferalService;

    @Autowired
    public RefferalController(RefferalService refferalService) {
        this.refferalService = refferalService;
    }

    @GetMapping("/api/refferal/{userId}")
    public ResponseEntity<List<Refferal>> getRefferalList(@PathVariable("userId") int userId) {
        return new ResponseEntity<>(refferalService.getRefferalList(userId), HttpStatus.OK);
    }
}
