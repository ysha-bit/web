package Police.Traffic.Online.System.Police.Traffic.Online.System.Table;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //delete or update//
@NoArgsConstructor // enter data//
@Entity
@Table(name = "Traffic")

public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberOfRegistration;
    private String locationOfWork;
    private String phoneNumber;
    private String gender;
}
