# Терминал с графиком котировок

Android-приложение с отображением графика котировок, созданное для демонстрации работы с Jetpack Compose и отрисовки кастомного UI.

<p align="center">
  <img src="https://github.com/user-attachments/assets/f41f2ba4-2eaa-475a-a79a-b851bbd33310" width="750" />
</p>

---

## Запуск
1. Склонировать репозиторий
2. Открыть проект в Android Studio
3. Запустить конфигурацию `app`
   
---

## Стек
- Kotlin
- **UI:** Jetpack Compose
- **Custom UI:** Compose Canvas (custom drawing), кастомный Composable
- **Presentation:** ViewModel + StateFlow
- **Network:** Retrofit/OkHttp (API опционально, по умолчанию mock)

> В проекте предусмотрена работа с API, но для стабильного демо по умолчанию используется мок-источник данных (API может меняться).

---

## Назначение проекта
Проект создан для демонстрации работы:
- Jetpack Compose — построение всего интерфейса на декларативном фреймворке.
- Custom Drawing — отрисовка графиков через Canvas API.
- Реактивное управление состоянием — StateFlow + ViewModel 

