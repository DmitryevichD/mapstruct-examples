package by.dm13y.examples.mapstruct.model.entity

import by.dm13y.examples.mapstruct.model.enums.ProductType
import java.time.LocalDateTime

class Product(
    var code: String? = null,
    var cardCode: Long? = null,
    var type: ProductType? = null,
    var name: String? = null,
    var ownerName: String? = null,
    var mappingDate: LocalDateTime? = null
)
