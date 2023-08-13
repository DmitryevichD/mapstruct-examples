package by.dm13y.examples.mapstruct.mapper

import by.dm13y.examples.mapstruct.config.mapper.ProductMapperConfig
import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.model.entity.Product
import org.mapstruct.*
import java.time.LocalDateTime
import kotlin.reflect.KFunction1

@Mapper(componentModel = "spring", config = ProductMapperConfig::class)
interface ProductMapper {

    @Mapping(source = "productName", target = "name")
    fun toProduct(productDto: ProductDto): Product

    fun toProducts(productDtos: List<ProductDto>): List<Product>

    @Mapping(source = "productDto.productName", target = "name")
    @Mapping(source = "productDto.ownerId", target = "ownerName", qualifiedByName = ["getOwnerByName"])
    fun toProductWithOwner(productDto: ProductDto, @Context ownerNameFunction: KFunction1<Int, String>): Product

    @Named("getOwnerByName")
    fun getOwnerByName(ownerId: Int, @Context ownerNameFunction: KFunction1<Int, String>): String =
        ownerNameFunction.call(ownerId)

    @AfterMapping
    fun udpateDate(@MappingTarget product: Product) {
        product.mappingDate = LocalDateTime.now()
    }
}
