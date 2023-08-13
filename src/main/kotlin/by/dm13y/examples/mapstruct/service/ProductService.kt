package by.dm13y.examples.mapstruct.service

import by.dm13y.examples.mapstruct.model.dto.ProductDto

/**
 * Interface define contract that uses to work with products model
 */
interface ProductService {

    /**
     * Convert productDto to product and out them to console
     */
    fun printProduct(productDto: ProductDto)
}