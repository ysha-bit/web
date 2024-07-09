package Police.Traffic.Online.System.Police.Traffic.Online.System.Services;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Repository.TrafficRepository;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Traffic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrafficService {

    @Autowired
    private TrafficRepository trafficRepo;

    public Traffic createTraffic(Traffic traffic)
    {
        return  trafficRepo.save(traffic);
    }

    public List<Traffic> getAllTraffic(){
        return  trafficRepo.findAll();
    }

    public  Traffic getTrafficById(Long trafficId){
        Optional<Traffic> optinalTrafic = trafficRepo.findById(trafficId);
        return  optinalTrafic.get();
    }

    public  void  deleteTraffic(Long traffic){
        trafficRepo.deleteById(traffic);
    }

    public Traffic updateTraffic(Long trafficId, Traffic traffic){
        Traffic  oldTraffic = trafficRepo.findById(trafficId).orElseThrow();
        oldTraffic.setNumberOfRegistration(traffic.getNumberOfRegistration());
        oldTraffic.setLocationOfWork(traffic.getLocationOfWork());
        oldTraffic.setGender(traffic.getGender());
        oldTraffic.setPhoneNumber(traffic.getPhoneNumber());

        Traffic updatedTraffic = trafficRepo.save(oldTraffic);
        return  updatedTraffic;

    }


}
