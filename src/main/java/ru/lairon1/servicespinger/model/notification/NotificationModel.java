package ru.lairon1.servicespinger.model.notification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.time.Duration;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Entity
@Table(name = "notification")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class NotificationModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private boolean enabled;

    private boolean soundEnabled;

    @NonNull
    @Column(columnDefinition = "BIGINT")
    private Duration sendingPeriod;

}
