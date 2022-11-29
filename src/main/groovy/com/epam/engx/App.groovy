package com.epam.engx

class App {
    static void main(String... args) {
        def c = add(2g, 3g)
        println(c)

        def d = add(3, 4)
        println(d)
    }

    static <T> T add(T a, T b) {
        a + b
    }
}

