package ru.lairon1.servicespinger.model.notification;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Entity
@Table(name = "notifications_settings")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class NotificationsSettingsModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private NotificationModel periodNotifications;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private NotificationModel warningNotifications;

}
