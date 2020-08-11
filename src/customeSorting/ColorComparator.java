package customeSorting;

import java.util.Comparator;

public  class ColorComparator implements Comparator<CarSort>
{
    public int compare(CarSort c1, CarSort c2)
    {
        return c1.getColor().compareTo(c2.getColor());
    }
}