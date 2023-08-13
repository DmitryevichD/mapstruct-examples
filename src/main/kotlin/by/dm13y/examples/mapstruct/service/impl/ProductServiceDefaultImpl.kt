package by.dm13y.examples.mapstruct.service.impl

import by.dm13y.examples.mapstruct.model.dto.ProductDto
import by.dm13y.examples.mapstruct.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceDefaultImpl: ProductService {
    override fun printProduct(productDto: ProductDto) {
        TODO("Not yet implemented")
    }
}
