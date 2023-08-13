package by.dm13y.examples.mapstruct.utils

import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.model.enums.ProductType
import org.apache.commons.lang3.RandomUtils.nextLong
import org.apache.commons.lang3.RandomUtils.nextDouble
import org.apache.commons.lang3.RandomUtils.nextInt


object ProductGenerator {
    fun generateProductDto(): ProductDto =
        ProductDto(
            cardCode = nextLong(),
            cashBack = nextDouble(),
            type = getRandomProductType(),
            productName = getRandomProductName()
        )


    private fun getRandomProductType(): String =
        nextInt(0, 3)
            .let { ProductType.values()[it] }.name

    private fun getRandomProductName(): String = "product_name_${nextLong()}"
}
