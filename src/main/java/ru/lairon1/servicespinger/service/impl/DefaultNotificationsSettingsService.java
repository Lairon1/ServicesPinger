package ru.lairon1.servicespinger.service.impl;

import lombok.NonNull;
import ru.lairon1.servicespinger.model.notification.NotificationModel;
import ru.lairon1.servicespinger.model.notification.NotificationsSettingsModel;
import ru.lairon1.servicespinger.service.NotificationsSettingsService;

import java.time.Duration;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
public class DefaultNotificationsSettingsService implements NotificationsSettingsService {

    @Override
    public @NonNull NotificationsSettingsModel createDefaultNotificationsSettings() {
        final NotificationsSettingsModel notificationsSettings = new NotificationsSettingsModel();
        notificationsSettings.setWarningNotifications(createDefaultNotification());
        notificationsSettings.setPeriodNotifications(createDefaultNotification());
        return notificationsSettings;
    }

    private NotificationModel createDefaultNotification(){
        final NotificationModel notification = new NotificationModel();
        notification.setEnabled(false);
        notification.setSoundEnabled(false);
        notification.setSendingPeriod(Duration.ZERO);
        return notification;
    }


}
