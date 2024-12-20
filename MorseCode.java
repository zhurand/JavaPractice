//Азбука Морзе
//
//Вам дан английский текст. Закодируйте его с помощью азбуки Морзе каждая буква заменяется
//на последовательность точек и тире. В качестве тире используйте обычный дефис: -, а в качестве точки — точку ..
//Например, буква g превратится в трёхсимвольную строку --..
//Между закодированными буквами ставится ровно один пробел. Например, слово Help превратится в .... . .-.. .--..
//Обратите внимание, что строчные и заглавные буквы кодируются одинаково.
//
//Формат ввода
//Весь текст записан в единственной строке. Текст состоит из английских букв и пробелов,
//других символов в тексте нет. В тексте не может быть двух или более пробелов подряд.
//
//Формат вывода
//Выведите каждое слово исходного текста, закодированное азбукой Морзе, на отдельной строке.
//Количество строк в ответе должно совпадать с количеством слов в исходном тексте.
//
//Примечание
//Один из вариантов словаря с Азбукой Морзе:
//'A': '.-', 'B': '-...', 'C': '-.-.',
//'D': '-..', 'E': '.', 'F': '..-.',
//'G': '--.', 'H': '....', 'I': '..',
//'J': '.---', 'K': '-.-', 'L': '.-..',
//'M': '--', 'N': '-.', 'O': '---',
//'P': '.--.', 'Q': '--.-', 'R': '.-.',
//'S': '...', 'T': '-', 'U': '..-',
//'V': '...-', 'W': '.--', 'X': '-..-',
//'Y': '-.--', 'Z': '--..',
//'0': '-----', '1': '.----', '2': '..---',
//'3': '...--', '4': '....-', '5': '.....',
//'6': '-....', '7': '--...', '8': '---..',
//'9': '----.'

import java.util.Scanner;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseCode {
    public static void main(String[] args) {

        Map<String, String> morseCode = (Map<String, String>) Stream.of(new String[][] {
                { "A", ".-" }, { "B", "-..." }, { "C", "-.-." },
                { "D", "-.."}, { "E", "." }, { "F", "..-." },
                { "G", "--." }, { "H", "...." }, { "I", ".." },
                { "J", ".---" }, { "K", "-.-" }, { "L", ".-.." },
                { "M", "--" }, { "N", "-." }, { "O", "---" },
                { "P", ".--." }, { "Q", "--.-" }, { "R", ".-." },
                { "S", "..." }, { "T", "-" }, { "U", "..-" },
                { "V", "...-" }, { "W", ".--" }, { "X", "-..-" },
                { "Y", "-.--" }, { "Z", "--.." }, { "0", "-----" },
                { "1", ".----" }, { "2", "..---" }, { "3", "...--" },
                { "4", "....-" }, { "5", "....." }, { "6", "-...." },
                { "7", "--..." }, { "8", "---.." }, { "9", "----." },
        }).collect(Collectors.collectingAndThen(
                Collectors.toMap(data -> data[0], data -> data[1]),
                Collections::<String, String> unmodifiableMap));

        StringBuilder encodedText = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toUpperCase();

        for ( String word : text.split(" ") ) {
            for ( char letter : word.toCharArray() ) {
                String str = "" + letter;
                String encodedLetter = morseCode.get((str));
                encodedText.append(encodedLetter);
                encodedText.append(" ");
            }
            encodedText.append("\n");
        }

        System.out.println(encodedText);
    }
}
