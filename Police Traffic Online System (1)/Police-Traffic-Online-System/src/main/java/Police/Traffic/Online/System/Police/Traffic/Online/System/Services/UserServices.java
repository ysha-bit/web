package Police.Traffic.Online.System.Police.Traffic.Online.System.Services;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Repository.UserRepository;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

//    public User findUserByEmail(String email){
//        return userRepository.findByUsername(email);
//    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public void deleteuser(Long user){
        userRepository.deleteById(user);
    }
}
