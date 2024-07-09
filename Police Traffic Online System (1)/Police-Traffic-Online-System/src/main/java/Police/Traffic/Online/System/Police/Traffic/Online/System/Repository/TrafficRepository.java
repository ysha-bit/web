package Police.Traffic.Online.System.Police.Traffic.Online.System.Repository;

import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficRepository extends JpaRepository<Traffic, Long> {
}
