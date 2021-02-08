package com.hortsmann.chapter2;

import java.util.Objects;

//класс описывающий точку на плоскости
public class Point {
    //    поле для координаты X
    private double x;
    //    поле для координаты Y
    private double y;

    //    конструктор, задающий конкретную точку
    public Point(double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    //    конструтор, задающий точку в начале координат
    public Point() {
        this(0, 0);
    }

    //    модифицирующий метод, перемещающий точку на определенное расстояние в направлении координат X и Y
    public void translate(double X, double Y) {
        this.x += X;
        this.y += Y;
    }

//    //   метод доступа, перемещающий точку на определенное расстояние в направлении координат X и Y
//    public static Point translate(Point point, double X, double Y) {
//        if (point == null) {
//            throw new IllegalArgumentException("Point cannot be equal null");
//        }
//        point.x += X;
//        point.y += Y;
//        return point;
//    }

    //    модифицирующий метод, позволяющий изменить масштаб по обеим координатам на задданный коэффициент
    public void scale(double scale) {
        this.x *= scale;
        this.y *= scale;
    }

//    //    метод доступа, позволяющий изменить масштаб по обеим координатам на задданный коэффициент
//    public static Point scale(Point point, double scale) {
//        if (point == null) {
//            throw new IllegalArgumentException("Point cannot be equal null");
//        }
//
//        point.x *= scale;
//        point.y *= scale;
//        return point;
//    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

}
