package ru.lairon1.servicespinger.service;

import lombok.NonNull;
import ru.lairon1.servicespinger.model.notification.NotificationsSettingsModel;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
public interface NotificationsSettingsService {

    @NonNull
    NotificationsSettingsModel createDefaultNotificationsSettings();

}
