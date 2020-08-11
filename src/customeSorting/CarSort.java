package customeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;    
import java.util.ListIterator;

public class CarSort implements Comparable<CarSort>{

    String name;
    Colors color;

    public CarSort(String name, Colors color){
        this.name = name;
        this.color = color;
    } 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Colors getColor() {
        return color;
    }
    public void setColor(Colors color) {
        this.color = color;
    }

    //Implement the natural order for this class
    public int compareTo(CarSort c)
    {
        return getName().compareTo(c.getName());
    }

    static class ColorComparator implements Comparator<CarSort>
    {
        public int compare(CarSort c1, CarSort c2)
        {
            return c1.getColor().compareTo(c2.getColor());
        }
    }

    public enum Colors {
    	BLUE,RED, SILVER, MAGENTA,A,B,C,D
    }

     public static void main(String[] args)
     {
         List<CarSort> carList = new ArrayList<CarSort>();

         carList.add(new CarSort("Ford Figo",Colors.SILVER));
         carList.add(new CarSort("Ford Figo2",Colors.SILVER));
         carList.add(new CarSort("Santro",Colors.BLUE));
         carList.add(new CarSort("Santr2",Colors.BLUE));
         carList.add(new CarSort("Honda Jazz",Colors.MAGENTA));
         carList.add(new CarSort("Indigo V2",Colors.RED));
         carList.add(new CarSort("Honda D",Colors.D));
         carList.add(new CarSort("Indigo A",Colors.A));
         carList.add(new CarSort("Honda B",Colors.B));
         carList.add(new CarSort("Indigo C",Colors.C));
        
         Collections.sort(carList, new ColorComparator());
         ListIterator<CarSort> itr=carList.listIterator();
         while (itr.hasNext()) {
            CarSort carSort = (CarSort) itr.next();
            System.out.println("car name"+carSort.name+" Car colors: "+carSort.getColor());
        }
     }
}