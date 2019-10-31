# Project3
Project 3 implements the use of HashMap to store/retrieve/sort values. This project also works with the Date and Calendar imports to convert and sort the different dates in multiple formats. The problem with java.util.Date is that many of the  original method calls have been deprecated, so I had to change to Calendar and figure out how to solve the task in a different way. It was also very important that DateTimeFormat and SimpleDateFormat were used correctly in the right places so you could get the intended output. Sorting with HashMap wasn't to bad when it was just retrieving the key but retrieving value required more thinking/problem solving. 
## Problem Solving Approach
My problem solving approach was first to go through the main/driver class and whenever I saw a method or class was being called I would create said method/class and solve it for the intended output. Whenever I completed a class I used JUnit to test the methods for the correct output and went back to rework if the JUnit test failed.
# MesoDateTimeOneAbstract Class
public abstract class MesoDateTimeOneAbstract
### Methods
```
abstract int getValueOfSecond();

```
  abstract method getValueOfSecond
```
abstract void dateTimeNow();
```
  abstract method dateTimeNow
```  
abstract void sleepForFiveSec();
```
  abstract method sleepForFiveSec
```
abstract void dateTimeOfOtherCity();
```
  abstract method dateTimeOfOtherCity
```
abstract void dateTimeDifferentZone();
```
  abstract method dateTimeDifferent Zone
```
abstract void timeZoneHashMap();
```
  abstract method timeZoneHashMap


# DateTimeOne Class
public class DateTimeOne extends MesoDateTimeOneAbstract 
### Imports and Variables
```
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
```
First HashMap with initial TimeZones
```
HashMap<String, String> timeZoneMap1 = new HashMap<String, String>();
```
Second HashMap with first sorted TimeZones	
```
HashMap<String, String> timeZoneMap2 = new HashMap<String, String>();
```
### Methods
```
public int getValueOfSecond()

```
  Uses java.util.Date and SimpleDateFormatter to get the current seconds value on the computers clock
```
public void dateTimeNow() 
```
  Uses java.util.Date and SimpleDateFormatter to get the current date and time
```  
public void sleepForFiveSec() 
```
  sleeps the program for five seconds
```
public void dateTimeOfOtherCity() 
```
   Uses java.util.Date and SimpleDateFormatter to get current date and time on server as well as in BST, GMT, and CST timezones.
```
public void dateTimeDifferentZone() 
```
  Uses SimpleDateFormat to format date in different timezones and put them into the timeZoneMap1 hashmap
```
public void timeZoneHashMap() 
```
  Puts ZST and AST timezones into the HashMap and sorts the HashMaps timeZoneMap1 and timeZoneMap2 into different formatting styles.


# MesoStation Class
public class MesoStation 
### Variables
```
	private String stID;
```

### Methods
```
public MesoStation(String stId)

```
  Constructor for MesoStation. Sets stId to stId
```
public String getStID() 
```
  returns stId


# MesoSortedAbstract Class
public abstract class MesoSortedAbstract
### Imports
```
import java.util.HashMap;
import java.util.Map;
```

### Methods
```
abstract Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted);

```
  abstract method Map sortedMap with key of type String and value of type Integer


# MesoAsciiAbstract Class
public abstract class MesoAsciiAbstract
### Imports
```
import java.io.FileNotFoundException;
```

### Methods
```
abstract int calAverage();

```
  abstract method calAverage of type int
  
# MesoAsciiVal Class
public class MesoAsciiCal extends MesoAsciiAbstract 
### Variables
```
private MesoStation mesoStation;
private int[] stationArray = new int[3];
private int NRMNAverage = 79;
```
### Methods
```
public MesoAsciiCal(MesoStation mesoStation) 

```
  Assigns mesoStation to mesoStation
```
int calAverage() 
```
  Calculated mesoStation id's ceiling, floor, and average, then assigns them to each index of stationArray. Calculates finalNum, the average of the new stationId and the NRMN station then returns finalNum.
  
  
# DateTimeTwo Class
public class DateTimeOne extends MesoDateTimeOneAbstract 
### Imports and Variables
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

private String tenthDay;
private String eighteenthDay;
private String fifteenthDay;
private String lastDay;

```
Hashmap map with key set to LocalDate and value set to Integer
```
private HashMap<LocalDate, Integer> map = new HashMap<LocalDate, Integer>();
```
### Methods
```
public void daysOfCurrentMonth()

```
  Uses java.util.Calendar and SimpleDateFormat to calculate the tenth and eighteenthDay of the current month
```
public void daysOfAnyMonth(int month, int year)
```
  Passes in certain month and year to get the fifteenth day and lastDay of that current date. Uses java.util.Calendar and SimpleDateFormatter.
```  
public void compareYear() throws IOException
```
  Uses java.util.Calendar and LocalDate to calculate if the given date is a leap year, then determines the difference between the each date read in from Dates.txt and the current date.
```
public void dateHashMap()
```
   Puts each date from the Dates.txt file into the HashMap map.
```
public void dateHashMapSorted()
```
  Creates a new HashMap of type TreeMap in order to sort the original HashMap map


# MesoEquivalent Class
public class DateTimeOne extends MesoDateTimeOneAbstract 
### Imports and Variables
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
	
private String stId;
ArrayList<String> nameArray;
```
Hashmap asciiVal with key set to String and value set to Integer
```
private HashMap<String, Integer> asciiVal = new HashMap<String, Integer>();
```
### Methods
```
public MesoEquivalent(String stId)

```
  The constructor for MesoEquivalent. Assigns stId to stId.
```
public HashMap<String, Integer> calAsciiEqual() throws IOException 
```
  Instantiates ArrayList nameArray. Creates object asciiAverage from class MesoAsciiVal. Reads through each line of data int Mesonet.txt and checks each name if they are equivalent to asciiAverage, if equivalent then that name is put into HashMap asciiVal.
  
  
# MesoLexicographical Class
public class MesoLexicographical extends MesoSortedAbstract
### Imports and Variables
```
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
```
Hashmap asciiVal with key set to String and value set to Integer
```
HashMap<String, Integer> asciiVal = new HashMap<String, Integer>();
```
### Methods
```
public MesoLexicographical(HashMap<String, Integer> asciiVal) 
```
  Calls sortedMap method then prints each key of the map
```
Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
```
  Passes in the unsorted map into a TreeMap to sort, returns sortedMap
  

# DateSortingUsingAlgorithm Class
public class DateSortingUsingAlgorithm
### Imports and Variables
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map.Entry;
```
Hashmap map with key set to Calendar and value set to Integer
```
private HashMap<Calendar, Integer> map = new HashMap<Calendar, Integer>();
```
### Methods
```
public void dateHashMapSortedDescending() throws IOException
```
  Uses java.util.SimpleDateFormat to format dates read in from SortingDates.java and turn them into dates. puts each date into HashMap map and then sorts map into descending order.
```
public void dateHashMapSorted() throws IOException
```
    Uses java.util.SimpleDateFormat to format dates read in from SortingDates.java and turn them into dates. puts each date into HashMap map and then sorts map into ascending order.
