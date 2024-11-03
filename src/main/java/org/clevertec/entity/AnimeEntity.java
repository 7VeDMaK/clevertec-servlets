package org.clevertec.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.clevertec.common.AnimeStatus;
import org.clevertec.common.AnimeType;

import java.util.UUID;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class AnimeEntity {

    private int id;
    private String name;
    private AnimeType type;
    private double rating;
    private AnimeStatus status;
    private boolean available;
}
