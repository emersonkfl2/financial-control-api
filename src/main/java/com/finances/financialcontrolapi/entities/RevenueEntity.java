package com.finances.financialcontrolapi.entities;

import lombok.*;
import org.hibernate.mapping.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="revenue")
public class RevenueEntity implements Serializable{
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", nullable = false)
    @Getter @Setter
    private String description;

    @Column(name = "value", nullable = false)
    @Getter @Setter
    private Integer value;

    @Column(name = "date", nullable = false)
    @Getter @Setter
    private LocalDate date;
}
