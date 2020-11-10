package br.com.sampleapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "city_id", updatable = false, nullable = false)
    private Long id;

    private String name;

    private String province;

}
