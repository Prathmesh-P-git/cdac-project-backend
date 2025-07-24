package milk_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import milk_api.entity.MilkUser;
import milk_api.repository.MilkUserRepository;

@Service
public class MilkUserService {

    private final MilkUserRepository userRepository;

    public MilkUserService(MilkUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MilkUser> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<MilkUser> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public MilkUser saveUser(MilkUser user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<MilkUser> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
