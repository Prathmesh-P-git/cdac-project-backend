package milk_api.controller;

import milk_api.entity.AdminProfile;
import milk_api.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/admins")
public class AdminController {

	@Autowired
    private final AdminService adminService;

    
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public ResponseEntity<List<AdminProfile>> getAllAdmins() {
        return ResponseEntity.ok(adminService.getAllAdmins());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdminProfile> getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AdminProfile> createAdmin(@RequestBody AdminProfile admin) {
        return ResponseEntity.ok(adminService.saveAdmin(admin));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdminProfile> updateAdmin(@PathVariable Long id, @RequestBody AdminProfile admin) {
        if (adminService.getAdminById(id).isPresent()) {
            admin.setId(id);
            return ResponseEntity.ok(adminService.saveAdmin(admin));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        if (adminService.getAdminById(id).isPresent()) {
            adminService.deleteAdmin(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

