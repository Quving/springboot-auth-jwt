package heimdall.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    public List<ApplicationUser> getAllUser() {
        return applicationUserRepository.findAll();
    }

    public void addUser(ApplicationUser patient) {
        applicationUserRepository.save(patient);
    }

    public Optional<ApplicationUser> getUser(Long uuid) {
        return applicationUserRepository.findById(uuid);
    }

    public void updateUser(Long id, ApplicationUser patient) {
        applicationUserRepository.save(patient);
    }

    public void deleteUser(Long uuid) {
        applicationUserRepository.deleteById(uuid);
    }
}
