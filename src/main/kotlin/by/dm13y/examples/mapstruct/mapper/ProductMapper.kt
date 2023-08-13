package by.dm13y.examples.mapstruct.mapper

import by.dm13y.examples.mapstruct.config.mapper.ProductMapperConfig
import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.model.entity.Product
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", config = ProductMapperConfig::class)
interface ProductMapper {
    fun toProduct(productDto: ProductDto): Product
}
