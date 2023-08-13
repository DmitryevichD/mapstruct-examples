package by.dm13y.examples.mapstruct.service

/**
 * Service define contract that used to manage persons
 */
interface PersonService {
    fun getPersonById(id: Int):String
}
