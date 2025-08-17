package ru.lairon1.servicespinger.service.impl;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import ru.lairon1.servicespinger.model.UserModel;
import ru.lairon1.servicespinger.repository.UserRepository;
import ru.lairon1.servicespinger.service.NotificationsSettingsService;
import ru.lairon1.servicespinger.service.UserService;

import java.util.HashSet;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Getter
@Setter
public class DefaultUserService implements UserService {

    @NonNull
    private UserRepository userRepository;

    @NonNull
    private NotificationsSettingsService notificationsSettingsService;

    @Override
    public @NonNull UserModel createEmptyUser(@NonNull final Long chatId) {
        final UserModel user = new UserModel();
        user.setChatId(chatId);
        user.setProjects(new HashSet<>());
        user.setNotificationsSettings(notificationsSettingsService.createDefaultNotificationsSettings());
        return user;
    }

    @Override
    public @NonNull UserModel createAndSaveEmptyUser(@NonNull final Long chatId) {
        final UserModel user = createEmptyUser(chatId);
        return userRepository.save(user);
    }

    @Override
    public @NonNull UserModel getOrCreateIfNeedAndSaveEmptyUser(@NonNull final Long chatId) {
        return userRepository.findByChatId(chatId).orElseGet(() -> createAndSaveEmptyUser(chatId));
    }
}
