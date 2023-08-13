package by.dm13y.examples.mapstruct.utils

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule

object JsonUtils {
    private val objectMapper = ObjectMapper()
        .also { it.enable(SerializationFeature.INDENT_OUTPUT) }
        .also { it.registerModule( JavaTimeModule()) }
        .also { it.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false) }

    fun Any.toPretty(): String = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this)
}