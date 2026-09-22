# Java Practice

[![Java](https://img.shields.io/badge/Java-21%2B-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Tasks](https://img.shields.io/badge/tasks-33-blue)](#задачи)

Коллекция из 33 самостоятельных учебных задач на Java. Репозиторий охватывает базовый синтаксис, алгоритмы, строки, коллекции, рекурсию, обработку исключений, файловый ввод-вывод и объектно-ориентированное программирование.

Каждое решение находится в отдельном `.java`-файле. Условия задач приведены в комментариях в начале файлов.

## Изучаемые темы

- ввод и вывод данных;
- типы данных, условия, циклы и функции;
- строки, массивы и коллекции;
- рекурсия и базовые алгоритмы;
- стеки и очереди;
- перечисления (`enum`);
- наследование и полиморфизм;
- исключения, чтение, запись и сериализация объектов.

## Задачи

### Базовый синтаксис и алгоритмы

| Решение | Описание |
| --- | --- |
| [`EvenOdd.java`](EvenOdd.java) | Определение чётности числа |
| [`Factorial.java`](Factorial.java) | Вычисление факториала |
| [`GOD.java`](GOD.java) | Поиск наибольшего общего делителя алгоритмом Евклида |
| [`SumOfDigitsOfNumber.java`](SumOfDigitsOfNumber.java) | Вычисление суммы цифр числа |
| [`StrongInteger.java`](StrongInteger.java) | Поиск максимальной цифры числа |
| [`ExactPowerOfTwo.java`](ExactPowerOfTwo.java) | Проверка числа на точную степень двойки |
| [`GetSequence.java`](GetSequence.java) | Построение последовательности от A до B с помощью рекурсии |
| [`MultiplicationTable.java`](MultiplicationTable.java) | Генерация таблицы умножения заданного размера |
| [`MassExponentiation.java`](MassExponentiation.java) | Возведение последовательности чисел в заданную степень |
| [`OrangeSlices.java`](OrangeSlices.java) | Перебор способов разделить апельсин между тремя людьми |
| [`ReadySetGo.java`](ReadySetGo.java) | Формирование обратного отсчёта для участников гонки |
| [`Week.java`](Week.java) | Определение дня недели с помощью `switch` |
| [`EvilTerritory.java`](EvilTerritory.java) | Определение типа треугольника по длинам сторон |
| [`PorridgeMenu.java`](PorridgeMenu.java) | Создание циклического меню на несколько дней |

### Строки, коллекции и структуры данных

| Решение | Описание |
| --- | --- |
| [`Bunny.java`](Bunny.java) | Подсчёт частоты слов с помощью `HashMap` |
| [`ClearingData.java`](ClearingData.java) | Фильтрация и очистка строк отчёта |
| [`MorseCode.java`](MorseCode.java) | Кодирование английского текста азбукой Морзе |
| [`Namesakes.java`](Namesakes.java) | Подсчёт однофамильцев |
| [`Palindrome.java`](Palindrome.java) | Проверка строки на палиндром без учёта регистра и пробелов |
| [`PorridgeLovers.java`](PorridgeLovers.java) | Поиск пересечения двух множеств |
| [`SymbolicSqueeze.java`](SymbolicSqueeze.java) | Получение уникальных символов строки |
| [`DataStructureQueue.java`](DataStructureQueue.java) | Собственная реализация очереди FIFO |
| [`DataStructureStack.java`](DataStructureStack.java) | Собственная реализация стека LIFO |
| [`PolishCalculator.java`](PolishCalculator.java) | Вычисление выражения в обратной польской нотации |

### Объектно-ориентированное программирование

| Решение | Описание |
| --- | --- |
| [`Animals.java`](Animals.java) | Наследование и переопределение звуков животных |
| [`AreaFigure.java`](AreaFigure.java) | Полиморфный расчёт площади геометрических фигур |
| [`ChemicalElements.java`](ChemicalElements.java) | Представление химических элементов с помощью `enum` |
| [`CoolRectangle.java`](CoolRectangle.java) | Класс прямоугольника: площадь, периметр, перемещение и изменение размера |
| [`StudentAndAspirant.java`](StudentAndAspirant.java) | Наследование классов студента и аспиранта |
| [`WorkIsNotWolf.java`](WorkIsNotWolf.java) | Учёт должности, рабочего времени и зарплаты программиста |

### Файлы и исключения

| Решение | Описание |
| --- | --- |
| [`Cheque.java`](Cheque.java) | Формирование чека и запись результата в файл `Cheque` |
| [`Division.java`](Division.java) | Чтение чисел из файла `Numbers` и обработка деления на ноль |
| [`SavingAndLoading.java`](SavingAndLoading.java) | Сериализация и десериализация объекта `Person` |

## Требования

- JDK 21 или новее;
- терминал либо IDE с поддержкой Java, например IntelliJ IDEA.

JDK 21 необходим для методов `getFirst()` и `getLast()`, используемых в некоторых решениях.

Проверить установленную версию Java:

```bash
java -version
javac -version
```

## Запуск

1. Клонируйте репозиторий:

```bash
git clone https://github.com/zhurand/JavaPractice.git
cd JavaPractice
```

2. Скомпилируйте нужную задачу. Например, для вычисления факториала:

```bash
javac Factorial.java
```

3. Запустите скомпилированный класс:

```bash
java Factorial
```

4. Введите исходные данные в терминале в соответствии с условием в начале файла.

Для запуска другой задачи замените `Factorial` именем соответствующего файла без расширения `.java`:

```bash
javac Palindrome.java
java Palindrome
```

## Особенности файловых задач

- `Cheque.java` читает данные из консоли и создаёт файл `Cheque` в текущем каталоге.
- `Division.java` ожидает файл `Numbers` с двумя целыми числами, разделёнными пробелом.
- `SavingAndLoading.java` работает с сериализованным объектом в файле `Person.ser`.

Файлы создаются или читаются относительно каталога, из которого запущена программа.
