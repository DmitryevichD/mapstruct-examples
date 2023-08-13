package by.dm13y.examples.mapstruct.service.impl

import by.dm13y.examples.mapstruct.mapper.ProductMapper
import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.service.ProductService
import by.dm13y.examples.mapstruct.utils.JsonUtils.toPretty
import org.springframework.stereotype.Service

@Service
class ProductServiceDefaultImpl(
    private val productMapper: ProductMapper,
) : ProductService {
    override fun printProduct(productDto: ProductDto) {
        val product = productMapper.toProduct(productDto)

        println("ProductDto: ${productDto.toPretty()}")
        println("Product: ${product.toPretty()}")
    }
}
