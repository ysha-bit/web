package Police.Traffic.Online.System.Police.Traffic.Online.System.Table;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
@Entity
@Table(name = "userlogin")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
    private String password;

//    @Column(nullable =  false)
//    private String role;

//public class Login {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long id;
//    @Column(nullable = false,unique = true)
//    private String email;
//    @Column(name = "pasword",nullable = false,unique = true)
//    private String password;

}
