package ru.lairon1.servicespinger.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import ru.lairon1.servicespinger.model.notification.NotificationsSettingsModel;

import java.util.Set;

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private long chatId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_projects",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<ProjectModel> projects;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private NotificationsSettingsModel notificationsSettings;

}
