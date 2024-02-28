package prueba.tecnica.tecnica.src.main.java.com.prueba.tecnica.repository;

import com.prueba.tecnica.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long> {
}