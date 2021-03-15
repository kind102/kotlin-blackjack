package study

class Skills {
    private val _values: MutableList<Skill> = mutableListOf()
    val values: List<Skill>
        get() = _values.toList()

    fun soft(soft: String) {
        _values.add(Soft(soft))
    }

    fun hard(hard: String) {
        _values.add(Hard(hard))
    }
}

sealed class Skill

data class Soft(val soft: String) : Skill()

data class Hard(val hard: String) : Skill()
