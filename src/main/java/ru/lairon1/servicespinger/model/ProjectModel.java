package ru.lairon1.servicespinger.model;

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

/**
 * @author 0xLairon1
 * @project ServicesPinger
 * @since 17.08.2025
 */
@Entity
@Table(name = "project")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class ProjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @NonNull
    private PingType pingType;

}
