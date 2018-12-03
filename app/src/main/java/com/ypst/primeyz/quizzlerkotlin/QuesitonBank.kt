package com.ypst.primeyz.quizzlerkotlin

import java.util.ArrayList

/**
 * Created by yepyaesonetun on 12/3/18.
 **/

class QuesitonBank {
    internal var list: MutableList<Question> = ArrayList()

        fun initQuestions() {
            list.add(Question("Valentine\'s day is banned in Saudi Arabia.", true))
            list.add(Question("A slug\'s blood is green.", true))
            list.add(Question("Approximately one quarter of human bones are in the feet.", true))
            list.add(Question("The total surface area of two human lungs is approximately 70 square metres.", true))
            list.add(
                Question(
                    "In West Virginia, USA, if you accidentally hit an animal with your car, you are free to take it home to eat.",
                    true
                )
            )
            list.add(
                Question(
                    "In London, UK, if you happen to die in the House of Parliament, you are technically entitled to a state funeral, because the building is considered too sacred a place.",
                    false
                )
            )
            list.add(Question("It is illegal to pee in the Ocean in Portugal.", true))
            list.add(Question("You can lead a cow down stairs but not up stairs.", false))
            list.add(Question("Google was originally called \"Backrub\".", true))
            list.add(Question("Buzz Aldrin\'s mother\'s maiden name was \"Moon\".", true))
            list.add(
                Question(
                    "The loudest sound produced by any animal is 188 decibels. That animal is the African Elephant.",
                    false
                )
            )
            list.add(Question("No piece of square dry paper can be folded in half more than 7 times.", false))
            list.add(
                Question(
                    "Chocolate affects a dog\'s heart and nervous system; a few ounces are enough to kill a small dog.",
                    true
                )
            )

    }


}