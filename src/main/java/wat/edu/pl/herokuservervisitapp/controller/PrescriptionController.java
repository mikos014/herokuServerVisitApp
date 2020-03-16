package wat.edu.pl.herokuservervisitapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wat.edu.pl.herokuservervisitapp.dto.Prescription;
import wat.edu.pl.herokuservervisitapp.service.PrescriptionService;

import java.util.List;

@RestController
public class PrescriptionController
{
    private PrescriptionService prescriptionService;

    @Autowired
    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/api/prescription/{userId}")
    public ResponseEntity<List<Prescription>> getPrescriptionList(@PathVariable("userId") int userId)
    {
        return new ResponseEntity<>(prescriptionService.getPrescriptionList(userId), HttpStatus.OK);
    }
}
