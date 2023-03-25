package com.plcoding.composepaging3caching.data.mappers

import com.plcoding.composepaging3caching.data.local.BeerEntity
import com.plcoding.composepaging3caching.data.remote.BeerDto
import com.plcoding.composepaging3caching.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}