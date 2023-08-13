package by.dm13y.examples.mapstruct.service.impl

import by.dm13y.examples.mapstruct.service.ProductService
import by.dm13y.examples.mapstruct.utils.ProductGenerator
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ProductServiceDefaultImplTest {
    @Autowired
    lateinit var productService: ProductService


    @Test
    fun printProduct() {
        try {
            val productDto = ProductGenerator.generateProductDto()
            productService.printProduct(productDto)
            fail("Must be throw exception")
        } catch (ex: NotImplementedError) {
            assertTrue(true, "It works well")
        }
    }
}