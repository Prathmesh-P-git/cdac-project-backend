package milk_api.controller;

import milk_api.entity.MilkUser;
import milk_api.service.MilkUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class MilkUserController {

    @Autowired
    private MilkUserService userService;

    @GetMapping
    public List<MilkUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MilkUser> getUserById(@PathVariable Long id) {
        Optional<MilkUser> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public MilkUser createUser(@RequestBody MilkUser user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<MilkUser> getUserByUsername(@PathVariable String username) {
        Optional<MilkUser> user = userService.findByUsername(username);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
