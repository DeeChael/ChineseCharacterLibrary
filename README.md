# Chinese Character Library (WIP)
## Get the pronounciation and tone of a Chinese character!

---
## How to use?

### Added ChineseCharacterLibrary as dependency
**Maven**
```xml
<dependency>
    <groupId>net.deechael</groupId>
    <artifactId>chschar</artifactId>
    <version>1.00.0</version>
</dependency>
```

**Gradle**
```groovy
dependencies {
    //...
    implementation 'net.deechael:chschar:1.00.0'
}
```

### Using the library
**Java**
```java
import net.deechael.chschar.ChineseCharacter;
import net.deechael.chschar.ChineseCharacterLibrary;
import net.deechael.chschar.Pronunciation;

public class Main {

    public static void main(String[] args) {
        char you = '你';
        ChineseCharacter character = ChineseCharacterLibrary.get(you);
        System.out.println(character.getCharacter());
        System.out.println(character.getPronunciations().size());
        for (Pronunciation pronunciation : character.getPronunciations()) {
            System.out.println(pronunciation.getPhoneticizationString());
            System.out.println(pronunciation.getPhoneticizationStringWithV());
            System.out.println(pronunciation.getPhoneticizationStringWithTone());
        }
    }
}
```
Will print:
```text
你
1
ni
ni
nǐ
```
---
## This library is in developing because I'm putting each character into the map in the ChineseCharacterLibrary class by hand