package Police.Traffic.Online.System.Police.Traffic.Online.System.Controller;


import Police.Traffic.Online.System.Police.Traffic.Online.System.Services.UserServices;
import Police.Traffic.Online.System.Police.Traffic.Online.System.Table.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/login")
public class UserController {

    @Autowired
    private UserServices userService;


//    @PostMapping
//    public ResponseEntity<Map<String, String>> userLogin(@RequestBody User user, HttpSession session){
//        User foundedUser = userService.findUserByEmail(user.getEmail());
//        Map<String, String> response = new HashMap<>();
//
//        if (foundedUser == null) {
//            response.put("message", "Email is not found");
//            return  ResponseEntity.badRequest().body(response);
//        }
//
//        if (foundedUser.getPassword().equals(user.getPassword())) {
//
//            session.setAttribute("user", foundedUser);
//            response.put("message", "login successfully");
//            response.put("Email", String.valueOf(foundedUser.getEmail()));
//            return ResponseEntity.ok(response);
//        } else {
//            response.put("message", "invalid user details");
//            return ResponseEntity.badRequest().body(response);
//        }
//    }


    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User userSaved = userService.createUser(user);
        return new  ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long user){
        userService.deleteuser(user);
        return new ResponseEntity<String>("User already deleted ", HttpStatus.OK);
    }

}
