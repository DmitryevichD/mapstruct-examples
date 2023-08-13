package by.dm13y.examples.mapstruct.model.entity

import by.dm13y.examples.mapstruct.model.enums.ProductType

class Product(
    var code: String? = null,
    var cardCode: Long? = null,
    var type: ProductType? = null,
    var name: String? = null,
    var ownerName: String? = null
)
