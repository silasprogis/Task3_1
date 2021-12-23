package ru.netology

fun main() {
    var lastVisit = 51
    var lastVisit61 = 61
    var lastVisit2401 = 2401
    var lastVisitToday = 57601
    var lastVisitYesterday = 115201
    var lastVisitLongTimeAgo = 172801

    when (lastVisit) {
        in 0..60 -> agoToTextMinute(lastVisit)
        /*in 61..2400 -> agoToTextMinute(lastVisit)
        in 2401..57600 -> agoToTextHour(lastVisit)
        in 57601..115200 -> agoToTextDay(lastVisit)
        in 115201..172800 -> agoToTextTwoDay(lastVisit)
        else -> agoToTextInfinity(lastVisit)*/
    }


}

fun agoToTextNow(lastVisit: Int) {
    print("Был(а) в сети только что")
}
fun agoToTextMinute(lastVisit: Int) {
    var spell = if (lastVisit == 11) lastVisit else lastVisit % 10
    when (spell) {
        1 -> print("Был(а) в сети $lastVisit минуту назад")
        2, 3, 4 -> print("Был(а) в сети $lastVisit минуты назад")
        else -> print("Был(а) в сети $lastVisit минут назад")
    }
}