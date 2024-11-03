package org.clevertec.mapper;

import org.clevertec.dto.Anime;
import org.clevertec.dto.AnimeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AnimeMapper {
    List<Anime> toDomains(List<AnimeEntity> characters);

    Anime toDomain(AnimeEntity characterEntity);

    AnimeEntity toEntity(Anime character);
}
