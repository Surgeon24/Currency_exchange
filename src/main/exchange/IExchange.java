package main.exchange;

import main.currency.ICurrency;

public interface IExchange {
    //function that calculates the amount of the new currency based on the old currency and its amount
    public double exchange(ICurrency src, ICurrency tgt, double amt);
}
