package jean.dio.service.impl.src.main.java.me.dio.service.impl.src.main.java.me.dio.service.impl.src.main.java.me.dio.service.impl;

import jean.dio.domain.model.User;
import jean.dio.domain.repository.UserRepository;
import jean.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl
        implements jean.dio.service.impl.src.main.java.me.dio.service.impl.src.main.java.me.dio.service.UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}