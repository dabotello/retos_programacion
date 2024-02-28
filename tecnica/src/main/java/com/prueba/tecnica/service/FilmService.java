package prueba.tecnica.tecnica.src.main.java.com.prueba.tecnica.service;

import com.prueba.tecnica.entity.FilmEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface FilmService {

    public List<FilmEntity> getAllFilms();
    public Optional<FilmEntity> getFilmById(Long id);
    public FilmEntity saveFilm(FilmEntity film);
    public void deleteFilm(Long id);

}
