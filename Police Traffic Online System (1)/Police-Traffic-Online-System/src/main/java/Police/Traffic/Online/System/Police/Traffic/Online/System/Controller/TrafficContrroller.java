package Police.Traffic.Online.System.Police.Traffic.Online.System.Controller;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Services.TrafficService;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Traffic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("api/traffic")
public class TrafficContrroller {

    @Autowired

    private TrafficService trafficService;

    @PostMapping("/add")
    public ResponseEntity<Traffic> createTraffic(@RequestBody  Traffic traffic){
        Traffic savedTraffic = trafficService.createTraffic(traffic);
        return  new ResponseEntity<>(savedTraffic, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Traffic>> getAllTraffic(){
        List<Traffic> traffics = trafficService.getAllTraffic();
        return new ResponseEntity<>(traffics, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Traffic> getTrafficById(@PathVariable("id") Long trafficId){
        Traffic traffic = trafficService.getTrafficById(trafficId);
        return new ResponseEntity<>(traffic, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTraffic(@PathVariable("id") Long trafficId){
        trafficService.deleteTraffic(trafficId);
        return  new ResponseEntity<String>("Traffic has been deleted", HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Traffic> updateTraffic(@PathVariable("id") Long trafficId, @RequestBody Traffic traffic){
        Traffic trafficUpdate = trafficService.updateTraffic(trafficId, traffic);
        return new ResponseEntity<>(trafficUpdate, HttpStatus.OK);
    }

}

