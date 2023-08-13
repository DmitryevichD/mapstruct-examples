package by.dm13y.examples.mapstruct.model.dto

data class ProductDto(

    var cardCode: Long? = null,
    var cashBack: Double? = null,
    var type: String? = null,
    var productName: String? = null,
    var ownerId: Int? = null,
)
