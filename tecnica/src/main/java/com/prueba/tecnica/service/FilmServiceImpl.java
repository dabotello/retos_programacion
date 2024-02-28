package prueba.tecnica.tecnica.src.main.java.com.prueba.tecnica.service;

import com.prueba.tecnica.entity.FilmEntity;
import com.prueba.tecnica.repository.FilmRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FilmServiceImpl implements FilmService{

    private final FilmRepository filmRepository;

    @Override
    public List<FilmEntity> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<FilmEntity> getFilmById(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public FilmEntity saveFilm(FilmEntity film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }
}
