package Police.Traffic.Online.System.Police.Traffic.Online.System.Controller;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Services.ProfileServices;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profile")
public class ProfileController {

    @Autowired

    private ProfileServices profileServices;

    @PostMapping
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile){
        Profile savedProfile = profileServices.createProfile(profile);
        return  new ResponseEntity<>(savedProfile, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Profile>> getAllProfile (){
        List<Profile> profiles = profileServices.getAllProfile();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Profile> getProfileById(@PathVariable("id") Long profileId){
       Profile profile = profileServices.getProfileById(profileId);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProfile(@PathVariable("id") Long ProfileId){
        profileServices.deleteProfile(ProfileId);
        return  new ResponseEntity<String>("Profile has been deleted", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Profile> updateProfile(@PathVariable("id") Long profileId, Profile profile){
        profile.setId(profileId);
        Profile profileUpdate = profileServices.updateProfile(profile);
        return new ResponseEntity<>(profileUpdate, HttpStatus.CREATED);
    }

}
