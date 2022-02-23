package com.example.hw12_maktab67_part1_version2

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VM : ViewModel() {

    // Profile

    var user: MutableLiveData<Profile> = MutableLiveData()

    var isProfileSet: MutableLiveData<Boolean> = MutableLiveData(false)

    // Home

    var movieA = Movie(
        MutableLiveData("The Pianist"),
        MutableLiveData("likeA"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdA"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/5fe6215e-3fe1-442d-a311-8c5f7b1c261f.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/5fe6215e-3fe1-442d-a311-8c5f7b1c261f.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieB = Movie(
        MutableLiveData("The Godfather"),
        MutableLiveData("likeB"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdB"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/97f64b62-2006-4c43-85b8-37e969b0ad24.JPG?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/97f64b62-2006-4c43-85b8-37e969b0ad24.JPG?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieC = Movie(
        MutableLiveData("Whiplash"),
        MutableLiveData("likeC"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdC"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/610d1927-d141-4056-9738-4f769788331b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/610d1927-d141-4056-9738-4f769788331b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieD = Movie(
        MutableLiveData("The Dark Knight"),
        MutableLiveData("likeD"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdD"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/9202a96a-4274-4300-ba0a-a0b9f956846e.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/9202a96a-4274-4300-ba0a-a0b9f956846e.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieE = Movie(
        MutableLiveData("12 Angry Men"),
        MutableLiveData("likeE"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdE"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/d6f888ab-22a0-493e-b858-58fe1efd4b74.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/d6f888ab-22a0-493e-b858-58fe1efd4b74.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieF = Movie(
        MutableLiveData("Schindler's List"),
        MutableLiveData("likeF"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdF"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/2927a397-6fe6-45cf-9c2d-66296fa2037b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/2927a397-6fe6-45cf-9c2d-66296fa2037b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieG = Movie(
        MutableLiveData("Pulp Fiction"),
        MutableLiveData("likeG"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdG"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/08b879a6-5601-42cd-b267-651b0494dbbf.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/08b879a6-5601-42cd-b267-651b0494dbbf.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieH = Movie(
        MutableLiveData("Gladiator"),
        MutableLiveData("likeH"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdH"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/d31f71a9-6d6a-45b9-b8db-8c2a26d4933a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieI = Movie(
        MutableLiveData("Fight Club"),
        MutableLiveData("likeI"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdI"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/139d1779-adc3-43c6-9ac7-822673fd3e2a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieJ = Movie(
        MutableLiveData("Forrest Gump"),
        MutableLiveData("likeJ"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdJ"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/8ed1cbe9-aee5-435b-ad3a-4f0aaa495dc8.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieK = Movie(
        MutableLiveData("Inception"),
        MutableLiveData("likeK"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdK"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/3a5f7bd5-10d4-4edf-a849-d987d7562a2b.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/3a5f7bd5-10d4-4edf-a849-d987d7562a2b.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieL = Movie(
        MutableLiveData("The Matrix"),
        MutableLiveData("likeL"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdL"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/301d44a5-b46e-410e-ba32-104624bb2923.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294 1x,https://static.namava.ir/Content/Upload/Images/301d44a5-b46e-410e-ba32-104624bb2923.jpg?anchor=middlecenter&crop=auto&scale=both&w=400&h=588 2x")
    )
    val movieM = Movie(
        MutableLiveData("Goodfellas"),
        MutableLiveData("likeM"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdM"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/0f014102-5363-488a-8308-23cf0223f066.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieN = Movie(
        MutableLiveData("WALL·E"),
        MutableLiveData("likeN"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdN"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/40bf4d6b-b6f3-49f7-a361-8ea5dffb7e91.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieO = Movie(
        MutableLiveData("The Prestige"),
        MutableLiveData("likeO"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdO"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/e267309f-c5b8-470e-8f30-18e7f6152711.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieP = Movie(
        MutableLiveData("Joker"),
        MutableLiveData("likeP"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdP"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/348e0038-d0d6-4466-a775-b6383fd0294a.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieQ = Movie(
        MutableLiveData("Memento"),
        MutableLiveData("likeQ"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdQ"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/7ba67313-5577-4b2f-9be1-51159f03a816.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieR = Movie(
        MutableLiveData("Interstellar"),
        MutableLiveData("likeR"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdR"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/ef3e0221-c0e1-4581-ac48-d033c1182086.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieS = Movie(
        MutableLiveData("Spirited Away"),
        MutableLiveData("likeS"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdS"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/d3afad0e-66a6-4f6a-a515-683246ff30b5.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieT = Movie(
        MutableLiveData("Braveheart"),
        MutableLiveData("likeT"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdT"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/ea7c8294-2a34-4a67-bbc8-db2f74287f98.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val movieU = Movie(
        MutableLiveData("Parasite"),
        MutableLiveData("likeU"),
        MutableLiveData(false),
        MutableLiveData("favoriteIdU"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/40100765-12d4-4f85-ad59-d0819c6b172f.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )

    fun btnA() {
        val temp = movieA.isLiked.value?.not()
        movieA.isLiked.value = temp
    }

    fun btnB() {
        val temp = movieB.isLiked.value?.not()
        movieB.isLiked.value = temp
    }

    fun btnC() {
        val temp = movieC.isLiked.value?.not()
        movieC.isLiked.value = temp
    }

    fun btnD() {
        val temp = movieD.isLiked.value?.not()
        movieD.isLiked.value = temp
    }

    fun btnE() {
        val temp = movieE.isLiked.value?.not()
        movieE.isLiked.value = temp
    }

    fun btnF() {
        val temp = movieF.isLiked.value?.not()
        movieF.isLiked.value = temp
    }

    fun btnG() {
        val temp = movieG.isLiked.value?.not()
        movieG.isLiked.value = temp
    }

    fun btnH() {
        val temp = movieH.isLiked.value?.not()
        movieH.isLiked.value = temp
    }

    fun btnI() {
        val temp = movieI.isLiked.value?.not()
        movieI.isLiked.value = temp
    }

    fun btnJ() {
        val temp = movieJ.isLiked.value?.not()
        movieJ.isLiked.value = temp
    }

    fun btnK() {
        val temp = movieK.isLiked.value?.not()
        movieK.isLiked.value = temp
    }

    fun btnL() {
        val temp = movieL.isLiked.value?.not()
        movieL.isLiked.value = temp
    }

    fun btnM() {
        val temp = movieM.isLiked.value?.not()
        movieM.isLiked.value = temp
    }

    fun btnN() {
        val temp = movieN.isLiked.value?.not()
        movieN.isLiked.value = temp
    }

    fun btnO() {
        val temp = movieO.isLiked.value?.not()
        movieO.isLiked.value = temp
    }

    fun btnP() {
        val temp = movieP.isLiked.value?.not()
        movieP.isLiked.value = temp
    }

    fun btnQ() {
        val temp = movieQ.isLiked.value?.not()
        movieQ.isLiked.value = temp
    }

    fun btnR() {
        val temp = movieR.isLiked.value?.not()
        movieR.isLiked.value = temp
    }

    fun btnS() {
        val temp = movieS.isLiked.value?.not()
        movieS.isLiked.value = temp
    }

    fun btnT() {
        val temp = movieT.isLiked.value?.not()
        movieT.isLiked.value = temp
    }

    fun btnU() {
        val temp = movieU.isLiked.value?.not()
        movieU.isLiked.value = temp
    }

    // Coming Soon

    val comingSoonOne = MovieComingSoon(
        MutableLiveData("Up"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/db3ca0ae-69c8-4dbf-8717-08a5a79bf3d8.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val comingSoonTwo = MovieComingSoon(
        MutableLiveData("The Wolf of Wall Street"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/3087048f-d013-4d13-aeff-87ff5180c893.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )
    val comingSoonThree = MovieComingSoon(
        MutableLiveData("The Last of Us"),
        MutableLiveData("https://static.namava.ir/Content/Upload/Images/db9ea1c8-ab6f-4d24-a943-a0d7050a6769.jpg?anchor=middlecenter&crop=auto&scale=both&w=200&h=294")
    )

    fun shareMovieOne() = share(1)
    fun shareMovieTwo() = share(2)
    fun shareMovieThree() = share(3)

    private fun share(input: Int): Intent {
        var temp: MovieComingSoon? = null
        when (input) {
            1 -> temp = comingSoonOne
            2 -> temp = comingSoonTwo
            3 -> temp = comingSoonThree
        }
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, temp?.imageUrl?.value)
            type = "text/plain"
        }

        return Intent.createChooser(intent, "share movie")
    }

}