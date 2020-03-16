package wat.edu.pl.herokuservervisitapp.service;


import org.springframework.stereotype.Service;
import wat.edu.pl.herokuservervisitapp.dto.Doctor;
import wat.edu.pl.herokuservervisitapp.dto.Medicine;
import wat.edu.pl.herokuservervisitapp.dto.Prescription;
import wat.edu.pl.herokuservervisitapp.dto.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Override
    public List<Prescription> getPrescriptionList(int userId) {
        List<Prescription> list = new LinkedList<>();

        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");

        try
        {
            date = sdf.parse("28.02.2020");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 30);
        Date datePlus30 = c.getTime();

        Medicine medicine1 = new Medicine(1, "Pernazinium", "doustnie", "100ml", "1 tab./dziennie");
        Medicine medicine2 = new Medicine(2, "Dipromal", "doustnie", "200mg", "2 tab./dziennie");
        List<Medicine> medicineList = new LinkedList<>();
        medicineList.add(medicine1);
        medicineList.add(medicine2);

        User user = new User(1, "kowalski@wp.pl", "Jan", "Kowalski", "19800812", 0, "600000000");
        Doctor doctor = new Doctor(1, "lek. Marek Nowak", 4.6, "lekarz ogólny");

        Prescription p1 = new Prescription(1, "0003424", date, datePlus30, "Warszawa", doctor, user, medicineList, "");
        medicineList.add(medicine2);
        Prescription p2 = new Prescription(2, "0003543", date, datePlus30, "Warszawa", doctor, user, medicineList, "");

        list.add(p1);
        list.add(p2);

        return list;
    }
}
