package com.glybovskij.introductionInOOP;

/**
 * Задание 1
 * <p>
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * <p>
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * <p>
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * <p>
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * <p>
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем,
 * его этажах, квартирах и комнатах, вызывая методы print.
 */
public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room[] studioRooms = {room1, room2, room2};
        Room[] twoRoomedFlat = {room1, room1, room2, room2};
        Room[] threeRoomed = {room1, room1, room2, room2, room2};

        Apartment studioApartment1 = new Apartment(1, studioRooms);
        Apartment studioApartment2 = new Apartment(4, studioRooms);
        Apartment studioApartment3 = new Apartment(7, studioRooms);

        Apartment twoRoomedApartment1 = new Apartment(2, twoRoomedFlat);
        Apartment twoRoomedApartment2 = new Apartment(5, twoRoomedFlat);
        Apartment twoRoomedApartment3 = new Apartment(8, twoRoomedFlat);

        Apartment threeRoomedApartment1 = new Apartment(3, threeRoomed);
        Apartment threeRoomedApartment2 = new Apartment(6, threeRoomed);
        Apartment threeRoomedApartment3 = new Apartment(9, threeRoomed);

        Apartment[] apartments1 = {studioApartment1, twoRoomedApartment1, threeRoomedApartment1};
        Apartment[] apartments2 = {studioApartment2, twoRoomedApartment2, threeRoomedApartment2};
        Apartment[] apartments3 = {studioApartment3, twoRoomedApartment3, threeRoomedApartment3};

        Floor firstFloor = new Floor(1, apartments1);
        Floor secondFloor = new Floor(2, apartments2);
        Floor thirdFloor = new Floor(3, apartments3);

        Floor[] floors = {firstFloor, secondFloor, thirdFloor};

        Home home = new Home(32, floors);

        printAllInformation(home);
    }

    public static void printAllInformation(Home home) {
        home.print();
        for (Floor floor : home.getFloors()) {
            floor.print();
            for (Apartment apartment : floor.getApartment()) {
                apartment.print();
                for (Room room : apartment.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
