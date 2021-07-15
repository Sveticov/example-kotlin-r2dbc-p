package com.svetikov.examplekotlinr2dbcp.configuration

import com.svetikov.examplekotlinr2dbcp.model.Person
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import java.util.*

@ReadingConverter
class PersonReadConverter:Converter<Row,Person> {
    override fun convert(source: Row): Person? {
       val address = Person.Address(
           source.get("street") as String,
           source.get("zip_code") as String,
           source.get("city") as String
       )
        return Person(
            source.get("id") as UUID,
            source.get("name") as String,
            address
        )
    }


}