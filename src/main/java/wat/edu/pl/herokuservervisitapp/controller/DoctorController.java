package wat.edu.pl.herokuservervisitapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wat.edu.pl.herokuservervisitapp.service.DoctorService;

import java.util.List;

@RestController
public class DoctorController
{
    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/api/doctor")
    public ResponseEntity<List<String>> getSpecs()
    {
        return new ResponseEntity<>(doctorService.getDoctorSpecs(), HttpStatus.OK);
    }
}
