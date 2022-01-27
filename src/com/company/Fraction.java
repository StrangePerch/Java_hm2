package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction multiply(Fraction fraction)
    {
        return new Fraction(numerator * fraction.numerator, denominator * fraction.denominator);
    }

    public Fraction multiply(int number)
    {
        return new Fraction(numerator * number, denominator);
    }

    public double multiply(double number)
    {
        return numerator * number / denominator;
    }

    public Fraction divide(Fraction fraction)
    {
        return new Fraction(numerator * fraction.denominator, numerator * fraction.denominator);
    }

    public Fraction divide(int number)
    {
        return new Fraction(numerator, denominator * number);
    }

    public double divide(double number)
    {
        return numerator / (denominator * number);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
