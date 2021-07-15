package com.svetikov.examplekotlinr2dbcp.repository

import java.util.*

interface PersonSummary {
     fun getId(): UUID
    fun getName(): String
    fun getAddress(): AddressSummary
    interface AddressSummary {
        fun getCity(): String
        fun getStreet(): String
        fun getZip_code(): String
    }
}