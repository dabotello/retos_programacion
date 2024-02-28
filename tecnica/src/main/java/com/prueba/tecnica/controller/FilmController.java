package prueba.tecnica.tecnica.src.main.java.com.prueba.tecnica.controller;

import com.prueba.tecnica.entity.FilmEntity;
import com.prueba.tecnica.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/films")
@AllArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @GetMapping
    public List<FilmEntity> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GetMapping("/{id}")
    public FilmEntity getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id).orElse(null);
    }

    @PostMapping
    public FilmEntity saveFilm(@RequestBody FilmEntity film) {
        return filmService.saveFilm(film);
    }

    @PutMapping("/{id}")
    public FilmEntity updateFilm(@PathVariable Long id, @RequestBody FilmEntity film) {
        if (filmService.getFilmById(id).isPresent()) {
            film.setFilmId(id);
            return filmService.saveFilm(film);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
    }
}