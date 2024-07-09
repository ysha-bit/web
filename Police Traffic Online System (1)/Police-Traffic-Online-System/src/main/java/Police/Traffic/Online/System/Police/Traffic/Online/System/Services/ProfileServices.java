package Police.Traffic.Online.System.Police.Traffic.Online.System.Services;

import Police.Traffic.Online.System.Police.Traffic.Online.System.Repository.ProfileRepository;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Profile;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Traffic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProfileServices {
    private ProfileRepository profileRepository;

    public Profile createProfile(Profile profile)
    {
        return profileRepository.save(profile);

    }
    public List<Profile> getAllProfile(){
        return  profileRepository.findAll();
    }

    public  Profile getProfileById(Long ProfileId){
        Optional<Profile> optionalProfile = profileRepository.findById(ProfileId);
        return  optionalProfile.get();
    }

    public  void  deleteProfile(Long profile){
        profileRepository.deleteById(profile);
    }
    public Profile updateProfile(Profile profile){

        Profile oldProfile= profileRepository.findById(profile.getId()).get();
        oldProfile.setNationalId(profile.getNationalId());
        oldProfile.setRegistrationNumber(profile.getRegistrationNumber());
        oldProfile.setLocation(profile.getLocation());
        oldProfile.setGender(profile.getGender());


       Profile updateProfile =profileRepository.save(oldProfile);
        return updateProfile;
    }
}
