package be.thomasmore.bookserver.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "LIBRARY")
@Data
@NoArgsConstructor
public class Library {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private String location;
    private String members;
    private double membershipFee;
    private double lateFeePerDay;
}
