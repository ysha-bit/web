package Police.Traffic.Online.System.Police.Traffic.Online.System.Table;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Licence")

public class Licence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long nationalId;
    private String nameOfOwner;
    private String vehicleIdentityNumber;
    private String roadLicence;
}
