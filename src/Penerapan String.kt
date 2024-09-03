fun main() {
    // Character occurrence in a sentence analysis
    // The string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println("Original sentence: $s")

    // Convert the string to lowercase
    s = s.lowercase()

    // Counters initialization
    var vowelCount = 0
    var consonantCount = 0

    // Definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxyz"

    // Main loop
    for (c in s) {
        when {
            c in vowels -> vowelCount++
            c in consonants -> consonantCount++
        }
    }

    // Calculate the number of other characters
    val otherCount = s.length - (vowelCount + consonantCount)

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: $otherCount")
}
