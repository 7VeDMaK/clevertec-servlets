package org.clevertec.repository;

import lombok.RequiredArgsConstructor;
import org.clevertec.common.AnimeStatus;
import org.clevertec.common.AnimeType;
import org.clevertec.dto.AnimeEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class AnimeRepository {

    private static final List<AnimeEntity> db = List.of(
            new AnimeEntity(1, "Konosuba", AnimeType.ISEKAI, 4.9, AnimeStatus.ENDED, true),
            new AnimeEntity(2, "Jujutsu Kaisen", AnimeType.DRAMA, 10.0, AnimeStatus.ENDED, true),
            new AnimeEntity(3, "Agenti Vremeni", AnimeType.ABSURD, 7.9, AnimeStatus.ONGOING, true),
            new AnimeEntity(4, "Berserk", AnimeType.DRAMA, 9.9, AnimeStatus.FUTURE_RELEASE, false)
    );

    public List<AnimeEntity> getAnime() {
        return db;
    }

    public Optional<AnimeEntity> getAnimeTitle(int id) {
        return Optional.ofNullable(db.getFirst());
    }
}