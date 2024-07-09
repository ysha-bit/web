package Police.Traffic.Online.System.Police.Traffic.Online.System.Table;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profile")


public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NIDA", nullable = false,unique = true)//isijirudie//
    private Long nationalId;
    @Column(name = "Registration",nullable = false,unique = true)
    private String registrationNumber;
    private String location;
    private String gender;
}
