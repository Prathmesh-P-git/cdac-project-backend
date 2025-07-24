package milk_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import milk_api.entity.AdminProfile;
import milk_api.repository.AdminProfileRepository;

@Service
public class AdminService {

    private final AdminProfileRepository adminRepository;

    public AdminService(AdminProfileRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<AdminProfile> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<AdminProfile> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    public AdminProfile saveAdmin(AdminProfile admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
