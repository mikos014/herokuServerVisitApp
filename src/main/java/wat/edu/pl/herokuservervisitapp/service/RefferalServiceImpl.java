package wat.edu.pl.herokuservervisitapp.service;

import org.springframework.stereotype.Service;
import wat.edu.pl.herokuservervisitapp.dto.Doctor;
import wat.edu.pl.herokuservervisitapp.dto.Refferal;
import wat.edu.pl.herokuservervisitapp.dto.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class RefferalServiceImpl implements RefferalService
{
    @Override
    public List<Refferal> getRefferalList(int userId) {
        List<Refferal> list = new LinkedList<>();

        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");

        try
        {
            date = sdf.parse("11.03.2020");
            date = sdf.parse("11.03.2020");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 30);
        Date datePlus30 = c.getTime();

        User user = new User(1, "kowalski@wp.pl", "Jan", "Kowalski", "19800812", 0, "600000000");
        Doctor doctor = new Doctor(1, "lek. Michał Malinowski", 4.7, "lekarz ogólny");

        Refferal refferal = new Refferal(1, "00002124361", date, datePlus30,"Warszawa", doctor, "laryngolog", user, "");
        Refferal refferal2 = new Refferal(2, "0000212141", date, datePlus30,"Warszawa", doctor, "ortopeda", user, "");
        list.add(refferal);
        list.add(refferal2);

        return list;
    }
}
