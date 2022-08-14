package com.therapJavaFest.jagoronBD.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "harassment_report")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Harassment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullName;

    @Column
    private String byWho;

    @Column
    private String place;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String description;
}
