package shahid.raza.testproject.data

object ListItemGenerator {

    private val commonWords = listOf(
        "Red", "Apple", "Fast", "Car", "Blue", "Sky", "Green", "Tree",
        "Happy", "Cat", "Dog", "Sun", "Moon", "Star", "Light", "Dark",
        "Fire", "Water", "Earth", "Air", "Wind", "Rain", "Snow", "Ice",
        "Gold", "Silver", "Iron", "Steel", "Rock", "Stone", "Cloud", "Storm"
    )

    fun generateList(): List<ListItem> {
        return (1..100).map { index ->
            val word1 = commonWords[index % commonWords.size]
            val word2 = commonWords[(index * 3) % commonWords.size]
            ListItem(index, "$word1 $word2")
        }
    }
}