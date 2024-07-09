package Police.Traffic.Online.System.Police.Traffic.Online.System.Repository;

import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository<User, Long>{
//    User findByUsername(String username);
}

