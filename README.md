# STALCRAFT Build Calculator

![Android](https://img.shields.io/badge/Platform-Android-green)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple)
![Gradle](https://img.shields.io/badge/Build-Gradle-blue)

## Описание

STALCRAFT Build Calculator — учебное Android-приложение, разрабатываемое на Kotlin для создания и расчёта игровых сборок в STALCRAFT.

На текущем этапе проект содержит базовый пользовательский интерфейс и заготовку для дальнейшей реализации системы подбора экипировки и вооружения.

## Текущее состояние

На данный момент приложение:

* запускается на Android-устройстве;
* загружает основной интерфейс;
* использует собственные графические ресурсы;
* содержит базовую структуру проекта для дальнейшей разработки.

При запуске отображается уведомление о загрузке калькулятора сборок.

## Используемые технологии

* Kotlin
* Android SDK
* AppCompat
* XML Layouts
* Gradle Kotlin DSL

## Структура проекта

```text
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/scca/
│   │   │   └── MainActivity.kt
│   │   ├── layout/
│   │   │   └── activity_main.xml
│   │   ├── drawable/
│   │   ├── values/
│   │   └── AndroidManifest.xml
│   ├── test/
│   └── androidTest/
├── build.gradle.kts
└── proguard-rules.pro
```

## Сборка проекта

### Требования

* Android Studio
* Android SDK
* JDK 17+
* Gradle

### Запуск

```bash
git clone https://github.com/cacawaca/R1MDK04.git
```

Откройте проект в Android Studio и выполните запуск на эмуляторе или физическом Android-устройстве.

## Планируемый функционал

* выбор оружия;
* выбор брони;
* выбор шлемов;
* расчёт характеристик сборки;
* сохранение пользовательских конфигураций;
* сравнение нескольких сборок;
* улучшение интерфейса и визуализации.

## Цель проекта

Проект разработан в рамках изучения мобильной разработки под Android и демонстрирует использование Kotlin, XML-разметки и Android SDK для создания игровых вспомогательных приложений.

## Автор

Танюшкин Александр

GitHub: https://github.com/cacawaca/R1MDK04
