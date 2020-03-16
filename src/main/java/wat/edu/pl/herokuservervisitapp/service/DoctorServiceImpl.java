package wat.edu.pl.herokuservervisitapp.service;


import org.springframework.stereotype.Service;
import wat.edu.pl.herokuservervisitapp.service.DoctorService;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService
{
    @Override
    public List<String> getDoctorSpecs() {
        List<String> list = new LinkedList<>();

        list.add("lekarz ogólny");
        list.add("laryngolog");
        list.add("pediatra");
        list.add("ortopeda");
        list.add("kardiolog");
        list.add("okulista");
        list.add("neurolog");
        list.add("reumatolog");
        list.add("urolog");

        Collections.sort(list);

        return list;
    }
}
