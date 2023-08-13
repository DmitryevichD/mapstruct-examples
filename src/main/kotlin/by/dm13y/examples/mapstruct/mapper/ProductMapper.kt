package by.dm13y.examples.mapstruct.mapper

import by.dm13y.examples.mapstruct.config.mapper.ProductMapperConfig
import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.model.entity.Product
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring", config = ProductMapperConfig::class)
interface ProductMapper {

    @Mapping(source = "productName", target = "name")
    fun toProduct(productDto: ProductDto): Product
}
