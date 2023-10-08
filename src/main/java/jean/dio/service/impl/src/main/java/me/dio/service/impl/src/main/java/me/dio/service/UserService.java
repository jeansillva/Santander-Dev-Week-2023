package jean.dio.service.impl.src.main.java.me.dio.service.impl.src.main.java.me.dio.service;

import jean.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}