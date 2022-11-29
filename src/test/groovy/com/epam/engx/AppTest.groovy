package com.epam.engx

import spock.lang.Specification

import java.time.LocalDate
import java.time.Period

class AppTest extends Specification {
    def 'should add arguments'() {

        expect:
        App.add(a, b) == expected

        where:
        a               | b                  | expected
        2g              | 4g                 | 6g
        1               | 3                  | 4
        98.1f           | 1.9f               | 100.0f
        LocalDate.now() | Period.ofDays(100) | LocalDate.now().plusDays(100)

    }
}
