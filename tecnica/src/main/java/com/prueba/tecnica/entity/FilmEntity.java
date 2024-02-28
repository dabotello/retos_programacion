package prueba.tecnica.tecnica.src.main.java.com.prueba.tecnica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "film")
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;
    private String title;
    private String description;
    @Column(name = "\"YEAR\"")
    private int year;
    private int rentalDuration;
    private String rating;
    private int duration;
    private double rentalPrice;

}