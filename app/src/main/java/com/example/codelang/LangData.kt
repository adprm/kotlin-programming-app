package com.example.codelang

object LangData {
    private val langNames = arrayOf(
        "JavaScript",
        "Python",
        "Java",
        "GO",
        "Elixir",
        "Ruby",
        "Kotlin",
        "TypeScript",
        "Scala",
        "Clojure"
    )
    private val langDetails = arrayOf(
        "JavaScript adalah salah satu bahasa pemrograman yang paling banyak digunakan dalam kurun waktu dua puluh tahun ini. Bahkan JavaScript juga dikenal sebagai salah satu dari tiga bahasa pemrograman utama bagi web developer",
        "Python merupakan bahasa pemrograman tingkat tinggi yang diracik oleh Guido van Rossum",
        "Java sebagai salah satu bahasa pemrograman yang sudah berumur dari era 1990-an, kian berkembang dan melebarkan dominasinya di berbagai bidang. Salah satu penggunaan terbesar Java adalah dalam pembuatan aplikasi native untuk Android",
        "Golang adalah bahasa pemrograman baru yang dikembangkan di Google oleh Robert Griesemer, Rob Pike, dan Ken Thompson pada tahun 2007 dan mulai diperkenalkan di publik tahun 2009",
        "Elixir Sebagai bahasa pemrograman yang terbilang baru, Elixir memiliki peminat yang cukup banyak. Namun bahan belajar Elixir ini masih didominasi oleh konten berbahasa Inggris. Bahasa pemrograman yang dibuat oleh Jose Valim ini, mampu mempermudah programmer dari bahasa pemrograman yang belum terbiasa dengan functional langsung jatuh hati dengan Elixir",
        "Ruby Bahasa pemrograman open source dinamis, mudah dimengerti dan produktif",
        "Kotlin diresmikan sebagai bahasa kedua yang didukung untuk dipakai membuat aplikasi Android di Android Studio. Saat ini, posisi Java sebagai bahasa utama memang belum digantikan oleh Kotlin. Namun tidak dapat disangkal pula bahwa, perkembangan bahasa Kotlin di komunitas developer Android sangat pesat",
        "Type Script adalah bahasa pemrograman berbasis JavaScript yang menambahkan fitur strong-typing & konsep pemrograman OOP klasik",
        "Scala merupakan bahasa pemrograman yang bersifat functional dan object oriented. Bahasa pemrograman Scala ditulis oleh Martin Odersky, beliau merupakan seseorang yang membuat fitur Generic di Java, serta berbagai fitur yang membuat Java lebih baik",
        "Clojure adalah bahasa pemrograman sekaligus kompilator. Sintaksis dari Clojure merupakan dialek dari Lisp")
    private val langImages = intArrayOf(
        R.drawable.js,
        R.drawable.py,
        R.drawable.java,
        R.drawable.go,
        R.drawable.elixir,
        R.drawable.ruby,
        R.drawable.kotlin,
        R.drawable.ts,
        R.drawable.scala,
        R.drawable.clojure
    )

    val listData: ArrayList<Lang>
        get() {
            val list = arrayListOf<Lang>()
            for (position in langNames.indices) {
                val lang = Lang()
                lang.name = langNames[position]
                lang.detail = langDetails[position]
                lang.photo = langImages[position]
                list.add(lang)
            }
            return list
        }

}