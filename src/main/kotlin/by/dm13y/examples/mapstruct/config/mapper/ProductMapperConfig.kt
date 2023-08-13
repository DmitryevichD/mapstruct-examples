package by.dm13y.examples.mapstruct.config.mapper

import org.mapstruct.MapperConfig
import org.mapstruct.ReportingPolicy

/**
 * Default properties for mapstruct mappers see [by.dm13y.examples.mapstruct.mapper]
 */

@MapperConfig(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ProductMapperConfig