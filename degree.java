package chatbot;

public class degree {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = degree.N33c224390(i);
    return p;
  }
  static double N33c224390(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 0;
    } else if (i[0].equals("associates")) {
    p = degree.N478f6b941(i);
    } else if (i[0].equals("bachelors")) {
    p = degree.N2c04cd424(i);
    } else if (i[0].equals("masters")) {
    p = degree.N1976ebf77(i);
    } else if (i[0].equals("phd")) {
    p = degree.N2c8ac50d10(i);
    } 
    return p;
  }
  static double N478f6b941(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (i[1].equals("art")) {
    p = degree.N398219332(i);
    } else if (i[1].equals("science")) {
    p = degree.Nec5d34f3(i);
    } 
    return p;
  }
  static double N398219332(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals("yes")) {
      p = 0;
    } else if (i[2].equals("no")) {
      p = 1;
    } 
    return p;
  }
  static double Nec5d34f3(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 2;
    } else if (i[2].equals("yes")) {
      p = 2;
    } else if (i[2].equals("no")) {
      p = 3;
    } 
    return p;
  }
  static double N2c04cd424(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 4;
    } else if (i[1].equals("art")) {
    p = degree.N106bc09d5(i);
    } else if (i[1].equals("science")) {
    p = degree.N398908226(i);
    } 
    return p;
  }
  static double N106bc09d5(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 4;
    } else if (i[2].equals("yes")) {
      p = 4;
    } else if (i[2].equals("no")) {
      p = 5;
    } 
    return p;
  }
  static double N398908226(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 6;
    } else if (i[2].equals("yes")) {
      p = 6;
    } else if (i[2].equals("no")) {
      p = 7;
    } 
    return p;
  }
  static double N1976ebf77(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 8;
    } else if (i[1].equals("art")) {
    p = degree.N13925b468(i);
    } else if (i[1].equals("science")) {
    p = degree.N5db30e819(i);
    } 
    return p;
  }
  static double N13925b468(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 8;
    } else if (i[2].equals("yes")) {
      p = 8;
    } else if (i[2].equals("no")) {
      p = 9;
    } 
    return p;
  }
  static double N5db30e819(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 10;
    } else if (i[2].equals("yes")) {
      p = 10;
    } else if (i[2].equals("no")) {
      p = 11;
    } 
    return p;
  }
  static double N2c8ac50d10(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 12;
    } else if (i[1].equals("art")) {
    p = degree.N20dba3811(i);
    } else if (i[1].equals("science")) {
    p = degree.N344895412(i);
    } 
    return p;
  }
  static double N20dba3811(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 12;
    } else if (i[2].equals("yes")) {
      p = 12;
    } else if (i[2].equals("no")) {
      p = 13;
    } 
    return p;
  }
  static double N344895412(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 14;
    } else if (i[2].equals("yes")) {
      p = 14;
    } else if (i[2].equals("no")) {
      p = 15;
    } 
    return p;
  }
}

