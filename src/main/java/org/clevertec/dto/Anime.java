package org.clevertec.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.clevertec.common.AnimeStatus;
import org.clevertec.common.AnimeType;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Anime {

    private int id;
    private String name;
    private AnimeType type;
    private double rating;
    private AnimeStatus status;
    private boolean available;
}
