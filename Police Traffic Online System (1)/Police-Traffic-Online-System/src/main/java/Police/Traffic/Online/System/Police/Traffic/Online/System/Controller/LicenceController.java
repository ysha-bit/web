package Police.Traffic.Online.System.Police.Traffic.Online.System.Controller;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Services.LicenceServices;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Licence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/licence")
public class LicenceController {

    @Autowired
    private LicenceServices licenceServices;

    @PostMapping ("add")
    public ResponseEntity<Licence> createLicence(@RequestBody Licence licence){
       Licence savedLicence = licenceServices.createLicence(licence);
        return  new ResponseEntity<>(savedLicence, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Licence>> getAllLicence (){
        List<Licence> licences = licenceServices.getAllLicence();
        return new ResponseEntity<>(licences, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Licence> getLicenceById(@PathVariable("id") Long licenceId){
       Licence licence = licenceServices.getLicenceById(licenceId);
        return new ResponseEntity<>(licence, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteLicence(@PathVariable("id") Long LicenceId){
        licenceServices.deleteLicence(LicenceId);
        return  new ResponseEntity<String>("Licence has been deleted", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Licence> updateLicence(@PathVariable("id") Long licenceId, @RequestBody Licence licence){
        licence.setId(licenceId);
        Licence licenceUpdate = licenceServices.updateLicence(licence);
        return new ResponseEntity<>(licenceUpdate, HttpStatus.CREATED);
    }


}
