package ru.lairon1.servicespinger.service;

import lombok.NonNull;
import ru.lairon1.servicespinger.model.UserModel;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
public interface UserService {

    @NonNull
    UserModel createEmptyUser(@NonNull Long chatId);

    @NonNull
    UserModel createAndSaveEmptyUser(@NonNull Long chatId);

    @NonNull
    UserModel getOrCreateIfNeedAndSaveEmptyUser(@NonNull Long chatId);

}
