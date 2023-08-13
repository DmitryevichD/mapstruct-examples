package by.dm13y.examples.mapstruct.service.impl

import by.dm13y.examples.mapstruct.service.ProductService
import by.dm13y.examples.mapstruct.utils.ProductGenerator
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ProductServiceDefaultImplTest {
    @Autowired
    lateinit var productService: ProductService


    @Test
    fun printProduct() {
        val productDto = ProductGenerator.generateProductDto()
        productService.printProduct(productDto)
    }

    @Test
    fun printProducts() {
        val products = ProductGenerator.generateProductDtos(3)
        productService.printProducts(products)
    }
}