package ru.netology

fun main() {
    val lastVisit = 2444

    when (lastVisit) {
        in 0..60 -> print("Был(а) в сети только что")
        in 61..3600 -> agoToTextMinute(lastVisit)
        in 3601..86400 -> agoToTextHour(lastVisit)
        in 86401..115200 -> print("Был(а) в сети сегодня")
        in 115201..172800 -> print("Был(а) в сети вчера")
        else -> print("Был(а) в сети уже давненько")
    }
}

fun agoToTextMinute(lastVisit: Int) {
    val lastVisitMinute = lastVisit / 60
    val spell = if (lastVisitMinute == 11) lastVisitMinute else lastVisitMinute % 10
    when (spell) {
        1 -> print("Был(а) в сети $lastVisitMinute минуту назад")
        2, 3, 4 -> print("Был(а) в сети $lastVisitMinute минуты назад")
        else -> print("Был(а) в сети $lastVisitMinute минут назад")
    }
}

fun agoToTextHour(lastVisit: Int) {
    val lastVisitHour = (lastVisit / 3600).toInt()
    val spell = lastVisitHour % 10
    when (spell) {
        1 -> print("Был(а) в сети $lastVisitHour час назад")
        2, 3, 4 -> print("Был(а) в сети $lastVisitHour часа назад")
        else -> print("Был(а) в сети $lastVisitHour часов назад")
    }
}