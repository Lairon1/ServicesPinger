package ru.lairon1.servicespinger.repository;

import ru.lairon1.servicespinger.model.UserModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Component
public interface UserRepository extends CrudRepository<UserModel, Long> {
}
