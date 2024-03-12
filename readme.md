# AQA-2
Этот код представляет 6 тестов покрывающие основной функционал приложения
# Установка
1 ```bash
git clone https://github.com/Iogsothot/AQAFrontTest.git```
2 Сборка и запуск проекта

# Пред настройки
в Конфиг должны быть добавленны следующие виды спорта Basketball Bandy Soccer и добавленны такие языки как Italian Azerbaijan N.Macedonian
в дефолтный язык добавлено хотябы 1 события из спорта Soccer
# Состов
PageObjects.LoginPage- состоит из основных элементов страницы необходимых для проверки авторизации

Utilit.ConfProperties- позволяет считывать данные из файла для изменения некоторых тестовых данных без изменеия кода напрямую

PageObjects.HighlightsConfig_qaPage- состоит из основных элементов страницы необходимых для проверки функционала основных элкментов также содержит не реализованные элементы

# HMVTest
До начала запуска тестов происходит насторойка окна и пререход по ссылке из conf.properties

После завершения всех тестов происходит выключения созданного окна браузера

loginTest- происходит вход в аккаунт по данным из  conf.properties

addSportTest- проверяется работа левого окна добавления спортов, а именно добавление, сохранеие, выключение, и удаление спортов

addSportTest- проверяется работа изменения даты в окне добавления ивентов, а также добавление ивентов, изменение тегов, сохранение, и удаление тегов

deleteEventTest- удаление ивентов

addLanguageCustom- проверяем изменение языков а именно дабавление сохранение и удаление языков

copyEvent- проверям работу сопирования ивентов из дефолтного языка

# Найденные ошибки
При добавлении языков при слишком большой скорости открытия окны выбора язаков оно изменяет Xpath и перемещается в левый верхний угол

При добавлении языков при выборе языков и нажатии кнопки add добавляется 2 экземпляра одного и того же языка 