package wat.edu.pl.herokuservervisitapp.service;


import wat.edu.pl.herokuservervisitapp.dto.Prescription;

import java.util.List;

public interface PrescriptionService {
    List<Prescription> getPrescriptionList(int userId);
}
