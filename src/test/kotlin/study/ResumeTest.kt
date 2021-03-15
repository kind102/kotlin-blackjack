package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResumeTest {

    @Test
    fun name() {
        val person: Person = introduce {
            name("이름")
            company("회사명")
            skills {
                soft("A")
                soft("B")
                hard("Kotlin")
            }
            languages {
                "Korean" level 5
                "English" level 3
            }
        }
        assertThat(person.name).isEqualTo("이름")
        assertThat(person.company).isEqualTo("회사명")
        assertThat(person.skills.values).containsExactlyInAnyOrder(Soft("A"), Soft("B"), Hard("Kotlin"))
        assertThat(person.languages.values).containsKey("Korean")
    }
}
