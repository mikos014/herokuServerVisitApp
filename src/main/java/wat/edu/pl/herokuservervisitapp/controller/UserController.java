package wat.edu.pl.herokuservervisitapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wat.edu.pl.herokuservervisitapp.dto.User;
import wat.edu.pl.herokuservervisitapp.dto.UserCreds;
import wat.edu.pl.herokuservervisitapp.service.UserService;

@RestController
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/rightToBook/{visitId}/{userId}")
    public ResponseEntity<Boolean> checkRightToBook(@PathVariable("visitId")int visitId, @PathVariable("userId") int userId)
    {
        return new ResponseEntity<>(userService.checkRightToBook(visitId), HttpStatus.OK);
    }

    @PostMapping("/api/changeEmail")
    public ResponseEntity changeEmail(@RequestBody UserCreds user)
    {
        if (userService.changeEmail(user))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PostMapping("/api/changePassword")
    public ResponseEntity changePassword(@RequestBody UserCreds user)
    {
        if (userService.changePassword(user))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PostMapping("/api/changeNumber")
    public ResponseEntity changeNumber(@RequestBody UserCreds user)
    {
        if (userService.changeNumber(user))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PostMapping("/api/login")
    public ResponseEntity<User> login(@RequestBody UserCreds user)
    {
        return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
    }

    @PostMapping("/api/register")
    public ResponseEntity register(@RequestBody UserCreds user)
    {
        if (userService.register(user))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
