package by.dm13y.examples.mapstruct.service.impl

import by.dm13y.examples.mapstruct.service.PersonService
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl:PersonService {
    override fun getPersonById(id: Int): String {
        return "person_${id}"
    }
}