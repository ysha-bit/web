package Police.Traffic.Online.System.Police.Traffic.Online.System.Services;

import Police.Traffic.Online.System.Police.Traffic.Online.System.Repository.LicenceRepository;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Licence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenceServices {

        @Autowired
        private LicenceRepository licenceRepository;

        public Licence createLicence(Licence licence) {
            return licenceRepository.save(licence);
        }

        public List<Licence> getAllLicence() {
            return licenceRepository.findAll();
        }

        public Licence getLicenceById(Long licenceId) {
            Optional<Licence> optionalLicence = licenceRepository.findById(licenceId);
            return optionalLicence.get();
        }

        public void deleteLicence(Long licence) {
            licenceRepository.deleteById(licence);
        }

        public Licence updateLicence(Licence licence) {
            Licence oldLicence = licenceRepository.findById(licence.getId()).get();
            oldLicence.setNationalId(licence.getNationalId());
            oldLicence.setNameOfOwner(licence.getNameOfOwner());
            oldLicence.setVehicleIdentityNumber(licence.getVehicleIdentityNumber());
            oldLicence.setRoadLicence(licence.getRoadLicence());

            Licence updatedLicence = licenceRepository.save(oldLicence);
            return updatedLicence;

        }
    }