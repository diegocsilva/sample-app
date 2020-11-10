package br.com.sampleapp.entity;

import br.com.sampleapp.enums.Sex;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "customer_id", updatable = false, nullable = false)
    private Long id;

    private String name;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    private LocalDate birthAt;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City livesAt;
}
