import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;
import java.security.SecureRandom;
public class KapitelFourDemos {
    static class FourPointTwoCaseStudy {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Provide the XY coordinates of the three points");
            System.out.println("1 XY: ");
            double x1 = Double.parseDouble(scan.nextLine());
            double y1 = Double.parseDouble(scan.nextLine());
            System.out.println("2 XY: ");
            double x2 = Double.parseDouble(scan.nextLine());
            double y2 = Double.parseDouble(scan.nextLine());
            System.out.println("3 XY: ");
            double x3 = Double.parseDouble(scan.nextLine());
            double y3 = Double.parseDouble(scan.nextLine());

            //compute the sides
            double a = Math.sqrt((x2-x3) * (x2-x3) + (y2 - y3) * (y2 - y3));
            double b = Math.sqrt((x1-x3) * (x1-x3) + (y1 - y3) * (y1 - y3));
            double c = Math.sqrt((x1-x2)*(x1 - x2) + (y1 -y2) * (y1 -y2));


            //compute the three angles

            double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
            double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
            double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

            System.out.println("The three angles are " +
                    Math.round(angleA * 100) / 100.0 + " " +
                    Math.round(angleB * 100) / 100.0 + " " +
                    Math.round(angleC * 100) / 100.0 + " ");
        }
    }
    static class FourPointTwoCheckPoint {
        public static void main(String[] args) {
            ;
            SecureRandom ran = new SecureRandom();
            long unixTime = System.currentTimeMillis();
            System.out.println(unixTime);
            System.out.println(Math.sqrt(4)); // Square root of 4 returns 2
            System.out.println(Math.sin(2 * Math.PI)); //
            System.out.println(Math.cos(2 * Math.PI));
            System.out.println(Math.pow(2, 2));
            System.out.println(Math.log(Math.E));
            System.out.println(Math.exp(1));
            System.out.println(Math.max(2, Math.min(3, 4)));
            System.out.println(Math.rint(-2.5));
            System.out.println(Math.ceil(-2.5));
            System.out.println(Math.floor(2-5));
            System.out.println(Math.round(-2.5f));
            System.out.println(Math.round(-2.5));
            System.out.println(Math.rint(2.5));
            System.out.println(Math.ceil(2.5));
            System.out.println(Math.floor(2.5));
            System.out.println(Math.round(2.5f));
            System.out.println(Math.round(2.5));
            System.out.println(Math.round((Math.abs(-2.5))));
            //4.2.4
            double angle = Math.toDegrees(Math.PI);
            System.out.println(angle);
            //4.2.5
            System.out.println("HERE");
            int randomSmall = (int)(34 + (Math.random() * 22));
            System.out.println(randomSmall);
            int randomBig = (int) (Math.random()*1000);
            System.out.println(randomBig);
            double randomDouble = 5.5 + (Math.random() * 55.5);
            System.out.println(Math.round(randomDouble*100)/100.0);
            //4.2.6 part of the lang package

            //4.2.7
            System.out.println(Math.log(Math.exp(5.5)));
            System.out.println(Math.exp(Math.log(5.5)));
            System.out.println(Math.asin(Math.sin(Math.PI / 6)));
            System.out.println(Math.round(Math.sin(Math.asin(Math.PI / 6)) * 100) /100.0);
        }
    }
    static class FourPointThreeCheckPoint {

        public static void main(String[] args) {
    /*
    4.3.1
    Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'.
    Use print statements to find out the character for the decimal codes 40, 59, 79, 85,
    and 90. Use print statements to find out the character for the hexadecimal code 40,
    5A, 71, 72, and 7A.
     */

            System.out.println((int) '1');
            System.out.println((int) 'A');
            System.out.println((int) 'B');
            System.out.println((int) 'a');
            System.out.println((int) 'b');

            System.out.println((char) 49);
            System.out.println((char) 59);
            System.out.println((char) 79);
            System.out.println((char) 85);

            System.out.println((char) 0x40);
            System.out.println((char) 0x5A);
            System.out.println((char) 71);
            System.out.println((char) 72);
            System.out.println((char) 0x7A);

    /*
    4.3.2
    Which of the following are correct literals for characters?
                          '1' THIS, '\u345dE', '\u3fFa', '\b', '\t'
     */
            System.out.println('1');
            System.out.println('\u3fFa');
            System.out.println('\b');
            System.out.println('\t');

            // 4.3.3 How do you display the characters \ and "?

            System.out.println("\\ ");
            System.out.println("\"");

            // 4.3.4
            int i = '1';
            int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
            int k = 'a';
            char c = 90;
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(c);

            /*
            4.3.5 Can the following conversions involving casting be allowed? If so, find the converted result.
             */
            char ch = 'A';
            System.out.println(ch);
            int in = (int) c;
            System.out.println(in);
            float f = 1000.34f;
            int  ii = (int)f;
            System.out.println(ii);
            double d = 1000.34;
            int iii = (int)d;
            System.out.println(iii);
            int iiii = 97;
            char cc = (char) iiii;
            System.out.println(cc);

            // 4.3.7
            int randomLowerCase = (int)(Math.random() * 26 + 'a');
            System.out.println((char) randomLowerCase);

            // 4.3.8 Show the output of the following statements:
            System.out.println('a' < 'b');
            System.out.println('a' == 'A');
            System.out.println('a' > 'b');
            System.out.println('a' >= 'A');
            System.out.println('a' == 'a');
            System.out.println('a' != 'b');
        }
        // 4.3.6 Show the output of the following program:
        public static class Test {
            public static void main(String[] args) {
                char x = 'a';
                char y = 'c';
                System.out.println(++x);
                System.out.println(y++);
                System.out.println(x - y);
            }
        }

    }
    static class FourPointFourCheckPoint {
        static class PointOne {
            public static void main(String[] args) {
                String s1 = "Welcome to Java";
                String s2 = "Programming is fun";
                String s3 = "Welcome to Java";

                System.out.println(s1==s2);           System.out.println(s1.lastIndexOf("o", 15));
                System.out.println(s2==s3);           System.out.println(s1.length());
                System.out.println(s1.equals(s2));    System.out.println(s1.substring(5));
                System.out.println(s2.equals(s3));    System.out.println(s1.substring(5,11));
                System.out.println(s1.compareTo(s2)); System.out.println(s1.startsWith("Wel"));
                System.out.println(s2.compareTo(s3)); System.out.println(s1.endsWith("Java"));
                System.out.println(s3.compareTo(s2)); System.out.println(s1.toLowerCase());
                System.out.println(s1.charAt(0));     System.out.println(s1.toUpperCase());
                System.out.println(s1.indexOf('j'));  System.out.println(s1.concat(s2));
                System.out.println(s1.indexOf("to")); System.out.println(s1.contains(s2));
                System.out.println(s1.lastIndexOf('a')); System.out.println("\t Wel \t");
            }
        }
        static class PointTwo {
            public static void main(String[] args) {
                String s1 = "Welcome to Java";
                String s2 = "Programming is fun";

                System.out.println(s1.compareTo(s2));



            }

        }
        static class PointThree {
            public static void main(String[] args) {


                System.out.println("1" + 1); //String contecation
                System.out.println('1' + 1); //char ascii added to 1
                System.out.println("1" + 1 + 1); //hvert element behandles some string
                System.out.println("1" + (1 + 1)); //først beregnes 1+1, og så behandles resultatet som string
                System.out.println('1' + 1 + 1);
            }

        }
        static class PointFour {

            public static void main(String[] args) {
                System.out.println(1 + "Welcome " + 1 + 1);
                System.out.println(1 + "Welcome " + (1 + 1));
                System.out.println(1 + "Welcome " + ('\u0001' + 1));
                System.out.println('1' + 1 + 1);
            }

        }
        static class PointFive {

            public static void main(String[] args) {
                String s1 = " Welcome ";
                String s2 = " welcome ";

                //a
                Boolean isEqual = s1.equals(s2);
                System.out.println(isEqual);
                //b
                isEqual = s1.equalsIgnoreCase(s2);
                System.out.println(isEqual);
                //c
                int x = s1.compareTo(s2);
                System.out.println(x);
                //d
                x = s1.compareToIgnoreCase(s2);
                System.out.println(x);
                //e
                Boolean b = s1.startsWith("AAA");
                System.out.println(b);
                //f
                b = s1.endsWith("AAA");
                System.out.println(b);
                //g
                x = s1.length();
                System.out.println(x);
                //h
                char c = s1.charAt(0);
                System.out.println(c);
                //i
                String s3 = s1 + s2;
                System.out.println(s3);
                //j
                s1.substring(1);
                System.out.println(s1);
                //k
                System.out.println(s1.substring(1,4));
                //l
                String s4 = s1.toUpperCase();
                //m
                String s5 = s3.trim();
                System.out.println(s5);





            }

        }
        static class PointSix {
            public static void main(String[] args) {
                int i = 10;
                Integer.toString(i).length();
            }

        }
        static class PointSeven {
            public static void main(String[] args) {
                double d = 10.0;
                Double.toString(d).length();
            }

        }

    }
}
