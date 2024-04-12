package me.fortibrine.springsample

class ClassicalMusic private constructor(): Music {
    override fun getSong(): String {
        return "Hungarian Rhapsodyr"
    }

    fun doMyInit() {
        println("Doing my initialization")
    }

    fun doMyDestroy() {
        println("Doing my destruction")
    }

    companion object {
        @JvmStatic
        fun getClassicalMusic(): ClassicalMusic {
            return ClassicalMusic()
        }
    }

}