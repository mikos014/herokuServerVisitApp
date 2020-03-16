package wat.edu.pl.herokuservervisitapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wat.edu.pl.herokuservervisitapp.dto.Doctor;
import wat.edu.pl.herokuservervisitapp.dto.User;
import wat.edu.pl.herokuservervisitapp.dto.Visit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class VisitServiceImpl implements VisitService
{
    private List<Visit> historyVisitList;
    private List<Visit> currentVisitList;

    @Autowired
    public VisitServiceImpl() {
        createHistoryList();
        createCurrentVisit();
    }

    private void createHistoryList()
    {
        List<Visit> list = new LinkedList<>();

        Date date1 = null;
        Date date2 = null;
        Date date3 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");

        try
        {
            date1 = sdf.parse("15.01.2020");
            date2 = sdf.parse("20.02.2020");
            date3 = sdf.parse("28.02.2020");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        User user = new User(1, "kowalski@wp.pl", "Jan", "Kowalski", "19800812", 0, "600000000");

        Doctor doctor = new Doctor(1, "lek. Michał Dyga", 4.7, "lekarz ogólny");
        Doctor doctor1 = new Doctor(2, "dr Jacek Nowak", 4.6, "laryngolog");
        Doctor doctor2 = new Doctor(3, "dr hab. Jan Babic", 4.9, "pediatra");

        Visit visit = new Visit(1, date3, "11:30", user, doctor, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463828", true);
        Visit visit1 = new Visit(2, date2, "13:30", user, doctor1, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "225676573",false);
        Visit visit2 = new Visit(3, date1, "14:00", user, doctor2, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228461322",false);

        list.add(visit);
        list.add(visit1);
        list.add(visit2);

        this.historyVisitList = list;
    }

    private void createCurrentVisit()
    {
        List<Visit> list = new LinkedList<>();

        Date date = null;
        Date date1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");

        try
        {
            date = sdf.parse("21.06.2020");
            date1 = sdf.parse("10.07.2020");
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        Doctor doctor = new Doctor(1, "lek. Michał Dyga", 4.7, "lekarz ogólny");
        Doctor doctor1 = new Doctor(2, "dr Jacek Nowak", 4.6, "laryngolog");
        Doctor doctor2 = new Doctor(3, "dr hab. Jan Babic", 4.9, "pediatra");
        Doctor doctor3 = new Doctor(4, "lek. Mariusz Nach", 4.7, "neurolog");
        Doctor doctor4 = new Doctor(5, "dr. Jan Hadan", 4.5, "kardiolog");
        Doctor doctor5 = new Doctor(6, "lek. Wojciech Wac", 4.1, "lekarz ogólny");
        Doctor doctor6 = new Doctor(7, "dr Artur Taczuk", 4.2, "ortopeda");
        Doctor doctor7 = new Doctor(8, "dr hab. Jan Edwin", 4.9, "okulista");
        Doctor doctor8 = new Doctor(9, "lek. Wiesław Tadel", 4.7, "kardiolog");
        Doctor doctor9 = new Doctor(10, "dr. Jakub Zaberg", 4.3, "laryngolog");
        User user = new User(1, "kowalski@wp.pl", "Jan", "Kowalski", "19800812", 0, "600000000");


        Visit visit = new Visit(1, date, "11:30", null, doctor, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463828", false);
        Visit visit1 = new Visit(2, date1, "13:30", null, doctor1, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463843",false);
        Visit visit2 = new Visit(3, date, "14:00", null, doctor2, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463800",false);

        Visit visit3 = new Visit(4, date1, "12:30", null, doctor9, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "225043929", false);
        Visit visit4 = new Visit(5, date1, "13:30", user, doctor6, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "229504030",false);
        Visit visit5 = new Visit(6, date, "14:00", null, doctor5, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "223882210",false);

        Visit visit6 = new Visit(7, date, "11:30", null, doctor3, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463828", false);
        Visit visit7 = new Visit(8, date1, "13:30", null, doctor4, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463843",false);
        Visit visit8 = new Visit(9, date, "14:00", null, doctor7, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "228463800",false);

        Visit visit9 = new Visit(10, date1, "12:30", null, doctor9, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "225043929", false);
        Visit visit10 = new Visit(11, date1, "13:30", null, doctor6, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "229504030",false);
        Visit visit11 = new Visit(12, date, "14:00", null, doctor8, 51.421882,21.924779, "Przychodnia Rejonowa SZPZLO Warszawa Bemowo", "00-001 Warszawa","Czumy 1", "223882210",false);

        list.add(visit);
        list.add(visit1);
        list.add(visit2);
        list.add(visit3);
        list.add(visit4);
        list.add(visit5);
        list.add(visit6);
        list.add(visit7);
        list.add(visit8);
        list.add(visit9);
        list.add(visit10);
        list.add(visit11);

        this.currentVisitList = list;
    }

    @Override
    public HashMap getDatesOfVisits(int visitId) {
        HashMap<String, List<String>> dates = new HashMap<>();
        List<String> hours1 = new LinkedList<>();
        List<String> hours2 = new LinkedList<>();

        List<Integer> visitIdOn21June = new LinkedList<>();
        visitIdOn21June.add(1);
        visitIdOn21June.add(3);
        visitIdOn21June.add(6);
        visitIdOn21June.add(7);
        visitIdOn21June.add(9);
        visitIdOn21June.add(12);

        for (Visit v:currentVisitList)
        {
            if (v.getUser() == null)
            {
                if (visitIdOn21June.contains(v.getVisitId()))
                {
                    hours1.add(v.getTime());
                }
                else
                {
                    hours2.add(v.getTime());
                }
            }
        }

        dates.put("21.06.2020", hours1);
        dates.put("10.07.2020", hours2);

        return dates;
    }

    @Override
    public boolean addOpinion(int visitId, int userId, int numberOfStars) {
        for (Visit v:historyVisitList)
        {
            if (v.getUser() != null && v.getVisitId() == visitId && v.getUser().getUserId() == userId)
                v.setHasOpinion(true);
        }
        return true;
    }

    @Override
    public List<Visit> getHistoryList(int userId) {
        List<Visit> list = new LinkedList<>();

        for (Visit v:historyVisitList)
        {
            if (v.getUser() != null && v.getUser().getUserId() == userId)
                list.add(v);
        }

        return list;

    }

    @Override
    public List<Visit> getCurrentVisitList(int userId) {

        List<Visit> list = new LinkedList<>();

        for (Visit v:currentVisitList)
        {
            if (v.getUser() != null && v.getUser().getUserId() == userId)
                list.add(v);
        }

        return list;
    }

    @Override
    public List<Visit> getVisitsLimitByQuery(String query) {
        List<Visit> list = new LinkedList<>();

        for(Visit v: currentVisitList)
        {
            if(v.getDoctor().getSpec().toLowerCase().contains(query.toLowerCase()))
            {
                list.add(v);
            }
        }

        if (list.size() == 0)
        {
            for (Visit v: currentVisitList)
            {
                if(v.getDoctor().getName().toLowerCase().contains(query.toLowerCase()))
                {
                    list.add(v);
                }
            }
        }

        return list;
    }

    @Override
    public List<Visit> getVisits()
    {
        List<Visit> list = new LinkedList<>();

        for (Visit v: currentVisitList)
        {
            if (v.getUser() == null)
                list.add(v);
        }
        return list;
    }

    @Override
    public boolean cancelTheVisit(int visitId, int userId) {
        for (Visit v: currentVisitList)
        {
            if (v.getVisitId() == visitId && v.getUser().getUserId() == userId)
                v.setUser(null);
        }
        return true;
    }

    @Override
    public boolean bookTheVisit(Visit visit) {
        for (Visit v: currentVisitList)
        {
            if (v.getVisitId() == visit.getVisitId())
            {
                v.setUser(visit.getUser());
            }
        }
        return true;
    }
}
