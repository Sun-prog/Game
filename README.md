# Game
В игре (класс Play) можно задать координаты Х,Y нашего бота (класс MyBot) и задать несколько клеток с золотом (класс Gold) с координатами. 
Боту можно задать метод go и передать все значения списка allGold и объекты-конкуренты (MyBot)(с конкурентами пока не реализовано)


Бот в методе go посчитает расстояния до всех переданных Gold, выберет наименьшее и сходит на один шаг к своей цели. На следующий шаг сделает то же самое.
