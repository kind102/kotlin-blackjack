package study

class Languages {
    private val _values: MutableMap<String, Int> = mutableMapOf()
    val values: Map<String, Int>
        get() = _values.toMap()

    infix fun String.level(level: Int) {
        _values[this] = level
    }
}