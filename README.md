# BarrenLandAnalysis
Target interview case study #2
You have a farm of 400m by 600m where coordinates of the field are from (0, 0) to (399, 599). A portion of the farm is barren, and all the barren land is in the form of rectangles. Due to these rectangles of barren land, the remaining area of fertile land is in no particular shape. An area of fertile land is defined as the largest area of land that is not covered by any of the rectangles of barren land. 

Read input from STDIN. Print output to STDOUT 

Input 

You are given a set of rectangles that contain the barren land. These rectangles are defined in a string, which consists of four integers separated by single spaces, with no additional spaces in the string. The first two integers are the coordinates of the bottom left corner in the given rectangle, and the last two integers are the coordinates of the top right corner. 

Output 

Output all the fertile land area in square meters, sorted from smallest area to greatest, separated by a space. 

| Sample Input | Sample Output |
| --- | --- |
| {“0 292 399 307”} | 116800  116800 |
| {“48 192 351 207”, “48 392 351 407”, “120 52 135 547”, “260 52 275 547”} | 22816 192608 |

## Build, Test and Run application
##### Building and Running
The easiest method to build and run the application is as follows:
- Download **Netbeans 8.2 IDE**
- Either download the repository zip or use git commands to clone the project **URL: https://github.com/BryceSuchy/BarrenLandAnalysis**
- In Netbeans after the project is opened, the project structure should show any libraries that are used. If the libraries do not show up you can simply add them by right clicking Libraries and adding the libraries below. Otherwise you can download the jar files and set the classpaths to compile and run in the command prompt.

##### Testing
When the project successfully builds and runs, the user will be allowed to enter an input such as 0 292 399 307 which should then return 116800 116800 and it should also run a few unit tests.
 
## External Libraries
Java JDK 1.8.0 - Download Link https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

JUnit 4.12 - Download Link https://junit.org/junit4/

Hamcrest 1.3 - Download Link https://search.maven.org/search?q=g:org.hamcrest
