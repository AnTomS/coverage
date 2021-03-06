# coverage
# Домашнее задание к занятию «1.3. Управляющие конструкции. Функции»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

**Важно**: ознакомьтесь со ссылками на главной странице [репозитория с домашними заданиями](../README.md).

Если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

Не делайте ДЗ всех занятий в одном репозитории! Иначе потом будет сложно подключать системы Continuous Integration.

## Как сдавать задачи

1. Создайте на вашем компьютере Gradle-проект.
1. Инициализируйте в нём пустой Git-репозиторий.
1. Добавьте в него готовый файл [.gitignore](../.gitignore).
1. Добавьте в этот же каталог остальные необходимые файлы.
1. Сделайте необходимые коммиты.
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым.
1. Сделайте пуш и удостоверьтесь, что ваш код появился на GitHub.
1. Ссылку на ваш проект отправьте из личного кабинета на сайте [netology.ru](https://netology.ru).
1. Необязательные задачи можно не сдавать — это не повлияет на получение зачёта. В этом ДЗ все задачи обязательные.

## Задача №2 - Разная комиссия

В прошлый раз мы рассматривали упрощённый вариант вычисления комиссии. Пришла пора сделать нормальный.

Q: Почему?

A: Потому что так дешевле пользователям. За MasterCard и Maestro вообще не нужно платить пока не превысили лимит (замечание `от 300` убираем), а для VK Pay всегда бесплатно:

![](pic/vk-commission.png)

Напишите алгоритм расчёта в виде функции, передавая в функцию:
1. Тип карты/счёта (по умолчанию - Vk Pay).
1. Сумму предыдущих переводов в этом месяце (по умолчанию - 0).
1. Сумму совершаемого перевода.

Функция по-прежнему должна возвращать комиссию в копейках.

Итог: у вас должен быть репозиторий на GitHub, в котором будет ваш Gradle-проект.
