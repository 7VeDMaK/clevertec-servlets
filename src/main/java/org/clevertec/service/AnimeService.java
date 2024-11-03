package org.clevertec.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.clevertec.dto.Anime;
import org.clevertec.dto.AnimeEntity;
import org.clevertec.mapper.AnimeMapper;
import org.clevertec.mapper.AnimeMapperImpl;
import org.clevertec.repository.AnimeRepository;

import java.util.List;

@NoArgsConstructor()
public final class AnimeService {

    private final AnimeRepository animeRepository = new AnimeRepository();
    private final AnimeMapper animeMapper = new AnimeMapperImpl();

    public List<AnimeEntity> findAll() {
        return animeRepository.getAnime();
    }

    public AnimeEntity findById(int id){
        return animeRepository.getAnimeTitle(id).orElse(null);
    }
}